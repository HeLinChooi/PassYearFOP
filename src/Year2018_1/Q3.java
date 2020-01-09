package Year2018_1;

import java.util.Scanner;

public class Q3 {
    public static void displayHoriEmpty(int size,char character){
        System.out.print(character);
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
        System.out.print(character);
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
        System.out.print(character);
        System.out.println("");
    }
    public static void displayVerticalEmpty(int size,char character){
        for (int i = 0; i < size; i++) {
                System.out.print(character);
                for (int j = 0; j < size; j++) {
                    System.out.print(" ");
                }
                System.out.print(character);
                System.out.println("");
            }
    }
    public static void display8(int size,char character,int format){
        if(format==1){
            for (int i = 0; i < size+2; i++) {
                System.out.print(character);
            }
            System.out.println("");
            displayVerticalEmpty(size, character);
            for (int i = 0; i < size+2; i++) {
                System.out.print(character);
            }
            System.out.println("");
            displayVerticalEmpty(size, character);
            for (int i = 0; i < size+2; i++) {
                System.out.print(character);
            }
            System.out.println("");
        }else{
            for (int i = 0; i < size*2+3; i++) {
                System.out.print(character);
            }
            System.out.println("");
            for (int i = 0; i < size; i++) {
                displayHoriEmpty(size, character);
            }
            for (int i = 0; i < size*2+3; i++) {
                System.out.print(character);
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter font size : ");
        int size = s.nextInt();
        System.out.print("Enter font type : ");
        char character = s.next().charAt(0);
        System.out.print("Enter format [1 - Vertical, 2- Horizontal]: ");
        int format = s.nextInt();
        display8(size, character, format);
        s.close();
    }
}
