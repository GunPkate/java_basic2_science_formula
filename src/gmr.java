
public class gmr {
	public static void main(String[] args) {
		double g,G,m2,R;
//		G = 6.67e-11;
		m2 = 5.974e24;
		R =6371e3;
		g =9.8;
//		g = (G*m2)/Math.pow(R, 2);
		G = g*R*R/m2; 
		System.out.println(G);
	}
}
