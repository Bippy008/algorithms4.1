package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите количество чисел:");
        int num = scanner.nextInt();
        int[] mass = new int[num];
        System.out.println("Старый массив: ");
        for (int i = 0; i < num; i++) {
            mass[i] = random.nextInt(101);
            System.out.print(mass[i] + " ");
        }
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < num - 2; i += 2) {
                if (mass[i] > mass[i + 1]) {
                    isSorted = false;
                    temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                }
            }
            for (int i = 0; i < num - 1; i += 2) {
                if (mass[i] > mass[i+1]) {
                    isSorted = false;
                    temp = mass[i];
                    mass[i] = mass[i+1];
                    mass[i+1] = temp;
                }
            }
        }
        System.out.println("\n");
        System.out.println("Новый массив: ");
        for (int i = 0; i < num; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
