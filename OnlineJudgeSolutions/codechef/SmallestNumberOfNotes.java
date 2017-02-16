import java.util.Scanner;

class SmallestNumberOfNotes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] m = { 100, 50, 10, 5, 2, 1 };
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int notes = 0;
			for (int i = 0; i < 6 && n > 0; i++) {
				;
				notes = notes + (n / m[i]);
				n = n % m[i];

				if (n <= 0) {
					break;
				}
			}
			System.out.println(notes);
			t--;
		}
	}

}