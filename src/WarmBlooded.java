public class WarmBlooded extends Animal{


    static boolean hasStableTemp=true;

    static boolean isEndothermic=true;

    private String fat;
    public static boolean isIsEndothermic() {
        return isEndothermic;
    }
    public static void setIsEndothermic(boolean isEndothermic) {
        WarmBlooded.isEndothermic = isEndothermic;
    }


    public WarmBlooded(String name,  String animalClass, String bodyCovering, String color, char gender, int age, int numberOfLegs, String size, double weight, String speed, String habitatArea, boolean canFly, boolean canSwim) {
        super(name, "WormBlooded", animalClass, bodyCovering, color, gender, age, numberOfLegs, size, weight, speed, habitatArea, canFly, canSwim);
    }

    public static boolean isHasStableTemp() {
        return hasStableTemp;
    }

    public static void setHasStableTemp(boolean hasStableTemp) {
        WarmBlooded.hasStableTemp = hasStableTemp;
    }

    public String getFat() {
        return fat;
    }



    public void setFat(String fat) {
        this.fat = fat;
    }

    public void getEnergy(){
        System.out.println("Warm blooded" +" "+getName()+" is gets energy from their foods");
    }

    public void metabolicRate(){
        System.out.println("Warm blooded" +" "+getName()+" has stabil metabolicrate");
    }
    public void regulateTemp() {
        System.out.println("can regulate their temprutare");
    }

    public void defenceFungi() {
        System.out.println("they increase temperature and protect themselves against bacteria");
    }

}
/*
2-WarmBlooded
Attributes
-inherit from Animal Class attributes
-static boolean hasStableTemp=true;
-String fat (poor,normal, obese)

Methods
-constructor(super keyword)
-Getter and Setter
-regulateTemp()
-defenseFungi()
-getEnergy()(from their foods)
-metabolicRate()(it is stable)
 */