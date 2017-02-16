import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class EntranceExam {

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			List<Long> marks = new ArrayList<Long>();
			int n = in.nextInt();
			int k =in.nextInt();
			int e = in.nextInt();
			int m = in.nextInt();
			long sum = 0;
			for(int i=1;i<n;i++){
				sum = 0;
				for(int j=1;j<=e;j++){
					int a = in.nextInt();
					sum += a;		
				}
				marks.add(sum);
			}
			sum = 0;
			for(int i=0;i<e-1;i++){
				int b = in.nextInt();
				sum += b;
			}
			Collections.sort(marks);
			/*for(Long l : marks){
				System.out.println(l);
			}*/
			//System.out.println();
			long possible = marks.get(marks.size() - k);
			//System.out.println(possible);
			if(sum > possible) System.out.println(0);
			else if(sum+m > possible) System.out.println(possible - sum + 1);
			else System.out.println("Impossible");
		}
	}
	
}