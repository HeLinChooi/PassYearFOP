package Year2016_1;

import java.util.Random;
import java.util.Scanner;

public class Q2 {

    public static String convertor(int x) {
        switch (x) {
            case 1:
                return "Paper";
            case 2:
                return "Scissor";
            case 3:
                return "Rock";
            default:
                return "Invalid Input";
        }
    }

    public static void fight(int player, int comp) {
        if (player == 1 && comp == 3) {
            playerWins++;
            System.out.println("Player win " + playerWins + " time(s)");
        }else if(player == 3 && comp == 1){
            compWins++;
            System.out.println("Computer win " + compWins + " time(s)");
        }else if(player>comp){
            playerWins++;
            System.out.println("Player win " + playerWins + " time(s)");
        }else if(player<comp){
            compWins++;
            System.out.println("Computer win " + compWins + " time(s)");
        }
    }

    static int playerWins = 0;
    static int compWins = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int player;
        int comp;
        //1.Paper 2.Scissor 3.Rock
        while (playerWins < 3 && compWins < 3) {
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock:");
            player = s.nextInt();
            comp = r.nextInt(3) + 1;
            System.out.println("Player : " + convertor(player)
                    + " ----- Computer : " + convertor(comp));
            fight(player,comp);
        }
    }
}
