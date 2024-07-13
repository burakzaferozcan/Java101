import java.util.Scanner;

public class HavaDurumunaGoreEtkinlikOnerenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sıcaklık giriniz : ");
        int sicaklik=input.nextInt();
        if(sicaklik<5){
            System.out.println("kayak yapabilirsiniz ");
        } else if (sicaklik>=5 && sicaklik<=25) {
            if(sicaklik<=15){
                System.out.println("sinemaya gidebilirsiniz ");
            }if(sicaklik>=10){
                System.out.println("pikniğe gidebilirsiniz ");
            }
        }else{
            System.out.println("yüzmeye gidebilirsiniz ");
        }

    }
}
