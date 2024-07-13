package Ornekler;

import java.util.Scanner;

public class TersUcgenCizenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayısı : ");
        int basamakSayisi = input.nextInt();

        for (int i = basamakSayisi; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
