public class Bird extends WarmBlooded{

    public String beakSize;
    public String wingSize;

    public Bird(String name, String species, String animalClass,
                String bodyCovering, String color, char gender, int age, int numberOfLegs,
                String size, double weight, String speed, String habitatArea, boolean canFly,
                boolean canSwim, String beakSize, String wingSize) {
        super(name, species, animalClass, bodyCovering, color, gender, age, numberOfLegs,
                size, weight, speed, habitatArea, canFly, canSwim);
        setBeakSize(beakSize);
        setWingSize(wingSize);
    }

    public String getBeakSize() {
        return beakSize;
    }

    public void setBeakSize(String beakSize) {
        if (beakSize.equals("small") || beakSize.equals("medium") || beakSize.equals("long")) {
            this.beakSize = beakSize;
        } else {
            System.out.println("Invalid beakSize = " + beakSize);
            System.exit(1);
        }
    }

    public String getWingSize() {
        return wingSize;
    }

    public void setWingSize(String wingSize) {
        if (wingSize.equals("small")  || wingSize.equals("medium") || wingSize.equals("large")){
            this.wingSize = wingSize;
        } else {
            System.out.println("Invalid wingSize = " + wingSize);
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return "Bird{" +
                "beakSize='" + beakSize + '\'' +
                ", wingSize='" + wingSize + '\'' +
                ", fat='" + fat + '\'' +
                '}';
    }
}

