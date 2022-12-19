public class Salmon extends Fish {

    public Salmon(String name, String animalClass, String bodyCovering, String color,
                  char gender, int age, int numberOfLegs, String size, double weight,
                  String speed, String habitatArea, boolean canFly, boolean canSwim, String fat, int fin) {
        super(name, animalClass, bodyCovering, color, gender, age, numberOfLegs,
                size, weight, speed, habitatArea, canFly, canSwim, fat, fin);
    }

    public void setHasTeeth(boolean hasTeeth) {
        hasTeeth=true;
    }

      public void setNutritionType() {
        System.out.println(getName()+ " is carnivorous");
    }


    public void setGiveBirth() {
        System.out.println(getName()+ " breeds via external fertilization");
    }


    public void setSwimSpeed() {
        System.out.println(getName()+ " swims fast");
    }



}


//Salmon AtlanticSalmon= new Salmon("Salmo Salar", "Brown", 'M', 2, "Big", 1.5, "Fast");

// Salmon PasificSalmon=new Salmon("Oncorhynchus", "Red", 'F', 3, "Big", 2, "Fast");