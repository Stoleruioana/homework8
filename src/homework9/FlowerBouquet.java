package homework9;
import java.util.ArrayList;
import java.util.HashSet;

public class FlowerBouquet {
    public static void main(String[] args) {
        HashSet<String> FlowerBouquet = new HashSet<>();
        FlowerBouquet.add("rose");
        FlowerBouquet.add("tulip");
        FlowerBouquet.add("snowdrop");
        FlowerBouquet.add("orchid");
        FlowerBouquet.add("lavender");
        FlowerBouquet.add("carnation");
        System.out.println(getAll(FlowerBouquet));
        System.out.println(addFlower("tulip", FlowerBouquet));
        removeFlower("rose", FlowerBouquet);
        System.out.println(FlowerBouquet);
    }

    public static HashSet<String> getAll(HashSet<String> flowerBouquet) {
        return flowerBouquet;
    }

    public static HashSet<String> addFlower(String flower, HashSet<String> flowerBouquet) {
        // fiind set, nu se va adauga element existent deja, de aceea nu se verifica existenta elementului in set

        if (flower!= null) {
            flowerBouquet.add(flower);
            return flowerBouquet;
        } else {
            return flowerBouquet;
        }
    }

    public static HashSet<String> removeFlower(String flower, HashSet<String> flowerBouquet) {
        if (flowerBouquet.contains(flower)) {
            flowerBouquet.remove(flower);
        } else {
            System.out.println("the flower does no exist in the bouquet");
        }
        return flowerBouquet;
    }





}


