package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("PLAYER 1: Rock, paper or scissors?: ");
        String player1 = console.nextLine();

        System.out.print("PLAYER 2: Rock, paper or scissors?: ");
        String player2 = console.nextLine();


        System.out.print("Result's: " + RockPaperScissors(player1, player2));
    }
    public static String RockPaperScissors(String player1, String player2)
    {
        if(player1.equals("rock") && player2.equals("rock") || player1.equals("paper") && player2.equals("paper") ||player1.equals("scissors") && player2.equals("scissors") )
        {
            return "TIE";
        }
        if(player1.equals("rock") && player2.equals("scissors") || player1.equals("scissors") && player2.equals("paper") || player1.equals("paper") && player2.equals("rock") )
        {
            return "PLAYER 1 WINS";
        }
        else
        {
            return "PLAYER 2 WINS";
        }
    }

}
