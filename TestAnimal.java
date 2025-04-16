public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal fluffy = registry.createSheep("Sheep");
        fluffy.makeSound();
        System.out.println("Type: " + fluffy.getType() + ", Name: " + ((Sheep) fluffy).getName());

    }
}