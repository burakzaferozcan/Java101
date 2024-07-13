import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        double ortalama;

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();
        System.out.print("Muzik notunuzu giriniz : ");
        muzik = input.nextInt();
        ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        boolean sonuc = ortalama >= 50;
        if (sonuc) {
            System.out.println("Dönem ortalamanız = " + ortalama + " GEÇTİNİZ");

        } else {
            System.out.println("Dönem ortalamanız = " + ortalama + " KALDINIZ");
        }
    }
}
