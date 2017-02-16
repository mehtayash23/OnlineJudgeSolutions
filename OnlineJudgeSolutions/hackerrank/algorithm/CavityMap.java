import java.util.Scanner;

public class CavityMap{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char map[][] = new char[n][n];
		int k = 0;
		String s[] = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = in.next();
			for (int j = 0; j < n; j++) {
				map[i][j] = s[i].charAt(j);
			}
		}

		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				int center = Character.getNumericValue(map[i][j]);
				int up = Character.getNumericValue(map[i - 1][j]);
				int down = Character.getNumericValue(map[i + 1][j]);
				int left = Character.getNumericValue(map[i][j - 1]);
				int right = Character.getNumericValue(map[i][j + 1]);
				if (center > up && center > down && center > left
						&& center > right)
					map[i][j] = 'X';
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

}