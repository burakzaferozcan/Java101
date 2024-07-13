package Ornekler;

import java.util.Scanner;

public class CiftVeDortunKatlariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        do {
            System.out.print("Bir sayı girin (Tek bir sayı girdiğinizde program sonlanacaktır): ");
            sayi = input.nextInt();

            if ((sayi % 2 == 0)&&(sayi % 4 == 0) ) {
                    toplam += sayi;
            }
        } while (sayi % 2 == 0);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + toplam);
    }
}
