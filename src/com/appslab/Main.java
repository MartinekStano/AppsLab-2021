package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Select Side \"A\": ");
        int number1 = console.nextInt();
        System.out.print("Select Side \"B\": ");
        int number2 = console.nextInt();
        System.out.print("Select Side \"C\": ");
        int number3 = console.nextInt();

        System.out.print("Its that triangle: "+IsTriangle(number1, number2, number3));
    }
    public static boolean IsTriangle(int number1, int number2, int number3) {

      int sideAB = (number1*number1) + (number2*number2) ;
      int sideC = number3*number3;

      return sideAB == sideC;
    }
}
