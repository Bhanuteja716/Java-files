import java.util.*;

class demo {
    public static void main(String args[]) {
        System.out.println("Bhanu Teja");
        System.out.println("CSE24210");
        System.out.println("CSE-C");
        System.out.println("------");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Cherry");
        System.out.println("Fruits are:" + fruits);
        fruits.add(2, "Banana");
        System.out.println("Fruits after add() method:" + fruits);
        fruits.set(1, "grapes");
        System.out.println("Fruits after set() method:" + fruits);
        System.out.println("Using remove() method:" + fruits.remove(2));
        fruits.clear();
        System.out.println("Clearing all elements:" + fruits);
    }
}