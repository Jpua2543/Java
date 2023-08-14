public class Mammal {
    protected int energy = 100;

    public int displayEnergy() {
        System.out.println("Energy level: " + this.energy);
        return this.energy;
    }
}
