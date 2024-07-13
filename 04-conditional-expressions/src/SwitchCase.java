import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 1 - 7 arası bir sayı giriniz");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("1 ile 7 arası bir sayı girmediniz!");
        }
        int points=6;

        switch(points)

        {

            case 6: ;

            case 7: System.out.println("Java");break;

            case 8: ;

            case 9: System.out.println("101");break;

            case 10: System.out.println("Patika"); break;

            default: System.out.println("Dev");

        }

    }
}
