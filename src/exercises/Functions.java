package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Functions {
	public static void main(String args[]) {
		Functions main = new Functions();
		
		// boolean result = main.compare("iuri", "iuri");
		// List<Integer> result = main.loadListAsc(1, 5);
		
		float result = main.listSumContent(Arrays.asList(1,2,3,4));
		
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
	
	public boolean compare(String a, String b) {
		return a.equals(b);
	}
	
	public int somarDig(int dig) {

		
		int soma = 0;
		while(dig!=0) {
			
			soma += dig % 10;
			dig  = dig / 10;
		}
		
		return soma;
		
	}
	
	public List<Integer> loadListAsc(int ini, int end){
		
		List<Integer> list = new ArrayList<Integer>();
		while(ini<=end) {
			list.add(ini);
			ini++;
		}
		return list;
	}
	
	public float listSumContent(List<Integer> list) {
		float result = 0;
		
		if(!list.isEmpty()) {
			int size = list.size();
			for(int i=0;i<size;i++) {
				result += list.get(i);
			}
		}	
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
