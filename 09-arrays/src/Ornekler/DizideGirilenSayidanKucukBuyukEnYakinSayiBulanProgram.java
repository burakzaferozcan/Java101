package Ornekler;

import java.util.Scanner;

public class DizideGirilenSayidanKucukBuyukEnYakinSayiBulanProgram {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int girilenSayi = scanner.nextInt();
        int kucukEnYakın = Integer.MIN_VALUE;
        int buyukEnYakın = Integer.MAX_VALUE;
        for (int i = 0; i < dizi.length; i++) {
            int sayi = dizi[i];
            if (sayi < girilenSayi && sayi > kucukEnYakın) {
                kucukEnYakın = sayi;
            }
            if (sayi > girilenSayi && sayi < buyukEnYakın) {
                buyukEnYakın = sayi;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + kucukEnYakın);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + buyukEnYakın);
    }
}