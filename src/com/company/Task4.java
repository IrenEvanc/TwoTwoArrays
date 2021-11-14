package com.company;

import java.util.Scanner;

public class Task4 {
    public static void task4() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a;
        int c,b;
        a = new int[n][m];
        a = TwoArrays.fillWhithRandome(a, 0, 50);
        TwoArrays.printArray(a);
        printMax (a);
    }
    public static void printMax(int[][] a) {
        int max = a[0][0];
        int c = 0, b=0;
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++)
                if (a[i][j] > max) {
                    max = a[i][j];
                    c=i;
                    b=j;
                }
        }
        System.out.println("Индекс максимального элемента массива - [" +c+ "," +b+"]");}
}

