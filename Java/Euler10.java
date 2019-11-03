public class Euler10 {
	public static void main (String[]args) {
		int n = 2000000;
		boolean [] primes = new boolean [n+1];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}
		
		for (int a = 2; a*a <= n; a++) {
			if (primes[a]) {
				for (int b = a*2; b <= n; b += a) {
					primes[b] = false;
				}
			}
		}
		long sum = 0;
		
		for (int j = 2; j < primes.length; j++) {
			if (primes[j]) {
				System.out.print(j + " + ");
				sum += j;
				
			}
		}
		System.out.println("\n" + sum);
	}
}

