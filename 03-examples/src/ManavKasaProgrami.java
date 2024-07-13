import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kg : ");
        double armut = input.nextDouble() * 2.14;
        System.out.print("Elma kaç kg : ");
        double elma = input.nextDouble() * 3.67;
        System.out.print("Domates kaç kg : ");
        double domates = input.nextDouble() * 1.11;
        System.out.print("Muz kaç kg : ");
        double muz = input.nextDouble() * 0.95;
        System.out.print("Patlıcan kaç kg : ");
        double patlican = input.nextDouble() * 5.00;
        double toplam = armut + elma + domates + muz + patlican;
        System.out.println("Ödencek toplam tutar = " + toplam);


    }
}
