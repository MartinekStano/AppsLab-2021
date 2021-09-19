package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Height Of Step: ");
        double heightOfStep = console.nextDouble();
        System.out.print("Length Of Step: ");
        double lengthOfStep = console.nextDouble();
        System.out.print("Tower Of Step: ");
        double towerHeight = console.nextDouble();

        System.out.print("Total distance is: "+TotalDistance(heightOfStep, lengthOfStep, towerHeight));

    }
    public static double TotalDistance(double heightOfStep, double lengthOfStep, double towerHeight)
    {
        return (towerHeight/heightOfStep)*(heightOfStep+lengthOfStep);
    }
}
