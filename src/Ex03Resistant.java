import java.util.Scanner;

public class Ex03Resistant {
	public static void main(String[] args) {
		double R,p,l,A;
		p = 1.59e-8;
		Scanner sc = new Scanner(System.in);
//		System.out.println("Input Area");
		A = sc.nextDouble();
//		System.out.println("Input length");
		l = sc.nextDouble();
		R = (p*l) /A;
		System.out.println(R);
	}
}
