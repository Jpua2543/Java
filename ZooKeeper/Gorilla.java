public class Gorilla extends Mammal {

    public void throwSomething() {
        this.energy -= 5;
        System.out.println("Gorilla has thrown something!");
    }

    public void eatBananas() {
        this.energy += 10;
        System.out.println("Gorilla is satisfied after eating bananas!");
    }

    public void climb() {
        this.energy -= 10;
        System.out.println("Gorilla has climbed a tree!");
    }
}
