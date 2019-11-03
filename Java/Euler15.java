import java.math.BigInteger;

public class Euler15 {
	public static void main (String[]args) {
		BigInteger ans = new BigInteger("0");
		
		BigInteger sumFact = new BigInteger("1");
		BigInteger dimFact = new BigInteger("1");
		
		for (int i = 2; i <= 40; i++) {
			sumFact = sumFact.multiply(BigInteger.valueOf(i));
		}
		for (int i = 1; i <=20; i++) {
			dimFact = dimFact.multiply(BigInteger.valueOf(i));
		}
		
		ans = sumFact.divide(dimFact);
		ans = ans.divide(dimFact);
		System.out.println(sumFact + " " + dimFact);
		System.out.println(ans);
	}
}

