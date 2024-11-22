package HomeWorks;

import java.util.*;

public class ElementRemoval {
	/*
	 * Given an integer array A of size N. You can remove any element from the array in one operation.
	 * The cost of this operation is the sum of all elements in the array present before this operation.
	 * Find the minimum cost to remove all elements from the array.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		for(int i=0;i<size;i++) {
			A.add(sc.nextInt());
		}
		System.out.println(solve(A));
		sc.close();
	}
	public static int solve(ArrayList<Integer> A) {
		int answer=0;
		Collections.sort(A);
		for(int i=0;i<A.size();i++) {
			System.out.println(A.get(i));
		}
		return 0;
	}

}
