//https://www.hackerrank.com/challenges/apple-and-orange

import java.util.Scanner;

public class AppleAndOrange {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		int[] orange = new int[n];
		for (int i = 0; i < m; i++) {
			apple[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			orange[i] = in.nextInt();
		}
		int countApple = 0, countOrange = 0;
		for (int i = 0; i < m; i++) {
			if (apple[i] + a >= s && apple[i] + a <= t)
				countApple++;
		}
		for (int i = 0; i < n; i++) {
			if (orange[i] + b >= s && orange[i] + b <= t)
				countOrange++;
		}
		System.out.println(countApple);
		System.out.println(countOrange);
	}

}