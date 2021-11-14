package com.company;

import java.util.Scanner;

public class Task9 {
    public static void task9() {

        Scanner in = new Scanner(System.in);
        int[][] a;
        int n = in.nextInt();
        a = new int[n][n];
        a = TwoArrays.fillWhithRandome(a, 1, 3);
        TwoArrays.Array(a);
        Mass1(a);
    }
    public static void Mass1(int[][] a) {
        int min = a[0][0];
        int max = a[0][0];
        int imin = 0;
        int jmin = 0;
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            min = a[i][0];
            max = a[i][0];
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    imin = i;
                    jmin = j;
                }
            }
            max = min;
            for (int k = 0; k < a.length; k++) {
                if (a[k][jmin] > max) {
                    max = a[k][jmin];
                }
            }
            if (max == min) {
                System.out.println("Координаты седловой точки " + imin + ", " + jmin);
                flag = true;
                break;
            } else {
            }
        }
        if (flag == false) {
            {
                System.out.println("Седловая точна не найдена");
            }
        }
    }
}
