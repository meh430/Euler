import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Euler11 {
   public static void main(String args[]) throws Exception {
	   //rows(0), column(1)
	   int [][] grid = arrayFromText("euler11.txt");
	   long product = 1;
	   long maybeProduct = 1;
	   
	   for (int i = 0; i < 20; i++) {
		   for (int j = 0; j < 20; j++) {
			   
			   //vertical search. 
			   if (i < 16) {
				   maybeProduct = grid[i][j];
				   for (int k = 1; k < 4; k++) {
					   maybeProduct *= grid[i+k][j];
				   }
				   product = Math.max(product, maybeProduct);
			   }
			   
			   //horizontal search
			   if (j < 16) {
				   maybeProduct = grid[i][j];
				   for (int k = 1; k < 4; k++) {
					   maybeProduct *= grid[i][j+k];
				   }
				   product = Math.max(product, maybeProduct);
			   }
			   
			   //diagonal search to right
			   if (j < 16 && i < 16) {
				   maybeProduct = grid[i][j];
				   for (int k = 1; k < 4; k++) {
					   maybeProduct *= grid[i + k][i + k];
					}
					product = Math.max(product, maybeProduct);
			   }
			   
			   //diagonal search to left
			   if (j < 16 && j > 3 && i < 16) {
				   maybeProduct = grid[i][j];
				   for (int k = 1; k < 4; k++) {
					   maybeProduct *= grid[i+k][j-k];
				   }
				   product = Math.max(product, maybeProduct);
			   }
			   
		   }//for 2
		}//for 1
		
		System.out.println(product);
   }//main
   
   public static int [][] arrayFromText (String fName) throws Exception {
	  Scanner sc = new Scanner(new BufferedReader(new FileReader(fName)));
     
      int [][] arr = new int[20][20];
      while(sc.hasNextLine()) {
         for (int i=0; i<arr.length; i++) {
            String[] line = sc.nextLine().trim().split(" ");
            for (int j=0; j<line.length; j++) {
               arr[i][j] = Integer.parseInt(line[j]);
            }
         }
      }
      return arr;
   }
}//class

