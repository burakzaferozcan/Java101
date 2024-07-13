import java.util.Scanner;

public class HesapMakinasiIfElse {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.println("1-toplama\n2-cikarma\n1-çarpma\n2-bölme");
        System.out.print("seçiniz : ");
        select = input.nextInt();
        if (select == 1) {
            System.out.println(n1 + n2);
        } else if (select == 2) {
            System.out.println(n1 - n2);
        } else if (select == 3) {
            System.out.println(n1 * n2);
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println(n1 / n2);
            } else {
                System.out.println("bir sayı 0'a bölünemez");
            }
        } else {
            System.out.println("geçerli bir işlem seçmediniz!!!");
        }
    }
}
