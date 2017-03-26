package domain;
import java.util.*;
/**
 * Created by aubrey on 25/03/2017.
 */
public class CollectionClass {

    public List<String> cars(){
        List<String> carBrands = new ArrayList<String>();

        carBrands.add("BMW");
        carBrands.add("Toyota");
        carBrands.add("Ford");
        carBrands.add("Mazda");
        carBrands.add("Audi");
        carBrands.add("Honda");

        return carBrands;
    }

    public Set<String> laptop(){
        Set<String> laptopBrands = new HashSet<String>();
        laptopBrands.add("Lenovo ThinkPad");
        laptopBrands.add("HP Pro");
        laptopBrands.add("Dell");
        laptopBrands.add("Toshiba");
        laptopBrands.add("Acer");
        laptopBrands.add("Sony");

        return laptopBrands;
    }

    public Map<Integer, String> dogs(){
        Map<Integer, String> dogBreeds = new HashMap<Integer, String>();
        dogBreeds.put(1,"American Pitbull Terrier");
        dogBreeds.put(2,"Bull Terrier");
        dogBreeds.put(3,"Bull Dog");
        dogBreeds.put(4,"Boxer");
        dogBreeds.put(5,"German Shepherd");
        dogBreeds.put(6,"Doberman");
        dogBreeds.put(7,"Rottweiler");

        return dogBreeds;
    }
}
