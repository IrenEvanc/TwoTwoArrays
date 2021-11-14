package com.company;

import java.util.Scanner;

public class Task5 {
    public static void task5() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a;
        int[][] a1;

        a = new int[n][m];
        a = TwoArrays.fillWhithRandome(a, 0, 50);
        a1 = NewMas(a);
        TwoArrays.Array (a);
        System.out.println("Количество элементов массива, которые больше всех своих соседей = " + Sum(a1));
    }

    public static int[][] NewMas(int[][] a) {
        int n = a.length;
        int m = a[n-1].length;
        int[][] a1 = new int[ n+ 2][m + 2];
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                a1[i][j] = a[i-1][j-1];
            }
        }
        return a1;
    }
    public static int Sum(int[][] a1) {
        int sum = 0;
        for (int i = 1; i < a1.length - 1; i++) {
            for (int j = 1; j < a1[i].length - 1; j++) {
                if (a1[i][j] > a1[i + 1][j] && a1[i][j] > a1[i - 1][j] && a1[i][j] > a1[i][j + 1] && a1[i][j] > a1[i][j - 1]) {
                    {sum++;}
                }
            }
        }
        return sum;
    }
}
