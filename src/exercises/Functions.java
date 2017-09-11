package exercises;

public class Functions {
	public static void main(String args[]) {
		Functions main = new Functions();
		int result = main.somarDig(123);
		System.out.println(result);
	}
	
	public float sum(float a, float b) {
		return a+b;
	}
	
	public float subtract(float a, float b) {
		return a-b;
	}
	
	public float mult(float a, float b) {
		return a*b;
	}
	
	public float div(float a, float b) {
		return a/b;
	}
	
	public float custo(float value) {
		float fabricCost = 10000;
		float distributorPercent = 0.28F;
		float taxPercent = 0.45F;
		
		return fabricCost + (fabricCost*distributorPercent) + (fabricCost*taxPercent);		
		
	}
	
	public int somarDig(int dig) {
		
		int soma = 0;
		while(dig!=0) {
			
			soma += dig % 10;
			dig  = dig / 10;
		}
		
		return soma;
		
	}
}
