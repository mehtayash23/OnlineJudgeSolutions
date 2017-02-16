import java.util.Arrays;
import java.util.Scanner;

class DevuAndArray {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		final int n = in.nextInt();
		int q = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		while (q-- > 0) {
			int a = in.nextInt();
			if (a >= arr[0] && a <= arr[n - 1])
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}