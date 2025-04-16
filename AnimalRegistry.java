public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry (Sheep sheepPrototype) {
        this.sheepPrototype = sheepPrototype;
    }

    public AnimalRegistry (Cow cowPrototype) {
        this.cowPrototype = cowPrototype;
    }

    public AnimalRegistry (Horse horsePrototype) {
        this.horsePrototype = horsePrototype;
    }

    public Animal createSheep (String name) {
        return Animal;
    }
}
