import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Euler22 {

    public static void main (String[]args) throws Exception {
        ArrayList <String> listOfNames = namesFile("C:/Users/Mehul Pillai/Desktop/ICS/names.txt");
        Collections.sort(listOfNames);
        String temp, tempLetter;
        int score = 0, wordScore = 0;
        for (int i = 0; i < listOfNames.size(); i++) {
            wordScore = 0;
            temp = listOfNames.get(i);
            for (int j = 0; j < temp.length(); j++) {
                tempLetter = temp.substring(j, j + 1);
                if (tempLetter.equalsIgnoreCase("a")) {
                    wordScore += 1;
                } else if (tempLetter.equalsIgnoreCase("b")) {
                    wordScore += 2;
                } else if (tempLetter.equalsIgnoreCase("c")) {
                    wordScore += 3;

                } else if (tempLetter.equalsIgnoreCase("d")) {
                    wordScore += 4;

                } else if (tempLetter.equalsIgnoreCase("e")) {
                    wordScore += 5;

                } else if (tempLetter.equalsIgnoreCase("f")) {
                    wordScore += 6;

                } else if (tempLetter.equalsIgnoreCase("g")) {
                    wordScore += 7;

                } else if (tempLetter.equalsIgnoreCase("h")) {
                    wordScore += 8;

                } else if (tempLetter.equalsIgnoreCase("i")) {
                    wordScore += 9;

                } else if (tempLetter.equalsIgnoreCase("j")) {
                    wordScore += 10;

                } else if (tempLetter.equalsIgnoreCase("k")) {
                    wordScore += 11;

                } else if (tempLetter.equalsIgnoreCase("l")) {
                    wordScore += 12;

                } else if (tempLetter.equalsIgnoreCase("m")) {
                    wordScore += 13;

                } else if (tempLetter.equalsIgnoreCase("n")) {
                    wordScore += 14;

                } else if (tempLetter.equalsIgnoreCase("o")) {
                    wordScore += 15;

                } else if (tempLetter.equalsIgnoreCase("p")) {
                    wordScore += 16;

                } else if (tempLetter.equalsIgnoreCase("q")) {
                    wordScore += 17;

                } else if (tempLetter.equalsIgnoreCase("r")) {
                    wordScore += 18;

                } else if (tempLetter.equalsIgnoreCase("s")) {
                    wordScore += 19;

                } else if (tempLetter.equalsIgnoreCase("t")) {
                    wordScore += 20;

                } else if (tempLetter.equalsIgnoreCase("u")) {
                    wordScore += 21;

                } else if (tempLetter.equalsIgnoreCase("v")) {
                    wordScore += 22;

                } else if (tempLetter.equalsIgnoreCase("w")) {
                    wordScore += 23;

                } else if (tempLetter.equalsIgnoreCase("x")) {
                    wordScore += 24;

                } else if (tempLetter.equalsIgnoreCase("y")) {
                    wordScore += 25;

                } else if (tempLetter.equalsIgnoreCase("z")) {
                    wordScore += 26;
                } 
            }

            score += (wordScore * (i+1));
        }

        System.out.println(score);
    }

    public static ArrayList <String> namesFile (String path) throws Exception {    
        Scanner sc = new Scanner(new BufferedReader(new FileReader(path)));
        ArrayList <String> nameList = new ArrayList <>();

        String [] tempArr = sc.nextLine().trim().split(",");

        for (int i = 0; i < tempArr.length; i++) {
            nameList.add(tempArr[i].replace("\"", ""));
        }

        return nameList;
    }
}
