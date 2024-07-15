package Ornekler.BoksOyunu;

import java.util.Random;

public class Match {
    Fighter f1, f2;
    int minWeight, maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            Random rand = new Random();
            boolean firstFighterStarts = rand.nextBoolean();  // %50 olasılıkla dövüşe kimin başlayacağını belirler
            System.out.println(firstFighterStarts ? this.f1.name + " ilk olarak başlıyor!" : this.f2.name + " ilk olarak başlıyor!");
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("----YENİ ROUND----");
                if (firstFighterStarts) {
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) break;
                    this.f1.health = this.f2.hit(f1);
                } else {
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) break;
                    this.f2.health = this.f1.hit(f2);
                }
                if (isWin()) break;
                System.out.println(this.f1.name + " sporcusunun sağlığı : " + this.f1.health);
                System.out.println(this.f2.name + " sporcusunun sağlığı : " + this.f2.health);
            }
        } else {
            System.out.println("sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı");
            return true;
        }
        return false;
    }
}
