package Year2017_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Random r = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int firstRan = r.nextInt(90 - 65 + 1) + 65;
            int secondRan = r.nextInt(122 - 97 + 1) + 97;
            int ran = r.nextInt(2);
            builder.append((ran==0)?(char)firstRan:(char)secondRan);
        }
        System.out.println("The string generated is: " + builder);
        FileWriter wr;
        try {
            String string = new String(builder);
            wr = new FileWriter(new File("data.txt"));
            wr.write(string);
            wr.close();
            //sort them
            int[] arr = new int[6];
            for (int i = 0; i < string.length(); i++) {
                arr[i] = (int)string.charAt(i);
            }
            Arrays.sort(arr);
            System.out.print("String sorted in ascending order:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print((char)arr[i]);
            }
            System.out.println("");
            System.out.print("String sorted in descending order:");
            for (int i = arr.length-1; i >= 0; i--) {
                System.out.print((char)arr[i]);
            }
            System.out.println("");
            System.out.print("Original string from file: ");
            Scanner s = new Scanner(new FileInputStream("data.txt"));
            System.out.println(s.nextLine());
            s.close();
        } catch (IOException ex) {
            System.out.println("IOException.");
        }
    }
}
