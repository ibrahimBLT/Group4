public class Test {
    public static void main(String[] args) {

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

        Eagle eagle1 = new Eagle();
        Eagle eagle2 = new Eagle();
        Eagle eagle3 = new Eagle();

        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();

        Bat bat1= new Bat();
        Bat bat2= new Bat();
        Bat bat3= new Bat();


        Zoo zoo1 = new Zoo();
        Zoo zoo2 = new Zoo();

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

        System.out.println(zoo1);

        System.out.println(zoo2);
    }
}
