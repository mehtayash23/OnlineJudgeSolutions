import java.util.Scanner;

class StudentVoting {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			final int n = in.nextInt();
			int k = in.nextInt();
			int votes[] = new int[n+1];
			int student[] = new int[n+1];
			for(int i=1;i<=n;i++){
				votes[i] = in.nextInt();
				student[i] = 0;
			}
			for(int i=1;i<=n;i++){
				student[votes[i]] += 1;
			}
			int cnt = 0;
			for(int i=1;i<=n;i++){
				if(student[i] >= k && votes[i]!=i) cnt++ ;
			}
			System.out.println(cnt);
		}
	}
	
}