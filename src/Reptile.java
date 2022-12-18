public class Reptile extends Animal{


    private String tailSize;


    //getter and setter
    public String getTailSize() {
        return tailSize;
    }

    public void setTailSize(String tailSize) {
        this.tailSize = tailSize;
    }




    @Override
    public void setAnimalClass(String animalClass) {
        super.setAnimalClass(animalClass);
    }


   // public void setColdBloodedClass(){}


    //constructor (super keyword)
    public Reptile(String name, String species, String animalClass, String bodyCovering, String color, char gender, int age, int numberOfLegs, String size, double weight, String speed, String habitatArea, boolean canFly, boolean canSwim) {
        super(name, species, animalClass, bodyCovering, color, gender, age, numberOfLegs, size, weight, speed, habitatArea, canFly, canSwim);
    }


    //run method
    public void run(String fast, String slow){
        System.out.println();

    }


    //changeHisColor method
    public boolean changeHisColor(){
        return changeHisColor();
    }

       /*
    7-Reptiles

Attributes
-inherit from Animal Class attributes and ColdBlooded Class attributes
-String tailSize (short, medium, long)

Methods
-constructor(super keyword)
-Getter and Setter
-run() (fast or slow)
-changeHisColor()
     */

}
