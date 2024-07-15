package Ornekler;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminiOyunu {
    public static void main(String[] args) {
        int number2 = (int) (Math.random() * 100);
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        ArrayList<Integer> wrong = new ArrayList<>();
        boolean isWin = false;
        System.out.println("Sayı Tahmini Oyununa Hoşgeldiniz!");
        while (right < 5) {
            System.out.println("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();
            if (selected < 0 || selected > 100) {
                System.out.println("Lütfen 0-100 arası bir değer giriniz.");
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler doğru tahmin ettiniz ! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı Tahmin ettiniz!");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }
                wrong.add(selected);
                right++;
                System.out.println("Kalan hakkın : " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz !");
            System.out.println("Tahminleriniz : " + wrong.toString());
        }
    }

}
