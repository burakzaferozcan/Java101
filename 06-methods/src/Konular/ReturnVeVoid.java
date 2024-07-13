package Konular;

public class ReturnVeVoid {
    static void show()

    {

        System.out.println("Show metodu..");

        return;

    }
    static int sum(int a,int b){
        return a+b;
    }
    static void voidSum(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        int a=sum(20,8);
        System.out.println(a);
        voidSum(8,4);
        show();
    }
}
