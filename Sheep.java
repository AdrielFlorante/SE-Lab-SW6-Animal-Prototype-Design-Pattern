public class Sheep implements Animal {
    private int legs = 4;
    private String sound = "Baa!";
    private String food = "Grass";
    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() {
        try {
            return (Sheep) super.clone(); // Works only if Sheep implements Cloneable
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says " + this.getSound());
    }

    @Override
    public String getType() {
        return "Sheep"; // This type of animal is a sheep
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
