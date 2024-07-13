package Konular;

public class Overloading {
    // aynı isimle 2 ya da daha fazla adet fonksiyon tanımlamak normalde hata verir
    // ancak parametrelerinin türleri farklıysa ya da parametre sayısı farklıysa
    // istenildiği kadar tanımlanabilir ve metod overloading olur
    static void print() {
        System.out.println("Hello World");
    }

    static void print(String a) {
        System.out.println(a);
    }

    static void print(int a) {
        System.out.println(a);
    }

    static void print(int a, String b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void print(String b, int a) {
        System.out.println(b);
        System.out.println(a);
    }

    static int print(int a, int b) {
        return a + b;
    }

    //   ancak burada olduğu gibi ayni isimde ve parametreleri aynı
//   ancak dönüş değeri farklı olduğu zaman hata verir
//    static void print(int a) {
//        System.out.println(a);
//    }
//    static int print(int a) {
//        return a ;
//    }
    static void show(int a, char b) {
        System.out.print("PATİKA PATİKA ");
    }

    static void show(char a, int b) {
        System.out.print("DEV DEV ");
    }

    //hata verir
//    static int info() {
//        System.out.println("Patika");
//        return 0;
//    }
//    static void info() {
//        System.out.println("Dev");
//    }
    public static void main(String[] args) {
        print();
        print("burak zafer özcan");
        print(5);
        print(5, "burak");
        print("burak", 5);
        print(5, 5);
        show(25, 'A');
        show('B', 11);
    }
}
