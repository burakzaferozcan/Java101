import java.util.Scanner;

public class HipotenusBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("üçgenin tabanını giriniz : ");
        double taban = input.nextDouble();
        System.out.print("üçgenin yüksekliğini giriniz : ");
        double dik = input.nextDouble();
        double hipotenus = Math.sqrt((taban * taban) + (dik * dik));
        System.out.println("girdiğiniz üçgenin hipotenusu = " + hipotenus);

    }
}
