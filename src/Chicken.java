public class Chicken extends Bird {

    private String typeOfGrow;

    public Chicken(String name, String bodyCovering, String color, char gender, int age, int numberOfLegs,
                   String size, double weight, String speed, String habitatArea, boolean canFly,
                   boolean canSwim, String fat, String beakSize, String wingSize, String typeOfGrow) {
        super(name, bodyCovering, color, gender, age, numberOfLegs, size, weight, speed, habitatArea,
                canFly, canSwim, fat, beakSize, wingSize);
        setTypeOfGrow(typeOfGrow);
    }

    public String getTypeOfGrow() {
        return typeOfGrow;
    }

    public void setTypeOfGrow(String typeOfGrow) {
        if(typeOfGrow.equals("Free range chicken")||typeOfGrow.equals("poultry")){
        this.typeOfGrow = typeOfGrow;
    }else {
            System.out.println("Invalid typeOfGrow = " + typeOfGrow);
            System.exit(1);
        }

}

    @Override
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
                ", beak size='" + getBeakSize() + '\'' +
                ", wing size='" + getWingSize() + '\'' +
                ", type of grow='" + getTypeOfGrow() + '\'' +
                '}';
    }
}
