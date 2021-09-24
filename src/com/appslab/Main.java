package com.appslab;


public class Main {

    public static void main(String[] args) {

        int[] numbers = {12,90,75};
        int even = 0;
        int odd = 0;

        for (int i=0;i<numbers.length; i++)
        {
            if (numbers[i] %2 == 0)
            {
                even += numbers[i];
            }else
            {
                odd += numbers[i];
            }
        }
        System.out.print(OddOrEven(odd, even));

    }
    public static String OddOrEven(int odd, int even) {
        if (odd > even) {
            int difference = odd - even;
            return "ODD > EVEN " + difference;

        }
        else{
            int difference = even-odd;
         return "ODD < EVEN "+difference;
        }
    }
}
