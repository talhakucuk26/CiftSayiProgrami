package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, n = 0;
        int toplam = 0;
        double ort;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 4 == 0 && i % 3 == 0) {
                System.out.print(i + ",");
                toplam += i;
                n++;
            }
        }
        System.out.println("\n");

        ort = toplam / n;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması :" + ort);
    }
}