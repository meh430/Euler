import java.math.BigInteger;
import java.io.*;
import java.util.Scanner;
public class Euler13 {
	public static void main (String[]args) throws Exception {
		File f = new File("euler13.txt");
		Scanner sc = new Scanner(f);
		BigInteger sum = new BigInteger("0");
		while (sc.hasNext()) {
			sum = sum.add(new BigInteger(sc.next()));
		}
		sc.close();
		System.out.println(sum);
	}
}

