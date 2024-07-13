package Ornekler;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int sum(int a, int b) {
        System.out.println("Toplama : " + (a + b));
        return a + b;
    }

    static int minus(int a, int b) {
        System.out.println("Çıkarma : " + (a - b));
        return a - b;
    }

    static int times(int a, int b) {
        System.out.println("Çarpma : " + (a * b));
        return a * b;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("ikinci sayı 0'dan farklı olmalıdır");
            return 0;
        }
        System.out.println("Bölme : " + (a / b));
        return a / b;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("çevresi : " + (2 * (a + b)));
        System.out.println("alanı : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- toplama işlemi\n" +
                "2- çıkarma işlemi\n" +
                "3- çarpma işlemi\n" +
                "4- bölme işlemi\n" +
                "5- üslü sayı hesaplama\n" +
                "6- mod alma işlemi\n" +
                "7- dikdörtgen alan ve çevre hesabı\n" +
                "0- çıkış yap";
        while (true) {
            System.out.println(menu);
            System.out.print("bir işlem seçiniz : ");
            select = input.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("ilk sayiyi giriniz : ");
            int a = input.nextInt();
            System.out.print("ikinci sayiyi giriniz : ");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("üs hesabı : " + power(a, b));
                    break;
                case 6:
                    System.out.println("mmod işlemi : " + mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("geçersiz bir işlem seçtiniz!!!");
            }
        }
        System.out.println("hesap makinesinden çıkıldı by bys");

    }
}