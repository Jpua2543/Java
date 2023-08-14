public class Bat extends Mammal {

    public Bat() {
        this.energy = 300; // overriding the default energy for bats
    }

    public void fly() {
        this.energy -= 50;
        System.out.println("Whooosh! Bat is airborne!");
    }

    public void eatHumans() {
        this.energy += 25;
        System.out.println("Well, that happened...");
    }

    public void attackTown() {
        this.energy -= 100;
        System.out.println("Fire! The town is under attack by a bat!");
    }
}
