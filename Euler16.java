import java.math.BigInteger;
public class Euler16 {
	public static void main (String[]args) {
		BigInteger number = new BigInteger("2");
		number = number.pow(1000);
		String num = number.toString();
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum += Integer.parseInt(num.substring(i, i + 1));
		}
		
		System.out.println(number + "\n");
		System.out.println(num);
		System.out.println("\n" + sum);
	}
}

