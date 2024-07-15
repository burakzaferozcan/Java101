package Konular.ConstructorKullanimi;

class Car {
    String type, model, color;
    int speed;
    int speedLimit = 180;

    Car(String type, String model, String color, int speed) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = speed;
        // printSpeed();
    }

    // constructor method overloading
    Car() {
    }

    void increaseSpeed(int increment) {
        if ((this.speed + increment) < this.speedLimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int increment) {
        if (this.speed > 0) {
            this.speed -= increment;
        }
    }

    void printSpeed() {
        System.out.println(this.model + " Hızı " + this.speed);
        System.out.println("-----------------------");
    }

    void printInfo() {
        System.out.println("Model : " + this.model);
        System.out.println("Renk : " + this.color);
        System.out.println("Hız : " + this.speed);
        System.out.println("Tip : " + this.type);
        System.out.println("-----------------------");
    }
}
