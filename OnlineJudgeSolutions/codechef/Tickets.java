import java.util.Scanner;

class Tickets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			char a[] = s.toCharArray();

			char first = a[0];
			char second = a[1];
			boolean flag = true;
			if (first != second) {
				for (int i = 2; i < a.length; i++) {
					if ((i % 2 == 0 && a[i] != first)
							|| (i % 2 == 1 && a[i] != second)) {
						System.out.println("NO");
						flag = false;
						break;
					}

				}
				if (flag == true)
					System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}