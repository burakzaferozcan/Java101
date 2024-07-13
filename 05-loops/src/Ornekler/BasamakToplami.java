package Ornekler;

import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int basamak;

        sayi = Math.abs(sayi);

        while (sayi != 0) {
            basamak = sayi % 10;
            toplam += basamak;
            sayi /= 10;
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}
