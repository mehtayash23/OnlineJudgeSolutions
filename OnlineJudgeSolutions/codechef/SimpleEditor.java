import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SimpleEditor {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final StringBuilder sb = new StringBuilder();
		final StringBuilder osb = new StringBuilder();
		final int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			final String x[] = br.readLine().split(" ");
			if (x[0].equals("+")) {
				final int start = Integer.parseInt(x[1]);
				final String substring = x[2];
				sb.insert(start, substring);
			} else {
				final int start = Integer.parseInt(x[1]) - 1;
				final int length = Integer.parseInt(x[2]) - 1;
				final String substring = sb
						.substring(start, start + length + 1);
				osb.append(substring).append('\n');
			}
		}
		System.out.println(osb);
	}
}