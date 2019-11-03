public class Euler12 {
	
	public static void main (String[]args) {
		long triNum = 0;
		for (long i = 0; i < 100000; i++) {
			triNum = triangleNum(i);
			System.out.println(triNum);
			if (numD(triNum) > 500) {
				System.out.println(triNum);
				break;
			}
		}
	}
	
	public static long numD (long x) {
		int sqr = (int) Math.sqrt(x);
		long numDs = 0;
		for (int i = 1; i < sqr; i++) {
			if (x % i == 0) {
				numDs+=2;
			}
		}
		return numDs;
	}
	
	public static long triangleNum (long x) {
		long num = x * (x + 1) / 2;
		return num;
	}
}

