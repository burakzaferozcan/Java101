package Konular.NesneOlusturmaVeSinifMetotlari;

public class Main {
    public static void main(String[] args) {
        // Nesne oluşturma
        Car audi = new Car();
        audi.speed = 35;
        audi.color = "Kırmızı";
        audi.model = "Audi";
        audi.increaseSpeed(30);
        audi.decreaseSpeed(10);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.speed = 85;
        bmw.color = "Mavi";
        bmw.model = "BMW";
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.speed = 120;
        mercedes.color = "Beyaz";
        mercedes.model = "Mercedes";
        mercedes.printSpeed();

    }
}
