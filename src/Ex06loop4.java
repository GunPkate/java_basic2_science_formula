
public class Ex06loop4 {
	public static void main(String[] args) {
			int n = 3;
			for (int y = 1; y < 2*n; y++) {
				for (int x = 1; x < n * 2; x++) {
//					if ((x == y + n/2 || x== y -n/2 || x == n - y +1 +n/2 || x == n - y +1 -n/2 ) ) {
					if (x ==  n + y- 1 || x== n - y +1 || x == 3*n - y - 1 || x == -n +y +1 ) {
						System.out.print("x");
					} else {
						System.out.print("-");
					}
				}
				System.out.println();
			}
	}
}
