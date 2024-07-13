package Ornekler;

import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("üssü alınacak sayı : ");
        int n=input.nextInt();
        System.out.print("üs olacak sayı : ");
        int k=input.nextInt();
        int total=1;
        int i=1;
        while(i<=k){
            total*=n;
            i++;
        }
        System.out.println("while cevap : "+total);
        int total2=1;
        for (int i2 = 1; i2 <= k; i2++) {
            total2 *= n;
        }
        System.out.println("for cevap : "+total2);

    }
}
