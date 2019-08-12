import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Euler18 {

    public static void main (String[]args) throws Exception {
        int [][] grid = arrayFromText ("C:/Users/Mehul Pillai/Desktop/ICS/euler18.txt");
        int col = 0;
        double sum = 0;
        sum = 85;
        int num;
        int downRow = 0, rightCol = 0;
        System.out.println(Arrays.deepToString(grid));
      

        int currentRow = 0, currentCol = 0;
        int pos1 = 0, pos2 = 0;
        int tempRow = 0, tempCol = 0;
        while (true) {
            tempRow = currentRow;
            tempCol = currentCol;

            pos1 = grid[tempRow+1][tempCol];
            pos2 = grid[tempRow+1][tempCol+1];
            num = Math.max(pos1, pos2);
            sum += num;
            System.out.println(num);
            if (num == pos1) {
                ++currentRow;
                currentCol = currentCol; 
            } else if (num == pos2) {
                ++currentRow;
                ++currentCol;
            }
            System.out.println("Sum: " + sum);
        }

        /*
        for (int i = 0; i < grid.length; i++) {
            
            for (int j = 0; j < grid[i].length; j++) {
                
                
                if (downRow >= grid.length || downRow < 0 || rightCol >= grid[i].length || rightCol < 0) {
                    //sum += Math.max(grid[i+1][j], grid[i+1][j+1]); 
                } else {
                    num = Math.max(grid[downRow][j], grid[downRow][rightCol]); 
                    System.out.println(num);
                    sum += num;
                    rightCol = j + 1;
                    downRow = i + 1;
                }
            }
        }

        System.out.println(sum);
        */   
    }

    public static int [][] arrayFromText (String fName) throws Exception {
	Scanner sc = new Scanner(new BufferedReader(new FileReader(fName)));
    int [][] arr = new int[15][];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = new int[i+1];
    }

    while(sc.hasNextLine()) {
        for (int i=0; i<arr.length; i++) {
            String[] line = sc.nextLine().trim().split(" ");
            for (int j=0; j<line.length; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
                //length++;
            }
        }
    }
        return arr;
   }
}//class
