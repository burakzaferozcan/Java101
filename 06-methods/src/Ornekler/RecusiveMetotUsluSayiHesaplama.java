package Ornekler;

import java.util.Scanner;

public class RecusiveMetotUsluSayiHesaplama {
    // Recursive metot
    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            // Üs 0 değilse, taban ile (üs - 1)'in üslü sayısını çarparak döner.
            return base * power(base, exp - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int exp = scanner.nextInt();

        int result = power(base, exp);

        System.out.println("Sonuç: " + result);
    }
}
