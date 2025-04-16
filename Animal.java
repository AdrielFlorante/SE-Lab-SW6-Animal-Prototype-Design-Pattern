public interface Animal extends Cloneable {
    Animal clone(); // Cloneable
    void makeSound();
    String getType();
}
