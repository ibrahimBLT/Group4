public class Reptile extends ColdBlooded {


        private String tailSize;


        public String getTailSize() {
            return tailSize;
        }


        public void setTailSize(String tailSize) {
            this.tailSize = tailSize;
        }



        public Reptile(String name, String species, String animalClass, String bodyCovering, String color, char gender, int age, int numberOfLegs, String size, double weight, String speed, String habitatArea, boolean canFly, boolean canSwim) {
            super(name, species, animalClass, bodyCovering, color, gender, age, numberOfLegs, size, weight, speed, habitatArea, canFly, canSwim);
            setTailSize(tailSize);
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
                "tailSize='" + tailSize + '\'' +
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
