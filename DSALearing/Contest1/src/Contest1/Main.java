package Contest1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int rowSize = sc.nextInt(), colSize = sc.nextInt(), Qsize = sc.nextInt(),count = 1;
		ArrayList<ArrayList<Integer>> qMatrix = new ArrayList<>(), nmMatrix = new ArrayList<>();
		for(int i=0; i < rowSize; i++) {
			nmMatrix.add(new ArrayList<>());
			for(int j = 0; j < colSize; j++) {
				nmMatrix.get(i).add(count++);
			}
		}
		for (int q = 0 ; q< Qsize; q++) {
			qMatrix.add(new ArrayList<>()); 
			qMatrix.get(q).add(sc.nextInt());
			if(qMatrix.get(q).get(0)==1||qMatrix.get(q).get(0)==2){
				for (int i = 0 ; i < 2 ;i++)
					qMatrix.get(q).add(sc.nextInt());
			}
			else{
				for (int i = 0 ; i < 4 ; i++)
					qMatrix.get(q).add(sc.nextInt());
			}
		}
		System.out.println(qMatrix);
		sc.close();
	}

}
