package com.company;

import java.util.Scanner;

public class Task3 {
    public static void task3()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c,b;
        int[][] a;
        a = new int[n][m];
        a = TwoArrays.fillWhithRandome(a, 0, 50);
        TwoArrays.printArray(a);
        printMin (a);
    }
    public static void printMin(int[][] a) {
        int min = a[0][0];
        int c = 0, b =0;
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++)
                if (a[i][j] < min) {
                    min = a[i][j];
                    c=i;
                    b=j;
                }
        } System.out.println("Индекс минимального элемента массива - [" +c+ "," +b+"]");
    }
}
