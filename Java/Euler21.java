import java.util.ArrayList;
public class Euler21 {

    public static void main (String[]args) {
        int tempSum, sumA = 0, sumB = 0;
        ArrayList<Integer> done = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            tempSum = sumOfDiv(i);
            if (i == sumOfDiv(tempSum) && i != tempSum) {
                done.add(tempSum);
                if (done.contains(i)) {
                    continue;
                }
                System.out.println("a: " + i + ", b: " + tempSum);
                sumA += i;
                sumB += tempSum;
            }
        }
        System.out.println(sumA + sumB);
    }

    public static int sumOfDiv (int n) {
        int divSums = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                divSums += i;
            }
        }

        return divSums;
    }
}
