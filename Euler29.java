import java.util.ArrayList;
public class Euler29 {

    public static void main (String[]args) {
        ArrayList <Double> listOfTerms = new ArrayList<>();
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                if (!listOfTerms.contains(Math.pow(a, b))) {
                    listOfTerms.add(Math.pow(a, b));
                }                
            }
        }
        System.out.println(listOfTerms.size());
    }
}
