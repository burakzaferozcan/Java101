import java.util.Scanner;
public class UcakBiletiFiyatiHesaplayanProgram {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Mesafeyi km türünden giriniz : ");
            double mesafe = scanner.nextDouble();

            System.out.print("Yaşınızı giriniz : ");
            int yas = scanner.nextInt();

            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            int yolculukTipi = scanner.nextInt();

            double mesafeBasiUcret = 0.10; // km başına ücret
            double yasIndirimiOrani = 0.0;
            double yolculukIndirimiOrani = 0.0;

            if (mesafe <= 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
                System.out.println("Hatalı Veri Girdiniz !");
                return;
            }

            double normalTutar = mesafe * mesafeBasiUcret;

            if (yas < 12) {
                yasIndirimiOrani = 0.50;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimiOrani = 0.10;
            } else if (yas > 65) {
                yasIndirimiOrani = 0.30;
            }

            double yasIndirimi = normalTutar * yasIndirimiOrani;
            double indirimliTutar = normalTutar - yasIndirimi;

            if (yolculukTipi == 2) {
                yolculukIndirimiOrani = 0.20;
            }

            double yolculukIndirimi = indirimliTutar * yolculukIndirimiOrani;
            double toplamTutar = (indirimliTutar - yolculukIndirimi) * (yolculukTipi == 2 ? 2 : 1);

            System.out.printf("Toplam Tutar = %.2f TL%n", toplamTutar);

            scanner.close();
    }
}
