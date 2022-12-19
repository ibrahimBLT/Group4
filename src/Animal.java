public class Animal {

        private String name, species, animalClass, bodyCovering, color;
        private char gender;
        private int age, numberOfLegs;
        private String size;
        private double weight;
        private String speed, habitatArea;
        private boolean canFly, canSwim;
        public Animal (){};
        public Animal(String name, String species, String animalClass, String bodyCovering, String color, char gender, int age, int numberOfLegs, String size, double weight, String speed, String habitatArea, boolean canFly, boolean canSwim) {
            setName(name);
            setSpecies(species);
            setAnimalClass(animalClass);
            setBodyCovering(bodyCovering);
            setColor(color);
            setGender(gender);
            setAge(age);
            setNumberOfLegs(numberOfLegs);
            setSize(size);
            setWeight(weight);
            setSpeed(speed);
            setHabitatArea(habitatArea);
            setCanFly(canFly);
            setCanSwim(canSwim);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }

        public String getAnimalClass() {
            return animalClass;
        }

        public void setAnimalClass(String animalClass) {
            this.animalClass = animalClass;
        }

        public String getBodyCovering() {
            return bodyCovering;
        }

        public void setBodyCovering(String bodyCovering) {
            this.bodyCovering = bodyCovering;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getNumberOfLegs() {
            return numberOfLegs;
        }

        public void setNumberOfLegs(int numberOfLegs) {
            this.numberOfLegs = numberOfLegs;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public String getSpeed() {
            return speed;
        }

        public void setSpeed(String speed) {
            this.speed = speed;
        }

        public String getHabitatArea() {
            return habitatArea;
        }

        public void setHabitatArea(String habitatArea) {
            this.habitatArea = habitatArea;
        }

        public boolean isCanFly() {
            return canFly;
        }

        public void setCanFly(boolean canFly) {
            this.canFly = canFly;
        }

        public boolean isCanSwim() {
            return canSwim;
        }

        public void setCanSwim(boolean canSwim) {
            this.canSwim = canSwim;
        }

        public void move(){
            System.out.println(name+ " is moving");
        }
        public void makeSound(){
            System.out.println(name+ " is making sound");
        }
        public void eat(){
            System.out.println(name+ " is eating");
        }
        public void sleep(){
            System.out.println(name+ " is sleeping");
        }

        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", species='" + species + '\'' +
                    ", animalClass='" + animalClass + '\'' +
                    ", bodyCovering='" + bodyCovering + '\'' +
                    ", color='" + color + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    ", numberOfLegs=" + numberOfLegs +
                    ", size='" + size + '\'' +
                    ", weight=" + weight +
                    ", speed='" + speed + '\'' +
                    ", habitatArea='" + habitatArea + '\'' +
                    ", canFly=" + canFly +
                    ", canSwim=" + canSwim +
                    '}';
        }
    }


