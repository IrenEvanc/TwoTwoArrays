package com.company;

import java.util.Scanner;

public class Task2 {
    public static void task2() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a;
        a = new int[n][m];
        a = TwoArrays.fillWhithRandome(a, 0, 50);
        TwoArrays.printArray(a);
        int max = TwoArrays.findMaxArray(a);
        System.out.println("Максимальный эллемент массива = " +max);
    }
}
