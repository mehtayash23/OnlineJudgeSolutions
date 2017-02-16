import java.io.IOException;
import java.util.Scanner;

public class CircularArrayRotation {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int arr[] = new int[n];
		int tmp[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			tmp[i] = arr[i];
		}
		k = k % n;
		for (int i = n - k - 1; i >= 0; i--) {
			arr[i + k] = arr[i];
		}
		int index = 0;
		for (int i = n - k; i < n; i++) {
			arr[index++] = tmp[i];
		}
		while (q-- > 0) {
			int queryVal = sc.nextInt();
			System.out.println(arr[queryVal]);
		}
	}
}