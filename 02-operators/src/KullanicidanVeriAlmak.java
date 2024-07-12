import java.util.Scanner;

public class KullanicidanVeriAlmak {
    public static void main(String[] args) {
        int a;
        Scanner input =new Scanner(System.in);
        System.out.print("a degerini giriniz : ");
        a=input.nextInt();
        System.out.println("girdiğiniz değer "+a);
        System.out.println("b değerini giriniz : ");
        int b=input.nextInt();
        System.out.println("girdiğiniz değer "+b);
        int toplam=a+b;
        System.out.println("girdiğiniz değerlerin toplamı = "+toplam);


    }
}
