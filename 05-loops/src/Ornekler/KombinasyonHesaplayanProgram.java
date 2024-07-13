package Ornekler;

import java.util.Scanner;

public class KombinasyonHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini girin: ");
        int n = input.nextInt();
        System.out.print("r değerini girin: ");
        int r = input.nextInt();

        if (n >= r && n > 0 && r >= 0) {
            int nFaktoriyel = 1;
            int rFaktoriyel = 1;
            int nrFaktoriyel = 1;

            // n!
            for (int i = 1; i <= n; i++) {
                nFaktoriyel *= i;
            }

            // r!
            for (int i = 1; i <= r; i++) {
                rFaktoriyel *= i;
            }

            // (n-r)!
            for (int i = 1; i <= (n - r); i++) {
                nrFaktoriyel *= i;
            }

            int kombinasyon = nFaktoriyel / (rFaktoriyel * nrFaktoriyel);
            System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
        } else {
            System.out.println("Geçersiz değerler girdiniz. n >= r ve n > 0, r >= 0 olmalıdır.");
        }
    }
}
