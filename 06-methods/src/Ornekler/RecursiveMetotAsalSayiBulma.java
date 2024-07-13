package Ornekler;

import java.util.Scanner;

public class RecursiveMetotAsalSayiBulma {
    static boolean isPrime(int number, int divisor) {
        if (number < 2) {
            return false; // 2'den küçük sayılar asal değildir
        }
        if (divisor == 1) {
            return true; // Bölene kadar geldik ve bölünebilecek bir sayı bulamadık, o zaman asaldır
        }
        if (number % divisor == 0) {
            return false; // Sayı bölünüyorsa asal değildir
        }
        return isPrime(number, divisor - 1); // Bir sonraki bölene geç
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = scanner.nextInt();
        if (isPrime(number, number / 2)) {
            System.out.println(number + " sayısı ASALDIR!");
        } else {
            System.out.println(number + " sayısı ASAL değildir!");
        }
    }
}
