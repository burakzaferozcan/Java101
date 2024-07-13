import java.util.Scanner;

public class UcgeninAlaniniHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, alan, cevre, s;
        System.out.print("1. kenarı giriniz : ");
        a = input.nextDouble();
        System.out.print("2. kenarı giriniz : ");
        b = input.nextDouble();
        System.out.print("3. kenarı giriniz : ");
        c = input.nextDouble();
        cevre = a+b+c;
        s = cevre / 2;
        alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("üçgenin çevresi : "+cevre);
        System.out.println("üçgenin alanı : "+alan);





    }
}
