package com.company;

import java.util.Scanner;

public class Task6 {
    public static void task6() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a;
        int[][] a1;
        a = new int[n][m];
        a = TwoArrays.fillWhithRandome (a,0,20);
        TwoArrays.Array (a);
        System.out.println("Массив, отраженный относительно главной диагонали, выгляди следующим образом:");
        a1 = reverce (a);
        Array1(a1);
    }
    public static int[][] reverce(int[][] a) {
        int n = a.length;
        int m = a[n-1].length;
        int[][] a1 = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a1[i][j] = a[j][i];
            }
        }
        return a1;
    }
    public static void Array1(int[][] a1) {
        for (int i = 0; i < a1.length; i++){
            for (int j = 0; j < a1[i].length; j++)
                System.out.print(a1[i][j] + ", ");
            System.out.println();}
    }
}
