import java.util.Scanner;

class Kangaroo {

	private static String find(int min, int v1, int max, int v2) {
		while (min <= max) {
			min += v1;
			max += v2;
			if (min == max)
				return "YES";
		}
		return "NO";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();
		if ((x1 < x2 && v1 < v2) || (x1 > x2 && v1 > v2))
			System.out.println("NO");
		else {
			int min = Math.min(x1, x2);
			int max = Math.max(x1, x2);
			if (min == x1)
				System.out.println(find(min, v1, max, v2));
			else
				System.out.println(find(min, v2, max, v1));

		}
	}
}