package com.appslab;


public class Main {

    public static void main(String[] args) {

        int[] numbers = {10,4,1,4,-10,-50,32,21};
        int max = 0;
        int min = 0;

        for (int i=0;i<numbers.length; i++)
        {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        for (int i=0;i<numbers.length; i++ )
        {
            if (min > numbers[i])
            {
                min = numbers[i];
            }
        }
        int differencesBetweenMaxMin =  Math.abs(min) + max;
        System.out.print("MAX: "+max +" MIN: " +min+ " DifferencesBetweenMaxMin: "+differencesBetweenMaxMin);
    }
}
