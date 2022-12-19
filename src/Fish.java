
    public class Fish extends ColdBlooded{

        public Fish(String name, String color, char gender, int age, String size, double weight, String speed){
            super(name,"coldBlooded",  "scale",color, gender, age, 0,size, weight, speed, "Water", false,true);

            setName(name);
            setColor(color);
            setGender(gender);
            setAge(age);
            setSize(size);
            setWeight(weight);
            setSpeed(speed);
            setHasTeeth(hasTeeth);
            setHasBone(hasBone);
            setNutritionType(nutritionType);
            setGiveBirth(giveBirth);
            setSwimSpeed(swimSpeed);

        }
        private String name;
        private String swimSpeed;

        private boolean hasTeeth;
        private boolean hasBone;
        private String nutritionType;
        private String giveBirth;


        public boolean getHasTeeth(){return hasTeeth;}
        public boolean getHasBone(){ return hasBone;}
        public String NutritionType(){return nutritionType;}
        public String getGiveBirth(){ return giveBirth;}
        public String getSwimSpeed(){ return swimSpeed;}

        public void setHasTeeth(boolean hasTeeth){this.hasTeeth=hasTeeth;}
        public void setHasBone(boolean hasBone){this.hasBone=hasBone;}
        public void setNutritionType(String nutritionType){this.nutritionType=nutritionType;}
        public void setGiveBirth(String giveBirth){this.giveBirth=giveBirth;}

        public void setSwimSpeed(String swimSpeed) {
            this.swimSpeed = swimSpeed;
        }

        public String toString() {
            return "Fish{" +
                    "name='" + name + '\'' +
                    ", swimSpeed='" + swimSpeed + '\'' +
                    ", hasTeeth=" + hasTeeth +
                    ", hasBone=" + hasBone +
                    ", nutritionType='" + nutritionType + '\'' +
                    ", giveBirth='" + giveBirth + '\'' +
                    '}';
        }
    }

