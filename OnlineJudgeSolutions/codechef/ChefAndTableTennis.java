import java.util.Scanner;

class ChefAndTableTennis {
	public static void main(String args[]) throws Exception {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			String s = in.next();
			char points[] = s.toCharArray();
			int zeroCnt = 0;
			int oneCnt = 0;

			for (int i = 0; i < points.length; i++) {
				if (Character.getNumericValue(points[i]) == 1) {
					oneCnt++;
				} else
					zeroCnt++;
			}
			if (oneCnt > zeroCnt)
				System.out.println("WIN");
			else
				System.out.println("LOSE");
		}
	}
}