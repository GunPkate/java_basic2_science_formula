import java.util.Scanner;

public class Ex07product {
	public static void main(String[ ]args) {
		Scanner sc = new Scanner(System.in);
		
		double price1,price2,weight1,weight2;
//		price1 = sc.nextDouble();
//		weight1 = sc.nextDouble();
//		price2 = sc.nextDouble();
//		weight2 = sc.nextDouble();
		
		price1 = 170;
		weight1 = 105;
		price2 = 180;
		weight2 = 160;
		
		double a = price1/weight1;
		double b = price2/weight2;
		System.out.println("Product1 "+a+" Product2 "+b);
		if(a > b) {
			System.out.println("Product 2 is cheaper");			
		}else if (a == b) {
			System.out.println("Product 1 equal Product 2");						
		}  
		else {
			System.out.println("Product 1 is cheaper");
		}
	}
}
