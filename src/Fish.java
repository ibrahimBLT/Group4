public class Fish extends ColdBlooded{

    private int fin;

    public Fish(){};

    public Fish(String name, String animalClass, String bodyCovering, String color, char gender, int age,
                int numberOfLegs, String size, double weight, String speed, String habitatArea, boolean canFly,
                boolean canSwim, String fat, int fin) {
        super(name, animalClass, bodyCovering, color, gender, age, numberOfLegs, size, weight, speed, habitatArea, canFly, canSwim, fat);
        setFin(fin);
    }

    public void giveBirth(){
        System.out.println(getName() + " is giving birth with eggs");
    }
    public void swimSpeed(){
        System.out.println(getName() + " is swimming fast");
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public String toString() {
        return "Fish{" +
                "name='" + getName() + '\'' +
                ", species='" + getSpecies() + '\'' +
                ", animalClass='" + getAnimalClass() + '\'' +
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
                ", number of fin ='" + getFin() + '\'' +
                '}';
    }
}
