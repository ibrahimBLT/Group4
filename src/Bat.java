public class Bat extends Animal {

    public Bat(String name, String species, String animalClass, String bodyCovering, String color, char gender, int age, int numberOfLegs, String size, double weight, String speed, String habitatArea, boolean canFly, boolean canSwim) {
        super(name, "warmBlooded", "mammal", "feeters", "Black", gender, age, 2, "medium", weight, "fast", "caves", true, false);
    }

    @Override
    public void move() {
        System.out.println(getName() + " move fastly");
    }


    @Override
    public void makeSound() {
        System.out.println(getName() + " make ultrasonic sound that humans cannot hear.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eat fruit and insect");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleep upside down.");
    }




}
