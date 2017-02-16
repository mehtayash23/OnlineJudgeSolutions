import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class AkhilAndColoredBall {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {

			char x[] = br.readLine().toCharArray();
			char y[] = br.readLine().toCharArray();
			char z[] = new char[y.length];
			for (int i = 0; i < x.length; i++) {
				if (x[i] == y[i]) {
					if (x[i] == 'W')
						z[i] = 'B';
					else
						z[i] = 'W';
				} else
					z[i] = 'B';
			}
			for (char ch : z) {
				pw.print(ch);
			}
			pw.println();

		}

		pw.close();
	}

}
