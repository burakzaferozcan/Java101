import java.util.Scanner;

public class TaksimetreProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("gidilen mesafe : ");
        double mesafe = input.nextInt(), kmBasiUcret = 2.20, acilisUcreti = 10, odenecekTutar = (mesafe * kmBasiUcret) + acilisUcreti;
        odenecekTutar = (odenecekTutar < 20) ? 20 : odenecekTutar;
        System.out.println("Odenecek Tutar = " + odenecekTutar);


    }
}
