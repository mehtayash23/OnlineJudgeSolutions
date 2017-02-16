import java.util.Scanner;

public class AngryProfessor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int count = 0;
		int j = 0;
		for (int i = 0; i < t; i++) {
			count = 0;
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] timeArr = new int[n];
			for (j = 0; j < n; j++) {
				timeArr[j] = sc.nextInt();
			}
			for (j = 0; j < n; j++) {
				if (timeArr[j] > 0) {
					count = count + 1;
				}
			}
			if ((n - count) >= k) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}