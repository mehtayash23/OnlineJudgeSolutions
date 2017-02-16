import java.util.Scanner;

class ChefAndDetective {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r[] = new int[n + 1];
		boolean hasChildren[] = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
			r[i] = in.nextInt();
			hasChildren[i] = false;
		}
		for (int i = 1; i <= n; i++) {
			hasChildren[r[i]] = true;
		}
		for (int i = 1; i <= n; i++) {
			if (hasChildren[i] != true)
				System.out.print(i + " ");
		}

	}
}