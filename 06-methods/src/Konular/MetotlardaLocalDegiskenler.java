package Konular;

// DEĞİŞKENLER TANIMLANDIKLARI KOD BLOKLARINA AİTTİRLER
public class MetotlardaLocalDegiskenler {
    static void sum(int a, int b) {
        System.out.println(a);
    }

    static void kodluyoruz(String y) {
        String x = "Java101";
        y = "Kodluyoruz";
    }

    public static void main(String[] args) {
        int a = 5;
        if (a < 10) {
            int b = 20;
        }
//        System.out.println(b); hata verir çünkü if'in içerisinde local olarak tanımlanmıştır
        String x = "Patika.dev";
        kodluyoruz(x);
        System.out.println(x);
    }
}
