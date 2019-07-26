public class Euler4
{
	public static void main(String[] args) {
	    int possible = 0;
		for (int i = 900; i <= 999; i++) {
		    for (int j = 999; j >= 900; j--) {
		        possible = i * j;
		        if (checkPalin(possible)) {
		            System.out.println(possible + ", " + i + ", " + j);
		            break;
		        }
		    }
		}
	}
	
	public static boolean checkPalin(int num) {
	    int n = num, rev = 0, digit = 0;
	    
	    do {
	        digit = n % 10;
	        rev = (rev * 10) + digit;
	        n = n / 10;
	    } while (n > 0);
	    
	    if (rev == num) {
	        return true;
	    } 
	
	    return false;
	}
}

