import java.util.Scanner;

public class VucutKitleIndexsiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("vücut kitle indexsi hesaplayan programa hoşgeldiniz\nlütfen boyunuzu giriniz (175) : ");
        double boy = input.nextDouble() / 100;
        System.out.print("lütfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();
        double vki= kilo/(boy*boy);
        System.out.println("vücut kitle indexsiniz = "+vki);
    }
}
