import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/designer-pdf-viewer
public class DesignerPDFViewer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Character, Integer> heights = new HashMap<Character, Integer>(26);
		char c = 'a';
		for (int i = 1; i <= 26; i++) {
			int h = in.nextInt();
			heights.put(c, h);
			c++;
		}
		char[] word = in.next().toCharArray();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < word.length; i++) {
			if (heights.get(word[i]) > max)
				max = heights.get(word[i]);
		}
		System.out.println(max * word.length);
	}

}
