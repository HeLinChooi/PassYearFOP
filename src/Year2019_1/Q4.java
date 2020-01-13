package Year2019_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q4 {

    public static void main(String[] args) {
        int[] characters;
        try {
            Scanner s = new Scanner(new FileInputStream("myAmbition.txt"));
            StringBuilder wholeText = new StringBuilder();
            characters = new int[26];
            int numOfSentences = 0;
            int numOfWords = 0;
            while (s.hasNextLine()) {
                wholeText.append(s.nextLine());
            }
            String y = new String(wholeText);
            String sentences = y.toUpperCase();
            String[] words = sentences.split("\\b");
            System.out.println("Number of words : " + words.length);
            System.out.println(words[1]);
            System.out.println(words[2]);
            System.out.println(words[3]);
            System.out.println(words[4]);
            System.out.println(words[5]);
            System.out.println(words[6]);
            System.out.println(words[7]);
            for (int i = 0; i < sentences.length(); i++) {
                if (sentences.charAt(i) == '.' || sentences.charAt(i) == ',') {
                    if (sentences.charAt(i) == '.') {
                        numOfSentences++;
                    }
                    i++;
                    numOfWords++;
                    continue;
                } else if (Character.isLetter(sentences.charAt(i))) {
                    int characterCode = (int) sentences.charAt(i) - 65;
                    characters[characterCode]++;
                } else if (sentences.charAt(i) == '-') {
                } else {
                    numOfWords++;
                }
            }
            System.out.println("Number of sentences : " + numOfSentences);
            System.out.println("Number of words : " + numOfWords);
            for (int i = 0; i < 26; i++) {
                char x = (char) (i + 65);
                if (i % 8 == 0 && i != 0) {
                    System.out.println("");
                }
                System.out.print(x + " : " + characters[i] + " ");
            }
            s.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
    }
}
