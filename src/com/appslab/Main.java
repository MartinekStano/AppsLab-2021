package com.appslab;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Write 1. Word To Compare: ");
        String word1 = console.nextLine();

        System.out.print("Write 2. Word To Compare: ");
        String word2 = console.nextLine();

        System.out.print("Result is: "+EndsWithString(word1, word2));


    }
    public static boolean EndsWithString(String word1, String word2)
    {
       return word2.endsWith(word1);
    }
}
