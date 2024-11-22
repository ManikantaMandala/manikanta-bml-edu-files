package Scaler;

import java.util.*;

public class NobleInteger {
	/*
	 * Given an integer array A, 
	 * find if an integer p exists in the array such that the number of integers 
	 * greater than p in the array equals p.
	 * 
	 * Approach:
	 * If we just sort the array then it will be "easy piss"
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		for(int i=0;i<size;i++) {
			A.add(sc.nextInt());
		}
		System.out.println(solve(A));
		sc.close();
	}
	public static int solve(ArrayList<Integer> A) {
		Collections.sort(A);
		for(int i=0;i<A.size();i++) {
			if(A.get(i)==A.size()-i-1) return 1;
		}
		return -1;
	}

}
