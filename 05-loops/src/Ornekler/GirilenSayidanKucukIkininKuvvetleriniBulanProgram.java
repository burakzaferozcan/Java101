package Ornekler;

import java.util.Scanner;

public class GirilenSayidanKucukIkininKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sınır sayısını giriniz : ");
        int n=input.nextInt();
        System.out.println("2'nin kuvvetleri :");
        for (int i = 1; i <= n; i*=2) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("4'ün kuvvetleri :");
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("5'in kuvvetleri :");
        for (int i = 1; i <= n; i *= 5) {
            System.out.print(i+" ");
        }
    }
}
