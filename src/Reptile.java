public class Reptile {

    public class Reptile extends Animal {


        private String tailSize;

        //coldBloodedclass's attributes
        static boolean hasStableTemp= false;
        private String fat;

        //getter and setter
        public String getTailSize() {
            return tailSize;
        }

        public static boolean isHasStableTemp() {
            return hasStableTemp;
        }

        public String getFat() {
            return fat;
        }

        public void setTailSize(String tailSize) {
            this.tailSize = tailSize;
        }


        public static void setHasStableTemp(boolean hasStableTemp) {
            Reptile.hasStableTemp = hasStableTemp;
        }

        public void setFat(String fat) {
            this.fat = fat;
        }

        @Override
        public void setAnimalClass(String animalClass) {
            super.setAnimalClass(animalClass);
            setTailSize(tailSize);
            setHasStableTemp(hasStableTemp);
            setFat(fat);

        }



        //constructor (super keyword)
        public Reptile(String name, String species, String animalClass, String bodyCovering, String color, char gender, int age, int numberOfLegs, String size, double weight, String speed, String habitatArea, boolean canFly, boolean canSwim) {
            super(name, species, animalClass, bodyCovering, color, gender, age, numberOfLegs, size, weight, speed, habitatArea, canFly, canSwim);
            setTailSize(tailSize);
            setHasStableTemp(hasStableTemp);
            setFat(fat);
        }


        //run method
        public void run(){
            System.out.println(getName()+" is running fast");

        }


        //changeHisColor method
        public void changeHisColor(){
            System.out.println(getName()+" is changing color");;
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

}
