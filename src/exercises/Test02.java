package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test02 {
	
	public class Dr implements Comparable<Dr>{
		private Integer id;
		private int range;
		
		public Dr(int id, int range) {
			this.setId(id);
			this.setRange(range);
		}

		public String toString() {
			return String.valueOf("id:"+this.getId()+" range:"+this.getRange());
		}
		
		public int getRange() {
			return range;
		}

		public void setRange(int range) {
			this.range = range;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}		

		@Override
		public int compareTo(Dr o) {
			if(o instanceof Dr) {
				Dr other = (Dr)o;
				if (this.getRange() < other.getRange()) {
		            return -1;
		        }
		        if (this.getRange() > other.getRange()) {
		            return 1;
		        }
			}
			return 0;
		}		
		
	}
	
	public static void main(String args[]) {
		
		Integer numberOfDr = 3;
		
		List<Dr> drs = new ArrayList<>();
		Test02 container = new Test02();
		drs.add(container.new Dr(4,11));
		drs.add(container.new Dr(2,15));
		drs.add(container.new Dr(5,16));
		drs.add(container.new Dr(3,40));
		drs.add(container.new Dr(1,20));
		drs.add(container.new Dr(9,60));
		drs.add(container.new Dr(6,22));
		
		List<Integer> maintance = new ArrayList<>(Arrays.asList(1,5,9));
		
		Test02.solution(numberOfDr, drs, maintance);
	}
	
	public static List<Integer> solution(Integer numberOfDr, List<Dr> drs, List<Integer> maintance) {
		
		List<Integer> result = new ArrayList<Integer>();

		// Asc
		// Collections.sort()
		
		// Desc
		Collections.sort(drs,Collections.reverseOrder());
		System.out.println(drs);		
		
		int acceptedNumDrs = 0; 
		for (Dr dr : drs) {
			
			if(!maintance.contains(dr.getId())) {
				result.add(dr.getId());
				acceptedNumDrs++;
				
				if(acceptedNumDrs==numberOfDr) {
					break;
				}
			}
			
		}
		
		System.out.println(result);
		
		
		return result;
		
	}
}
