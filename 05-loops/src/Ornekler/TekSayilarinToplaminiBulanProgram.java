package Ornekler;

import java.util.Scanner;

public class TekSayilarinToplaminiBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int n;
        do {
            System.out.print("sayi giriniz programdan cikmak için '-' değer giriniz : ");
            n = input.nextInt();

                if (n % 2 == 1) {
                    toplam += n;
                }
        } while (n > 0);
        System.out.println("tek sayı toplamı : " + toplam);
    }
}
