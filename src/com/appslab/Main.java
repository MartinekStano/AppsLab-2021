package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Write Word To Test, If It’s Palindrome: ");
        String inputFromUser = console.nextLine();


        System.out.print("Result's: " + IsWordPalindrome(inputFromUser));
    }
    public static boolean IsWordPalindrome(String inputFromUser)
    {
        StringBuilder sb = new StringBuilder(inputFromUser);
        sb.reverse();
        String rev=sb.toString();
        if(inputFromUser.equals(rev))
        {
            return true;
        }else
        {
            return  false;
        }
    }

}
