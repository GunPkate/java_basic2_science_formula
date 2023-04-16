
public class Ex06loop3 {
	public static void main(String[] args) {
			int n = 4;
			for (int y = 1; y <= n; y++) {
				for (int x = 1; x <= n * 2; x++) {
					if (x >= y && x <= 2*n - y ) {
						System.out.print("x");
					} else {
						System.out.print("-");
					}
				}
				System.out.println();
			}
	}
}
