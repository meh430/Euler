public class Euler7
{
	public static void main(String[] args) {
	    int numPrimes = 1;
        int numm = 1;
 
        while (numPrimes < 10001) {
            numm = numm + 2;
            if (checkPrime(numm)) {
                numPrimes++;
                
            }
        }   
        System.out.println(numm);
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

