import java.util.Scanner;

public class DaireninAlaniVeCevresiProgrami {
    public static void main(String[] args) {
//        Dairenin Alanını ve Çevresini Hesaplayan Program
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz : ");
        double yaricap = input.nextInt(), pi = 3.14, alan = pi * yaricap * yaricap, cevre = 2 * pi * yaricap;
        System.out.println("dairenin alanı = " + alan);
        System.out.println("dairenin cevresi = " + cevre);

//        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        System.out.println("Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanını bulan programa hoşgeldiniz !");
        System.out.print("yaricapi giriniz : ");
        yaricap = input.nextDouble();
        System.out.print("merkez açısını giriniz : ");
        double merkezAci = input.nextDouble();
        alan = (pi * (yaricap * yaricap) * merkezAci / 360);
        System.out.println("girilen değerler için bulunan dairenin alanı : " + alan);


    }
}
