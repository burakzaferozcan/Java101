import java.util.Scanner;

public class SinifGecmeDurumuProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik;
        int toplamNot = 0;
        int dersSayisi = 0;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplamNot += mat;
            dersSayisi++;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
            dersSayisi++;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
            dersSayisi++;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
            dersSayisi++;
        }

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplamNot += muzik;
            dersSayisi++;
        }

        if (dersSayisi == 0) {
            System.out.println("Geçerli not girmediniz.");
        } else {
            double ortalama = toplamNot / dersSayisi;
            if (ortalama < 55) {
                System.out.println("Sınıfta kaldınız. Ortalamanız = " + ortalama);
            } else {
                System.out.println("Sınıfı geçtiniz. Ortalamanız = " + ortalama);
            }
        }
    }
}
