public class Euler6
{
	public static void main(String[] args) {
	    long sumOfSquare = sum_square();
	    long squareOfSum = square_sum();
	    
	    System.out.println("sum of squares: " + sumOfSquare);
	    System.out.println("square of sums: " + squareOfSum);
	    System.out.println("difference: " + (squareOfSum - sumOfSquare));
	}
	
	public static long sum_square() {
	    long sum = 0;
	    for (long i = 1; i <= 100; i++) {
	        sum = sum + (i * i);
	    }
	    return sum;
	}
	
	public static long square_sum() {
	    long sum = 0, squareSum = 0;
	    for (long i = 1; i <= 100; i++) {
	        sum = sum + i;
	    }
	    squareSum = (sum * sum);
	    return squareSum;
	}
}

