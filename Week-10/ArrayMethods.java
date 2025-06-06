import java.util.Arrays;

class ArrayMethods {
     public static void main(String args[]) {
          System.out.println("Bhanu Teja");
          System.out.println("CSE24210");
          System.out.println("CSE-C");
          System.out.println("-------");
          int[] numbers = { 5, 3, 8, 1, 2 };
          String[] names = { "Bhanu", "Teja", "Ram", "Shiva" };
          Arrays.sort(numbers);
          Arrays.sort(names);
          System.out.println("Sorted numbers:" + Arrays.toString(numbers));
          System.out.println("Sorted names:" + Arrays.toString(names));
          int[] fillArray = new int[5];
          Arrays.fill(fillArray, 1, 4, 99);
          System.out.println("Filled Array:" + Arrays.toString(fillArray));
          int[] copyArray = Arrays.copyOf(numbers, numbers.length);
          System.out.println("Copied Array:" + Arrays.toString(copyArray));
     }
}
