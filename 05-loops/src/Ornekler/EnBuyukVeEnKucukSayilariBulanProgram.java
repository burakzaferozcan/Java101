package Ornekler;

import java.util.Scanner;

public class EnBuyukVeEnKucukSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Geçersiz sayı adedi.");
            return;
        }

        System.out.print("1. Sayıyı giriniz: ");
        int sayi = input.nextInt();
        int enBuyuk = sayi;
        int enKucuk = sayi;

        int i = 2;
        while (i <= n) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = input.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }

            i++;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
