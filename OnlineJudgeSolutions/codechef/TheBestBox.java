import java.text.DecimalFormat;
import java.util.Scanner;

class TheBestBox {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		DecimalFormat requiredFormat = new DecimalFormat("0.00");
		while (t-- > 0) {
			int p = in.nextInt();
			int s = in.nextInt();
			float x = (float) (p - Math.sqrt((p * p) - (24 * s))) / 12;
			float answer = (float) (x * (s / 2 - (p * x) / 4 + (x * x)));
			System.out.println(requiredFormat.format(answer));
		}
	}

}