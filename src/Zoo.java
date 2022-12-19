import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

    ArrayList<Mammal> mammals = new ArrayList<>();
    ArrayList<Reptile> reptiles = new ArrayList<>();

    public ArrayList<Mammal> addMammal(Mammal mammal){
        mammals.add(mammal);
        return mammals;
    }
    public ArrayList<Reptile> addReptile(Reptile reptile){
        reptiles.add(reptile);
        return reptiles;
    }


    @Override
    public String toString() {
        return "Zoo{" +
                "mammals=" + mammals +
                ", reptiles=" + reptiles +
                '}';
    }
}
