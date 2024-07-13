import java.util.Scanner;

public class ForVeWhileFarki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
//        FOR
        for(boolean run=true; run; ) {
            System.out.println("sayi giriniz for : ");
            sayi = input.nextInt();
            if(sayi<0) {
                run=false;
            }
        }

//        WHILE
        System.out.println("sayi giriniz while : ");
        sayi=input.nextInt();
        while(sayi>0){
            System.out.println("sayi giriniz while : ");
            sayi=input.nextInt();
        }

//        DO WHILE
        do{
            System.out.println("sayi giriniz do while : ");
            sayi=input.nextInt();
        }while(sayi<0);
    }
}
