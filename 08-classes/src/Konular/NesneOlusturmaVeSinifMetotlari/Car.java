package Konular.NesneOlusturmaVeSinifMetotlari;

class Car {
    String type, model, color;
    int speed;
    int speedLimit = 180;

    void increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit) {
            speed += increment;
        }
    }

    void decreaseSpeed(int increment) {
        if (speed > 0) {
            speed -= increment;
        }
    }

    void printSpeed() {
        System.out.println(model + " Hızı " + speed);
    }
}
