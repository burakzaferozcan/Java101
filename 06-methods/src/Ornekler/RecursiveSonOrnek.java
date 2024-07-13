package Ornekler;
// Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan
// 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
// Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
// Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

import java.util.Scanner;

public class RecursiveSonOrnek {
    static void printPattern(int number, int temp, boolean isDecreasing) {
        System.out.print(temp + " ");
        if (temp <= 0) {
            isDecreasing = false;
        }
        if (temp != number || isDecreasing) {
            if (isDecreasing) {
                printPattern(number, temp - 5, isDecreasing);
            } else {
                printPattern(number, temp + 5, isDecreasing);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = scanner.nextInt();
        printPattern(n, n, true);
    }
}
