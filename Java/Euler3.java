import java.util.ArrayList;
import java.util.Collections;

public class Euler3 {
    public static void main (String[]args) {
        ArrayList<Long> factors = new ArrayList<Long>();
		long limit = 600851475143L;
        
        for (long i = 1; i < limit; i++) {
			if (checkPrime(i) && limit % i == 0)  {
				factors.add(i);
				System.out.println(i);
			}	
		}
		
		System.out.println(factors);
		System.out.println(Collections.max(factors));        
    }

	static boolean checkPrime(long num){
		if(num > 2){
			for(long i = 2; i <= Math.sqrt(num); i++){
				if(num % i == 0)
					return false;
			}
			return true;
		} else
			return true;
		}
}


