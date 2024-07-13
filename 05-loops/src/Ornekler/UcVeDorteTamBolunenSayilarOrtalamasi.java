package Ornekler;

import java.util.Scanner;

public class UcVeDorteTamBolunenSayilarOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int girilenSayi =input.nextInt();
        int toplam=0;
        int ucVeDorteTamBolunenSayiAdedi=0;
        double ortalama;
        for(int i = 1; i <= girilenSayi; i++) {
            if(i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                ucVeDorteTamBolunenSayiAdedi++;
            }
        }
        if (ucVeDorteTamBolunenSayiAdedi != 0) {
            ortalama = (double) toplam / ucVeDorteTamBolunenSayiAdedi;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı yok.");
        }
    }
}
