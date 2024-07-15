package Ornekler.BoksOyunu;

public class Fighter {
    String name;
    int damage, health, weight, dodge;

    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        }
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " sporcusu => " + foe.name + " sporcusuna " + this.damage + " hasar verdi");
        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı!");
            System.out.println("----------------");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
