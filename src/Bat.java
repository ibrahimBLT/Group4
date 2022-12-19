public class Bat extends Mammal {

    public Bat(String name, String bodyCovering, String color, char gender, int age, int numberOfLegs,
               String size, double weight, String speed, String habitatArea, boolean canFly, boolean canSwim,
               String fat, String earShape, String tailSize) {
        super(name, bodyCovering, color, gender, age, numberOfLegs, size, weight, speed, habitatArea, canFly, canSwim, fat, earShape, tailSize);
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
