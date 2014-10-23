/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrproject.cpe3213.squareroot;

import java.util.Scanner;

/**
 *
 * @author RainWhileLoop
 */
public class SquareRoot {

    static int i = 0;
    static int test = 1;
    public static void main(String args[]) {
        new SquareRoot();
    }

    public SquareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for calculate square root");
        System.out.print("Input Number : ");
        double number = scanner.nextDouble();
        Double result = mySquareRoot(number);
//        Double result = squareRoot(number);
        System.out.println("X = " + Math.sqrt(number));
    }
/**
 * 
 * @param input is a value that want to find a square root 
 * @return 
 */
    private Double mySquareRoot(Double input) {
        Double result = 1.0d;
        Double sub = 0.0d;
        while (sub < input) {
            sub = test * result;
            test++;
            result++;
        }
        test--;
        input = (input - sub) * 100;
        test = test * 10 + 1;
        if (i != 10) {
            i++;
            result = mySquareRoot(input);
        }

        return result;
    }
    /**
     *     I found from   http://www.cs.wustl.edu/~kjg/CS101_SP97/Notes/SquareRoot/sqrt.html
     */
    private static Double squareRoot(double x) {
        
        return test(x, 1);
    }

    private static double test(double x, double g) {
        if (closeEnough(x / g, g)) {
            return g;
        } else {
            return test(x, betterGuess(x, g));
        }
    }

    private static boolean closeEnough(double a, double b) {
        return (Math.abs(a - b) < .001);
    }

    private static double betterGuess(double x, double g) {
        return ((g + x / g) / 2);
    }
}
