package Konular;

public class MathSinifiVeMetotlari {
    public static void main(String[] args) {
        System.out.println("mutlak değer Math.abs(x) : " + Math.abs(-25));
        System.out.println("pi sayısı Math.PI : " + Math.PI);
        System.out.println("X'in küp köküünü verir Math.cbrt(x) : " + Math.cbrt(8));
        System.out.println("en yakın büyük tam sayıya yuvarlar Math.ceil(x.x) : " + Math.ceil(8.1));
        System.out.println("en yakın küçük tam sayıya yuvarlar Math.floor(x.x) : " + Math.floor(8.9));
        System.out.println("en tam sayıya yuvarlar Math.round(x.x) : " + Math.round(8.4));
        System.out.println("2 sayı arasında karşılaştırma yapar maksimum değerini veriri Math.max(x,y) : " + Math.max(8, 5));
        System.out.println("2 sayı arasında karşılaştırma yapar minimum değerini veriri Math.min(x,y) : " + Math.min(8, 5));
        System.out.println("üs alma işlemi yapar Math.pow(x,y) : " + Math.pow(2, 3));
        System.out.println("sıfır ile 1 arasında rastgele bir sayı üretir Math.random() : " + Math.random()*100);
        System.out.println("karekök hesaplar Math.sqrt(x,y) : " + Math.sqrt(16));
    }
}
