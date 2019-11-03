public class Euler14 {
	public static void main (String[]args) {
		long upper = 1000000L;
		long greatestnum = 0;
		long number = 0;
		for (long i = 1; i < upper; i++) {
			if (collatz(i)<1000000) {
				System.out.println("Terms: " + collatz(i) + ", Number: " + i);
				if (collatz(i) > greatestnum) {
					greatestnum = collatz(i);
					number = i;
				}
			}
		}
		System.out.println(greatestnum);
		System.out.println(number);
	}
	
	public static long collatz (long num) {
		long lim = 1;
		
		while (num!=1) {
			if (num%2==0) {
				num/=2;
				
			} else {
				num=(num*3)+1;
				
			}
			lim++;
		}
		return lim;
	}
}

