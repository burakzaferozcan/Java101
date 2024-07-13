import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("1. sayi : ");
        a = input.nextInt();
        System.out.print("2. sayi : ");
        b = input.nextInt();
        System.out.print("3. sayi : ");
        c = input.nextInt();
        if((a>b) && (a>c)){
            if(b>c){
                System.out.println("a > b > c");
            }else if(b<c){
                System.out.println("a > c > b");
            }else{
                System.out.println("a > b = c");
            }
        } else if ((b>a)&&(b>c)) {
            if(a>c){
                System.out.println("b > a > c");
            }else if(a<c){
                System.out.println("b > c > a");
            }else{
                System.out.println("b > a = c");
            }
        } else if ((c>a)&&(c>b)) {
            if(a>b){
                System.out.println("c > a > b");
            } else if (a<b) {
                System.out.println("c > b > a");
            }else{
                System.out.println("c > a = c");
            }
        }
        else{
            System.out.println("a = b = c");
        }
    }
}
