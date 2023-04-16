import java.util.Scanner;

public class gmmr2_2 {
	public static void main(String[] args) {
		double f,G,m1,m2,R;

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 1st planet");//5.974e24
		m1 =sc.nextDouble();
//		System.out.println("Enter 2nd planet");//7.349e22
		m2 =sc.nextDouble();
//		System.out.println("Enter distance");//3.844e8
		R =sc.nextDouble();
		f =sc.nextDouble();
//		m1 = 7.349e22;
//		m2 = 5.974e24;
//		R = 3.844e8;
//		f = 1.982e20;

		G = f*Math.pow(R, 2)/(m1*m2);
		
		System.out.println(G);
	}
}
