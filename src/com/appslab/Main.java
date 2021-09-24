package com.appslab;


import javax.sound.sampled.Line;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] Rooks1 = {"A8","E8"};
        String[] Rooks2= {"A1","B2"};
        String[] Rooks3 = {"H4","H3"};
        String[] Rooks4 = {"F5","C8"};

        System.out.print("Result is: "+EndsWithString(Rooks1) +"\n");
        System.out.print("Result is: "+EndsWithString(Rooks2)+"\n");
        System.out.print("Result is: "+EndsWithString(Rooks3)+"\n");
        System.out.print("Result is: "+EndsWithString(Rooks4));

    }
    public static boolean EndsWithString(String[] rooks)
    {
       String rook1 = rooks[0];
       String rook2 = rooks[1];
       return rook1.charAt(0) == rook2.charAt(0) || rook1.charAt(1) == rook2.charAt(1);
    }
}
