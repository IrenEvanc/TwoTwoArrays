package com.company;

import java.util.Scanner;

public class Task1 {
    public static void task1() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a;
        a = new int[n][m];
        a = TwoArrays.fillWhithRandome(a, 0, 50);
        TwoArrays.printArray(a);

        int min = TwoArrays.findMinArray(a);
        System.out.println("Минимальный эллемент массива = " +min);
    }
}
