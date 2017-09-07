
public class BubbleSort {

	public static void main (String args[]) {
		
		int array[] = new int[] {1,6,3,8,45,6,3,2};
		int temp;		
		int iterations = 0;		
		boolean hasChange = false;
		
		for(int i=0;i<array.length;i++) {			
			
			iterations++;
			for(int j=0;j<array.length-1; j++) {
				if(array[j]>array[j+1]) {
					hasChange = true;
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
			
			if(!hasChange) {
				break;
			}
		}
		
		System.out.println("Iterations: "+iterations);
		for(int k=0; k<array.length; k++) {
			System.out.print(array[k]+" ");
		}
		
	}
	
}
