
public class Ex06loop2 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n * 2; j++) {
				if (j >= n - i + 1 && j <= n + i - 1) {
					System.out.print("x");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
