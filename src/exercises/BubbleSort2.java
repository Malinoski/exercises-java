package exercises;

import java.util.*;

public class BubbleSort2 {

	public static void main(String[] args) {

		// Scanner in = new Scanner(System.in);
		// int n = in.nextInt();
		// int[] ar = new int[n];
		// for(int ar_i = 0; ar_i < n; ar_i++){
		// ar[ar_i] = in.nextInt();
		// }

		int ar[] = { 4, 2, 6, 3, 8, 6, 9 };
		int n = ar.length;
		for (int k = 0; k < n; k++) {
			System.out.print(ar[k] + " ");
		}
		System.out.println();

		// Asc
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (i != j) {
					if (ar[j] > ar[j + 1]) {
						int temp = ar[j + 1];
						ar[j + 1] = ar[j];
						ar[j] = temp;
						// Print here to see each step //
					}
				}
			}
		}
		for (int k = 0; k < n; k++) {
			System.out.print(ar[k] + " ");
		}
		System.out.println();

		// Desc
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (i != j) {
					if (ar[j] < ar[j + 1]) {
						int temp = ar[j + 1];
						ar[j + 1] = ar[j];
						ar[j] = temp;
						// Print here to see each step //
					}
				}
			}
		}
		for (int k = 0; k < n; k++) {
			System.out.print(ar[k] + " ");
		}
		System.out.println();

	}
}
