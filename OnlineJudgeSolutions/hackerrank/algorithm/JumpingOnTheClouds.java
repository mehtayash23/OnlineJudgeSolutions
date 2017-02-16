import java.util.Scanner;

class JumpingOnTheClouds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] clouds = new int[n];
		int steps = 0;
		for (int i = 0; i < n; i++) {
			clouds[i] = sc.nextInt();
		}
		if (n == 2)
			System.out.println(1);
		else {
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				if (clouds[i] != 1) {
					cnt++;
				} else {
					steps += cnt / 2;
					steps++;
					cnt = 0;
				}
			}
			steps += cnt / 2;
			System.out.println(steps);
		}
	}
}