public class Test {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        Zoo zoo2 = new Zoo();

        Reptile reptile1 = new Reptile();
        reptile1.setName("Joe");

        Reptile reptile2 = new Reptile();
        reptile2.setName("Jack");

        reptile1.setNumberOfLegs(4);
        reptile2.setNumberOfLegs(4);

        Mammal mammal1 = new Mammal();
        mammal1.setName("Mark");
        Mammal mammal2 = new Mammal();
        mammal2.setName("Kely");

        zoo1.addReptile(reptile1);
        zoo1.addMammal(mammal2);

        zoo2.addMammal(mammal1);
        zoo2.addMammal(mammal2);
        zoo2.addReptile(reptile2);

        mammal2.setNumberOfLegs(2);
        mammal1.setNumberOfLegs(4);

        System.out.println(mammal1.getNumberOfLegs());

        System.out.println(zoo1);

        System.out.println(zoo2);

        System.out.println(zoo2.fourLegs());
        System.out.println(zoo2);




    }
}
