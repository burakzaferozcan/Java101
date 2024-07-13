import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ücret tutarını giriniz : ");
        double tutar = input.nextDouble();
        double KDV;
        if (tutar < 1000) {
            KDV = 0.18;
        } else {
            KDV = 0.8;
        }
        double KDVTutar = tutar * KDV;
        double KDVliTutar = tutar + KDVTutar;
        System.out.println("KDV'siz tutar : " + tutar);
        System.out.println("KDV'li tutar : " + KDVliTutar);
        System.out.println("KDV tutarı : " + KDVTutar);
        System.out.println("KDV oranı : " + KDV);


    }
}
