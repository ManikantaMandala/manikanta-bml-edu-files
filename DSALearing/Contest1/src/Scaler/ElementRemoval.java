package Scaler;
import java.util.*;

public class ElementRemoval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList<Integer> A= new ArrayList<>();
		for(int i=0;i<size;i++) {
			A.add(sc.nextInt());
		}
		System.out.println(solve(A));
		sc.close();
	}
	public static int solve(ArrayList<Integer> A) {
		int answer =0;
		Collections.sort(A);
		for(int i=0;i<A.size();i++) {
			answer+=(A.size()-i)* A.get(i);
			System.out.println(A.get(i)+ " "+ answer);
		}
		return answer;
	}

}
