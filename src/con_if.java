import java.util.Scanner;

public class con_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt(); //2
		b = sc.nextInt(); //1
		c = sc.nextInt(); //19
		
		if (a > 3) {
			System.out.println("Red");
		}
		else if (b <= 2) {
			if (c != 5) {
				System.out.println("Green");			
			}else {
				System.out.println("Blue");
			}
		}else {			
			System.out.println("Pink");
		}
	} //2 1 19 Green
}
