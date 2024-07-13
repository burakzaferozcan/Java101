package Ornekler;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;

        if (n <= 0) {
            System.out.println("Geçersiz giriş! Lütfen pozitif bir sayı girin.");
        } else {
            System.out.print("Fibonacci Serisi: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");

                int next = a + b;
                a = b;
                b = next;
            }
        }

        input.close();
    }
}
