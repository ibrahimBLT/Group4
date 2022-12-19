public class Reptile extends ColdBlooded {


        private String tailSize;

    public Reptile(){};
    public Reptile(String name, String bodyCovering, String color, char gender,
                   int age, int numberOfLegs, String size, double weight, String speed, String habitatArea,
                   boolean canFly, boolean canSwim, String fat, String tailSize) {
        super(name, "Reptile", bodyCovering, color, gender, age, numberOfLegs, size, weight, speed,
                habitatArea, canFly, canSwim, fat);
      setTailSize(tailSize);
    }

    public String getTailSize() {
            return tailSize;
        }


        public void setTailSize(String tailSize) {
            this.tailSize = tailSize;
        }





        //run method
        public void run(){
            System.out.println(getName()+" is running fast");

        }


        //changeHisColor method
        public void changeHisColor(){
            System.out.println(getName()+" is changing color");;
        }

    @Override
    public String toString() {
        return "Reptile{" +
                "name='" + getName() + '\'' +
                ", species='" + "Cold Blooded" + '\'' +
                ", animalClass='" + "Reptile" + '\'' +
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
                ", tail size='" + getTailSize() + '\'' +
                '}';
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
