package homework9;
import java.util.ArrayList;
import java.util.HashSet;


public class FruitBasket {

    public static void main(String[] args) {

        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("apple");
        fruitBasket.add("plums");
        fruitBasket.add("watermelon");
        fruitBasket.add("grapes");
        fruitBasket.add("plums");
        System.out.println(fruitBasket);

        // find fruit
        if (findFruit("plums", fruitBasket)) {
            System.out.println("The fruit is already in the basket");
        } else {
            System.out.println("The fruit you entered is not in the basket");
        }

        // remove fruit
        removeFruit("pears", fruitBasket);
        System.out.println(fruitBasket);

        // find fruit index
        indexFruit("plums", fruitBasket);

        //print set
        System.out.println(distinctFruit(fruitBasket));

        // add new fruit if not yet in basket and if not null
        System.out.println(addFruitToBasket("pears", fruitBasket));

        // number of distinct fruit
        System.out.println("Total distinct fruit in basket is " + numberOfDistinctFruit(fruitBasket));

        //customized counter
        System.out.println("Custom number of distinct fruit is " + customCounter(fruitBasket));


    }

    public static boolean findFruit(String fruit, ArrayList<String> fruitBasket) {
        if (fruitBasket.contains(fruit)) {
            return true;
        } else {return false;
           }

    }

    public static void removeFruit(String fruit, ArrayList<String> fruitBasket) {
        if (fruitBasket.contains(fruit)) {
            fruitBasket.remove(fruit);
        } else {
            System.out.println("Fruit you want removed is not in the basket");
        }
    }

    public static void indexFruit(String fruit, ArrayList<String> fruitBasket) {
        if (fruitBasket.contains(fruit)) {
            System.out.println("The position of the fruit you entered is " + fruitBasket.indexOf(fruit));
        } else {
            System.out.println ("The fruit you entered is not in the basket");
        }
    }

    public static HashSet<String> distinctFruit(ArrayList<String> fruitBasket) {
        HashSet<String> distinct = new HashSet<>();
        distinct.addAll(fruitBasket);
        return distinct;
    }

    public static ArrayList<String> addFruitToBasket(String fruit, ArrayList<String> fruitBasket) {
            if ((fruitBasket.contains(fruit)) || (fruit==null)) {
                return fruitBasket;
            } else {fruitBasket.add(fruit);
                return fruitBasket;
            }
    }

    public static int numberOfDistinctFruit (ArrayList<String> fruitBasket) {
         HashSet<String> distinct = distinctFruit(fruitBasket);
         return distinct.size();
    }

    public static int customCounter(ArrayList<String> fruitBasket) {
        int j=0;
        HashSet<String> distinct = distinctFruit(fruitBasket);
        for (String i:distinct) {
            j++;
        }
        return j;
    }
    }




