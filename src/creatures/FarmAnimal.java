package creatures;

public abstract class FarmAnimal extends Animal implements Edbile {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {

    }
}