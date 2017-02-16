import java.util.Scanner;

class LazyGem {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int b = in.nextInt();
			long m = in.nextLong();
			long time = 0;
			int solved;
			long cnt = 0;
			while (n >= 1) {
				cnt++;
				if (n % 2 == 0)
					solved = n / 2;
				else
					solved = (n + 1) / 2;
				time += (solved * m);
				// System.out.println("n:  "+n+" solved: "+solved+" m:"+m+" time:"+time);
				m = m * 2;
				n = n - solved;

			}
			time += (cnt - 1) * b;
			System.out.println(time);
		}
	}
}