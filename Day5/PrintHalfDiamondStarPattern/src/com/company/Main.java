package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int InputNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        InputNumber = sc.nextInt();
        int prev = 0;
        for (int i = 0; i < InputNumber * 2; i++) {
            int num = i;
            if (i == InputNumber) {
                prev = i - 1;
            }
            if (prev != 0) {
                num = i - ((i - prev) * 2);
            }

            for (int j = 0; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
