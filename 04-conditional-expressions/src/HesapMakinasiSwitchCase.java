import java.util.Scanner;

public class HesapMakinasiSwitchCase {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.println("1-toplama\n2-cikarma\n3-çarpma\n4-bölme");
        System.out.print("seçiniz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("bir sayı 0'a bölünemez");
                        break;
                    default:
                        System.out.println(n1 / n2);
                        break;
                }
                break;
            default:
                System.out.println("geçerli bir işlem seçmediniz!!!");
        }
    }
}
