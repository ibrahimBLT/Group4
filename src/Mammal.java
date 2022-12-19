public class Mammal extends WarmBlooded {

    private String earShape;
    private String tailSize;

    public Mammal(){};
    public Mammal(String name, String bodyCovering, String color, char gender, int age, int numberOfLegs, String size, double weight, String speed, String habitatArea, boolean canFly, boolean canSwim, String fat, String earShape , String tailSize) {
        super(name, "Mammal", bodyCovering, color, gender, age, numberOfLegs, size, weight, speed, habitatArea, canFly, canSwim, fat);
        setEarShape(earShape);
        setTailSize(tailSize);
    }


    public String getEarShape() {
        return earShape;
    }

    public void setEarShape(String earShape) {
        this.earShape = earShape;
    }

    public String getTailSize() {
        return tailSize;
    }

    public void setTailSize(String tailSize) {
        this.tailSize = tailSize;
    }
    public void feedBaby(){
        System.out.println(getName() + " is feeding her baby with milk");
    }

    public void giveBirth(){
        System.out.println(getName() + " with egg or normal birth");
    }

    public String toString() {
        return "Mammal{" +
                "name='" + getName() + '\'' +
                ", species='" + "WarmBlooded" + '\'' +
                ", animalClass='" + "Mammal" + '\'' +
                ", bodyCovering='" + getBodyCovering() + '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", numberOfLegs=" + getNumberOfLegs() +
                ", size='" + getSize() + '\'' +
                ", weight=" + getWeight() +
                ", speed='" + getSpeed() + '\'' +
                ", habitatArea='" + getHabitatArea() + '\'' +
                ", fat='" + getFat() + '\'' +
                ", hasStableTemp='" + hasStableTemp + '\'' +
                ", ear shape ='" + getEarShape() + '\'' +
                ", tail size='" + getTailSize() + '\'' +
                '}';
    }

}
/*
4-Mammal

Attributes
-inherit from Animal Class and WarmBlooded Class attributes
-String earShape
-String tailSize (short, medium, long)

Methods
-constructor(super keyword)
-Getter and Setter
-feedBaby()(with milk)
-giveBirth() (with egg or normal birth)

 */