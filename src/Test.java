import javax.lang.model.SourceVersion;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Eagle eagle1 = new Eagle("Phoenix","feathered","black",'F',2,
                2, "Small", 4, "Fast", "mountain",true,
                false,"fat","long","large");
        Eagle eagle2 = new Eagle("Talon","feathered","grey",'M',1,
                2, "Small", 2, "Slow", "mountain",true,
                false,"fat","small","small");
        Eagle eagle3 = new Eagle("Maverick","feathered","white",'F',3,
                2, "Small", 2.5, "Medium", "mountain",true,
                false,"fat","small","medium");


        Chicken chicken1 = new Chicken("Albert Eggstein","feathered","yellow", 'M',1,
                2,"small", 1,"slow", "coop",false,false,
                "weak","small","small", "poultry");
        Chicken chicken2 = new Chicken("Big Bird","feathered","black", 'F',2,
                2,"small", 1,"slow", "coop",false,false,
                "weak","small","small", "Free range chicken");
        Chicken chicken3 = new Chicken("Big Red","feathered","white", 'F',1,
                2,"small", 1,"slow", "coop",false,false,
                "weak","small","small", "poultry");

        Iguana iguana1 = new Iguana();
        Iguana iguana2 = new Iguana();
        Iguana iguana3 = new Iguana();

        Lizard lizard1 = new Lizard();
        Lizard lizard2 = new Lizard();
        Lizard lizard3 = new Lizard();

        Salmon salmon1 = new Salmon();
        Salmon salmon2 = new Salmon();
        Salmon salmon3 = new Salmon();

        GoldFish goldFish1 = new GoldFish();
        GoldFish goldFish2 = new GoldFish();
        GoldFish goldFish3 = new GoldFish();

        Bat bat1= new Bat();
        Bat bat2= new Bat();
        Bat bat3= new Bat();

        Zoo zoo1 = new Zoo();
        Zoo zoo2 = new Zoo();
        Zoo zoo3 = new Zoo();

        Reptile reptile1 = new Reptile();
        reptile1.setName("Joe");

        Reptile reptile2 = new Reptile();
        reptile2.setName("Jack");

        Mammal mammal1 = new Mammal();
        mammal1.setName("Mark");
        Mammal mammal2 = new Mammal();
        mammal2.setName("Kely");

        zoo1.addReptile(reptile1);
        zoo1.addMammal(mammal2);

        zoo2.addMammal(mammal1);
        zoo2.addMammal(mammal2);
        zoo2.addReptile(reptile2);


        zoo3.addBird(chicken1);
        zoo3.addBird(chicken2);
        zoo3.addBird(chicken3);
        zoo3.addBird(eagle1);
        zoo3.addBird(eagle2);
        zoo3.addBird(eagle3);


        System.out.println(zoo1);

        System.out.println(zoo2);

        System.out.println("mammal2 = " + mammal2);
        System.out.println("mammal2 = " + mammal2);
        System.out.println("zoo3 = " + zoo3);

       System.out.println(zoo3.birds.get(0).getAnimalClass() + " " + zoo3.birds.get(0).getName() + " is " + zoo3.birds.get(0).getColor());
        System.out.println(chicken1.getName() + " is " + zoo3.birds.get(0).getColor());

    }
}
