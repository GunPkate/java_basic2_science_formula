import java.util.Scanner;

public class Ex02simpleharmo {
	public static void main(String[] args) {
		double T,l,g;
		T = 3.29;
		l = 2.7;
		//T = 2Pi*Math.sqrt(l/g)e;
		g = 4*Math.pow((Math.PI),2)*l/(T*T);
		System.out.println(g);
	}
	
}
