package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Total slices of pie: ");
        int totalNumberOfSlices = console.nextInt();

        System.out.print("Number Of Recipients: ");
        int numberOfRecipients = console.nextInt();

        System.out.print("How many slices each person gets: ");
        int numberOfSlicesEachPersonGets = console.nextInt();

        System.out.print("Result's: " + EqualSlices(totalNumberOfSlices, numberOfRecipients, numberOfSlicesEachPersonGets));
    }

    public static boolean EqualSlices(int totalNumberOfSlices, int numberOfRecipients, int numberOfSlicesEachPersonGets) {
        int helper = numberOfRecipients * numberOfSlicesEachPersonGets;

        return helper <= totalNumberOfSlices;
    }
}
