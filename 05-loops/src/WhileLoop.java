import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        int k;

        System.out.println("program başladı");
        while (i <= 10) {
            System.out.println("\ni : " + i);
            k = 1;
            while (k <= 10) {
                System.out.print(" k : " + k);
                k++;
            }
            i++;

        }
        System.out.println("program bitti");


        int left=100,right=200;
        while (++left < --right) {
            System.out.println("left : "+left);
            System.out.println("right : "+right);
        }
        System.out.println("left : "+left);
        System.out.println("right : "+right);
        Scanner input = new Scanner(System.in);

        boolean isPasswordSuccess=false;
        while (!isPasswordSuccess) {
            System.out.print("şifre giriniz : ");
            int password = input.nextInt();
            if(password==123){
                System.out.println("şifre doğru");
                isPasswordSuccess=true;
            }else{
                System.out.println("şifre yanlış");
            }
        }




    }
}
