package Year2019_1;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String genome;
        while (true) {
            System.out.print("Enter genome string [quit to stop] : ");
            genome = s.nextLine();
            if (genome.equals("quit")) {
                break;
            }
            boolean found = false;
            for (int i = 0; i < genome.length() - 2; i++) {
                if (genome.substring(i, i + 3).equals("ATG")) {
//                    System.out.println("ATG found");
                    i = i + 3;
                    int startIndex = i;
                    int endIndex = i;
                    for (; i < genome.length() - 2; i++) {
                        if (genome.substring(i, i + 3).equals("ATG")) {
                            i--;
                            break;
                        }
//                        System.out.println("The substring now is " 
//                                + genome.substring(i, i + 3));
                        if (genome.substring(i, i + 3).equals("TAG")
                                || genome.substring(i, i + 3).equals("TAA")
                                || genome.substring(i, i + 3).equals("TGA")) {
//                            System.out.print("End of the gene found");
                            endIndex = i;
                        }
                    }
                    if (startIndex != endIndex) {
                        System.out.println(genome.substring(startIndex, endIndex));
                        found = true;
                    }
                }
            }
            System.out.print((found) ? "" : "No gene is found\n");
        }
    }
}
