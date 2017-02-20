//https://www.hackerrank.com/contests/rookierank-2/challenges/knightl-on-chessboard
import java.awt.Point;
import java.util.LinkedList;
import java.util.Scanner;

class KnightL {
		public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int counts[][] = new int[n - 1][n - 1];
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				counts[i][j] = -1;
			}
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j <= i; j++) {
				counts[i][j] = findMoves(i, j, n);
				counts[j][i] = counts[i][j];
			}
		}

		counts[n - 2][n - 2] = 1;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				System.out.print(counts[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int findMoves(int i, int j, int n) {
		boolean visited[][] = new boolean[n][n];
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				visited[row][col] = false;
			}
		}
		int curRow = 0;
		int curCol = 0;
		int a = i + 1;
		int b = j + 1;
		LinkedList<Point> queue = new LinkedList<Point>();
		queue.add(new Point(0, 0));
		queue.add(new Point(-1, -1));
		int depth = 0;
		visited[0][0] = true;
		boolean cantVisit = true;
		while (queue.size() != 0 && cantVisit == true) {
			curRow = queue.getFirst().x;
			curCol = queue.getFirst().y;
			if (curRow == -1 && curCol == -1) {
				depth++;
				queue.add(new Point(-1, -1));
				queue.removeFirst();
				if (queue.getFirst().x == -1 && queue.getFirst().y == -1) {
					break;
				}
				;
			} else {
				queue.removeFirst();
				if (isValid(curRow + a, curCol + b, n)
						&& !visited[curRow + a][curCol + b]) {
					queue.add(new Point(curRow + a, curCol + b));
					visited[curRow + a][curCol + b] = true;
				}
				if (isValid(curRow + b, curCol + a, n)
						&& !visited[curRow + b][curCol + a]) {
					queue.add(new Point(curRow + b, curCol + a));
					visited[curRow + b][curCol + a] = true;
				}
				if (isValid(curRow - a, curCol + b, n)
						&& !visited[curRow - a][curCol + b]) {
					queue.add(new Point(curRow - a, curCol + b));
					visited[curRow - a][curCol + b] = true;
				}
				if (isValid(curRow - b, curCol + a, n)
						&& !visited[curRow - b][curCol + a]) {
					queue.add(new Point(curRow - b, curCol + a));
					visited[curRow - b][curCol + a] = true;
				}
				if (isValid(curRow + b, curCol - a, n)
						&& !visited[curRow + b][curCol - a]) {
					queue.add(new Point(curRow + b, curCol - a));
					visited[curRow + b][curCol - a] = true;
				}
				if (isValid(curRow + a, curCol - b, n)
						&& !visited[curRow + a][curCol - b]) {
					queue.add(new Point(curRow + a, curCol - b));
					visited[curRow + a][curCol - b] = true;
				}

				if (isValid(curRow - a, curCol - b, n)
						&& !visited[curRow - a][curCol - b]) {
					queue.add(new Point(curRow - a, curCol - b));
					visited[curRow - a][curCol - b] = true;
				}
				if (isValid(curRow - b, curCol - a, n)
						&& !visited[curRow - b][curCol - a]) {
					queue.add(new Point(curRow - b, curCol - a));
					visited[curRow - b][curCol - a] = true;
				}
				if (visited[n - 1][n - 1] == true) {
					cantVisit = false;
					break;
				}

			}

		}
		if (cantVisit == false)
			return depth + 1;
		return -1;
	}

	private static boolean isValid(int a, int b, int n) {
		if (a >= 0 && b >= 0 && a < n && b < n)
			return true;
		else
			return false;
	}

}
