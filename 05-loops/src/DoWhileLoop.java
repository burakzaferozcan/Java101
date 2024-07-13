import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int year=2021;
       do{
           System.out.println(year);
       }while(year<2021);
        Scanner input = new Scanner(System.in);
        int pass;
        boolean askPass = true;
        do{
            System.out.print("şifre giriniz : ");
            pass=input.nextInt();
            if(pass==123){
                System.out.println("doğru");
                askPass=false;
            }else{
                System.out.println("yanlış");
            }
        }while(askPass);
    }
}
