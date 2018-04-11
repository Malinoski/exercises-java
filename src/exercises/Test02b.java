package exercises;

public class Test02b {
	
	public static void main(String args[]) {
		
		int maxWeight = 100;
		int packageWeight[] = {110,120,70,10,20,60,20};
		int result = new Test02b().minimumTrips(maxWeight, packageWeight);
		System.out.println("\nResult:"+result);
	}
	
	public int minimumTrips(int maxWeight, int [] packageWeight) {
		
		// Asc order
		int array[] = packageWeight;
		for(int i=0; i< array.length; i++) {
			boolean hasChange = false;
			for(int j=0;j< (array.length-1);j++ ) {
				if (array[j]<array[j+1]) {
					hasChange = true;
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
			if(!hasChange) {
				break;
			}
		}
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// Search tuples (if odd/impar, the middle guy will be alone)
		int trips = 0;
		int lastIndex = array.length-1;
		for(int j=0;j<=lastIndex; j++) {
			
			if(array[j]<maxWeight) { // only permitted values
				
				if(j!=lastIndex) {
					System.out.println("("+array[j] + "," + array[lastIndex]+")");					
				}else {
					System.out.println("("+array[j]+")"); // alone here
				}
				lastIndex--;
				trips++;
			}
		}
		
		return trips;
	}
	
}
