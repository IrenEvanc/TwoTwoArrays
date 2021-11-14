package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void task7() {
        // write your code here
        Scanner in = new Scanner(System.in);
        int[][] a;
        boolean[] a1;
        int n = in.nextInt();
        int m = in.nextInt();
        a = new int[n][m];
        a = TwoArrays.fillWhithRandome(a, 0, 2);
        TwoArrays.Array (a);
        System.out.println("Выведем логический вектор по следующим условиям:");
        System.out.println("1. все элементы столбца нулевые");
        System.out.println(Arrays.toString(vector1(a)));
        System.out.println("2. элементы строки упорядочены по убыванию");
        System.out.println(Arrays.toString(vector2(a)));
        System.out.println("3. строка массива симметрична");
        System.out.println(Arrays.toString(vector3(a)));
    }
    public static boolean[] vector1(int[][] a) {
        int m = a[0].length;
        boolean[] a1 = new boolean [m] ;
        boolean k=true;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < a.length; i++){
                if (a[i][j] == 0) a1[j] = k ;
                else {a1[j] = false;
                    break;}
            }
        }
        return a1;
    }
    public static boolean[] vector2(int[][] a) {
        int m = a[0].length;
        boolean[] a2 = new boolean [m] ;
        boolean k=true;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < m-1; j++) {
                if (a[i][j] >= a[i][j+1]) a2[i] = k ;
                else {a2[i] = false;
                    break;}
            }
        }
        return a2;
    }
    public static boolean[] vector3(int[][] a) {
        int m = a[0].length;
        boolean[] a3 = new boolean [m] ;
        boolean k=true;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < m-1; j++) {
                if (a[i][j] == a[i][m-1-j]) a3[i] = k ;
                else {a3[i] = false;
                    break;}
            }
        }
        return a3;
    }

}
