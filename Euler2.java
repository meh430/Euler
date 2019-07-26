public class Euler2
{
	public static void main(String[] args) {
	    long t1 = 1, t2 = 2, sum = 0, sumev = 0;
	    for (long i = 0; i < 100; i++) {
	        sum = t1 + t2;
	        t1 = t2;
	        t2 = sum;
	        if (t1 % 2 == 0) {
	            sumev += t1;
	        }
	        if (sum > 4000000) {
	            break;
	        }
	    }
	    System.out.println(t1);
	    System.out.println(sumev);
	}
	
	
}

