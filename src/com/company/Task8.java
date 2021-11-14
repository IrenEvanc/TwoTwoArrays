package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void task8() {
        // write your code here
        Scanner in = new Scanner(System.in);
        int[][] a;
        boolean[] a1;
        int n = in.nextInt();
        int m = in.nextInt();
        a = new int[n][m];
        a = TwoArrays.fillWhithRandome(a, 0, 4);
        TwoArrays.Array (a);
        System.out.println("Одномерный массив, элемены которого равны:");
        System.out.println("1. сумма элементов строк");
        System.out.println(Arrays.toString(Mass1(a)));
        System.out.println("2. произведениям элементов строк");
        System.out.println(Arrays.toString(Mass2(a)));
        System.out.println("3. средним арифметическим эллементов строк");
        System.out.println(Arrays.toString(Mass3(a)));
    }
    public static int[] Mass1(int[][] a) {
        int m = a[0].length;
        int[] a1 = new int[m] ;
        int k=0;
        for (int i = 0; i < a.length; i++){
            for (int j=0; j<m; j++){
                k+=a[i][j];
            }
            a1[i]=k;
            k=0;}
        return a1;
    }
    public static int[] Mass2(int[][] a) {
        int m = a[0].length;
        int[] a1 = new int[m] ;
        int k=1;
        for (int i = 0; i < a.length; i++){
            for (int j=0; j<m; j++){
                k=k*a[i][j];
            }
            a1[i]=k;
            k=1;}
        return a1;
    }
    public static double[] Mass3(int[][] a) {
        int m = a[0].length;
        double[] a1 = new double[m] ;
        double k=0;
        for (int i = 0; i < a.length; i++){
            for (int j=0; j<m; j++){
                k=(k+a[i][j]);
            }
            k=k/a.length;
            a1[i]=k;
            k=0;}
        return a1;
    }

}
