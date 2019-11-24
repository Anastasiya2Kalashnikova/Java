package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] x = new int[20];
        int[] y = new int[10];
        int[] z = new int[10];

        for (int i = 0; i < 20; i++) {
            //тело цикла
            Scanner in = new Scanner(System.in);
            x[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            //тело цикла
            y[i] = x[i];
        }

        for (int i = 10; i < 20; i++) {
            //тело цикла
            z[i-10] = x[i];
            System.out.println(z[i-10]);
        }
    }
}
