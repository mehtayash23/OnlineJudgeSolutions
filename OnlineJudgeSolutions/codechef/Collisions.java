import java.util.Scanner;

class collisions {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			int[][] arr = new int[n][m];
			for (int i = 0; i < n; i++) {
				String s = in.nextLine();
				for (int j = 0; j < m; j++) {
					arr[i][j] = Character.getNumericValue(s.charAt(j));
				}
			}
			int col = 0;
			for (int j = 0; j < m; j++) {
				int cnt = 0;
				for (int i = 0; i < n; i++) {
					if (arr[i][j] == 1)
						cnt++;
				}
				col += cnt * (cnt - 1) / 2;
			}
			System.out.println(col);
		}
	}
}