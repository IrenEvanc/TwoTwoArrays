package com.company;

import java.util.Random;

public class TwoArrays {
    public static int[][] fillWhithRandome(int[][] a, int start, int end) {
        // write your code here
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                Random rnd = new Random();
                a[i][j] = rnd.nextInt(end - start) + start;
            }
        }
        return a;
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + ", ");
            System.out.println();}
    }

    public static int findMinArray(int[][] a) {
        // write your code here
        int min = a[0][0];
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++)
                if (a[i][j] < min) {
                    min = a[i][j];
                }
        }
        return min;
    }

    public static int findMaxArray(int[][] a) {
        // write your code here
        int max = a[0][0];
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++)
                if (a[i][j] > max) {
                    max = a[i][j];
                }

        } return max;

    }
    public static void Array(int[][] a) {
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + ", ");
            System.out.println();}
    }

}
