//https://www.hackerrank.com/contests/rookierank-2/challenges/hackerrank-in-a-string
import java.io.BufferedReader;
import java.io.InputStreamReader;

class HackerrankInString {
		public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		char a[] = { 'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k' };
		boolean aImage[] = new boolean[a.length];

		while (q-- > 0) {
			String s = br.readLine();
			char b[] = s.toCharArray();
			for (int i = 0; i < a.length; i++) {
				aImage[i] = false;
			}
			int prevIndex = -1;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if (a[i] == b[j] && j > prevIndex) {
						prevIndex = j;
						b[j] = '1';
						aImage[i] = true;
						// System.out.println("i: " + i +" j:" +j);
						break;
					}
				}
			}
			boolean check = true;
			for (int i = 0; i < a.length; i++) {
				if (aImage[i] == false) {
					check = false;
					System.out.println("NO");
					break;
				}
			}

			if (check == true)
				System.out.println("YES");
		}
	}

}
