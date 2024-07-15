package Konular.ConstructorKullanimi;

public class Main {
    public static void main(String[] args) {
        // Constructur ile nesne oluşturma
        Car audi = new Car("Sedan", "Audi", "Kırmızı", 85);
        Car bmw = new Car("Hatchback", "BMW", "Mavi", 110);
        Car mercedes = new Car("Coupe", "Mercedes", "Beyaz", 50);
        audi.printSpeed();
        bmw.printSpeed();
        mercedes.printSpeed();
        audi.printInfo();
        bmw.printInfo();
        mercedes.printInfo();

    }
}
