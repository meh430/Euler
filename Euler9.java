public class Euler9 {
	public static void main (String[]args) {
		int c = 0;
		for (int a = 3; a < 500; a+=3) {
			for (int b = 4; b < 500; b+=4) {
				c = 1000 - (a + b);
				if ((a*a) + (b*b) == c*c) {
					System.out.println("a: " + a + ", b: " + b + ", c: " + c);
					System.out.println(a * b * c);
				}
			}
		}
	}
}

