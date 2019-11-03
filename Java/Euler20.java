import java.math.BigInteger;

public class Euler20 {
    public static void main (String[]args) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 2; i <= 100; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial + "\n");

        String result = factorial.toString();
        int digit = 0;
        int sum = 0;
        for (int i = 0; i < result.length(); i++) {
            digit = Integer.parseInt(result.substring(i, i + 1));
            sum += digit;
        }

        System.out.println(sum);
    }
}
