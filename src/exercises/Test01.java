package exercises;

public class Test01 {

	public static void main(String args[]) {
		
		// Google Drive: Estudos Livros > Java > exercises-java - Test01
		
		int [] ar = {-1,0,-3};
		// int [] ar = {1, 5, 2, 3, 2, 3, 3};
		Test01.test01(ar);
		
	}
	
	public static int test01(int [] ar) {
		
		// order (bubble)
		int n = ar.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1;j++){
                if(i!=j){
                    if(ar[j]>ar[j+1]){
                        int temp = ar[j+1];
                        ar[j+1] = ar[j];
                        ar[j] = temp;
                        // Print here to see each step //
                    }                    
                }
            }            
        }
        
//        for(int k=0;k<n;k++){
//          System.out.print(ar[k]+" ");
//        }
        
        int small = ar[0]+1; // considering N is between 1 and 100k
        if(small==0) {
        		small++;
        }
        
		for(int i=1;i<ar.length;i++) {		
			
			if(small>=ar[i]) {
				small = ar[i]+1;
			}
			
		}
		
		System.out.println(small);
		
		return 0;
	}
	
}
