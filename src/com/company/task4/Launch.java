package com.company.task4;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int count = 180;

        if (a + b + c == count){
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }




        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = sc.nextInt();
        int z = sc.nextInt();

        if (x % z == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Не делится");
        }
    }
}
