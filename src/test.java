
public class test {
	public static void main(String[] args) {
		byte a = 4, b = 7;
		System.out.println((a & b)); //4
		System.out.println((a | b)); //7
		System.out.println((a ^ b)); //3  100  111 = 011
		System.out.println((b >> 1)); //3
		System.out.println((b << 1)); //14
	}
}
