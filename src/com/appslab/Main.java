package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Write First Number: ");
        int number1 = console.nextInt();
        System.out.print("Write Second Number: ");
        int number2 = console.nextInt();
        System.out.print("Write Third Number: ");
        int number3 = console.nextInt();

        System.out.print("Total Of Equal Numbers: "+TotalEqual(number1, number2, number3));
    }
    public static int TotalEqual(int number1, int number2, int number3) {
      if(number1 == number2 && number1 == number3)
      {
          return 3;
      }
      if(number1 == number2 || number1 == number3 || number2 == number3)
      {
          return 2;
      }
      else{
          return 0;
      }
    }
}
