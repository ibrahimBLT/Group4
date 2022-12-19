public class Salmon extends Fish {

    public Salmon(String name, String color,
                  char gender, int age, String size, double weight, String speed) {
        super(name, color, gender, age, size, weight, speed);


    }

    @Override
    public void setHasTeeth(boolean hasTeeth) {
        hasTeeth=true;
    }

    @Override
    public void setHasBone(boolean hasBone) {
        hasBone=true;
    }

    @Override
    public void setNutritionType(String nutritionType) {
        System.out.println(getName()+ " is carnivorous");
    }

    @Override
    public void setGiveBirth(String giveBirth) {
        System.out.println(getName()+ " breeds via external fertilization");
    }

    @Override
    public void setSwimSpeed(String swimSpeed) {
        System.out.println(getName()+ " swims fast");
    }

    @Override
    public String toString() {
        return "Salmon{}";
    }
    //
}


//Salmon AtlanticSalmon= new Salmon("Salmo Salar", "Brown", 'M', 2, "Big", 1.5, "Fast");

// Salmon PasificSalmon=new Salmon("Oncorhynchus", "Red", 'F', 3, "Big", 2, "Fast");