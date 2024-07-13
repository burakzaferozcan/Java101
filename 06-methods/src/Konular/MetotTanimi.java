package Konular;

public class MetotTanimi {
    //    METOT TANIMLAMA
    static void helloWorld(){
        System.out.println("merhaba dünya");
    }
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
    //    METOT TANIMLAMA

    public static void main(String[] args) {
//        METOT ÇAĞIRMA
        int case1 = power(2, 3);
        System.out.println(case1);
        int case2 = power(2, 6);
        System.out.println(case2);
        int case3 = power(3, 3);
        System.out.println(case3);
        helloWorld();
        helloWorld();
        helloWorld();
//        METOT ÇAĞIRMA
    }
}
