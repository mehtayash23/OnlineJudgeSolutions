import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Sticks {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int t = in.nextInt();
		while (t-- > 0) {
			List<Integer> rectangle = new ArrayList<Integer>();
			final int n = in.nextInt();
			int sides[] = new int[n];
			for (int i = 0; i < n; i++) {
				sides[i] = in.nextInt();
			}
			Arrays.sort(sides);
			for (int i = 0; i < n - 1;) {
				if (sides[i] == sides[i + 1]) {
					rectangle.add(sides[i]);
					i = i + 2;
				} else {
					i++;
				}
			}
			if (rectangle.size() >= 2)
				System.out.println(rectangle.get(rectangle.size() - 1)
						* rectangle.get(rectangle.size() - 2));
			else
				System.out.println(-1);
		}
	}
}
