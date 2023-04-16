import java.util.Scanner;

public class Ex04Triangle {
	public static void main(String[] args) {
		double a, b, c, x, y, max;
		Scanner sc = new Scanner(System.in);

		System.out.println("input 3 numbers");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		if (a > b && a > c) {
			max = a;
			x = b;
			y = c;
		} else if (b > a && b > c) {
			max = b;
			x = a;
			y = c;
		} else {
			max = c;
			x = a;
			y = a;
		}

		if (x + y <= max) {
			System.out.println("Not triangle");
			return;
		} else {
			double m,n;
			m = max * max;
			n = x * x + y * y;
			if (m > n) 
			{
				System.out.println(">90");
			}
			else if(m < n) 
			{
				System.out.println("<90");				
			}
			else 
			{
				System.out.println("=90");								
			}
			if(a == b && b == c) 
			{
				System.out.println("equal triangle(all)");								
			}if (a == b || b == c || a==c) 
			{				
				System.out.println("equal triangle(2)");
			}
			else 
			{
				System.out.println("not equal triangle");
			}
				
			
		}
	}
}
