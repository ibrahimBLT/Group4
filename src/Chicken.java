public class Chicken extends Bird {

    public String typeOfGrow;

    public Chicken(String name, String species, String animalClass, String bodyCovering, String color, char gender, int age, int numberOfLegs, String size, double weight, String speed, String habitatArea, boolean canFly, boolean canSwim, String beakSize, String wingSize, String typeOfGrow) {
        super(name, species, animalClass, bodyCovering, color, gender, age, numberOfLegs, size, weight, speed, habitatArea, canFly, canSwim, beakSize, wingSize);
        setTypeOfGrow(typeOfGrow);}

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
        return "Chicken{" +
                "typeOfGrow='" + typeOfGrow + '\'' +
                ", beakSize='" + beakSize + '\'' +
                ", wingSize='" + wingSize + '\'' +
                ", fat='" + fat + '\'' +
                '}';
    }
}
