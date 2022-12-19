public class ColdBlooded extends Animal {
    static boolean hasStableTemp= false;
    private String fat;

    public ColdBlooded(){};
    public ColdBlooded(String name, String animalClass, String bodyCovering, String color, char gender, int age, int numberOfLegs, String size, double weight, String speed, String habitatArea, boolean canFly, boolean canSwim, String fat) {
        super(name, "Cold Blooded", animalClass, bodyCovering, color, gender, age, numberOfLegs, size, weight, speed, habitatArea, canFly, canSwim);
        setFat(fat);
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public void regulateTemp(){
        System.out.println(getName()+ " regulates own temperature.");
    }

    public void subBath(){
        System.out.println(getName()+ " is sunbathing.");
    }

    public void getEnergy(){
        System.out.println(getName()+ " gets energy from their foods and sun that is form of heat.");
    }

    public void metabolicRate(){
        System.out.println(getName()+ "'s metabolic rate is slow." );
    }

    @Override
    public String toString() {
        return "ColdBlooded{" +
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
                ", fat='" + fat + '\'' +
                ", hasStableTemp='" + hasStableTemp + '\'' +
                '}';
    }
}
/*
Attributes
-inherit from Animal Class attributes
-static boolean hasStableTemp=false;
-String fat (poor,normal, obese)

Methods
-constructor(super keyword)
-Getter and Setter
-regulateTemp()
-sunBath()
-getEnergy()(from their foods and sun(form of heat)
-metabolicRate()(it is depends on enviroment)

 */