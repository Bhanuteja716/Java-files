import java.util.*;
class methods
{
   public static void main(String args[])
   {
      int[] numbers = {5, 3, 8, 1, 2};
      String[] names = {"Bhanu","Teja","Ram","Krishna"};
      Arrays.sort(numbers);
      Arrays.sort(names);
      System.out.println("Sorted numbers:"+Arrays.toString(numbers));
      System.out.println("Sorted names:"+Arrays.toString(names));
      System.out.println("Array as string:"+Arrays.toString(numbers));
      int[] fillArray = new int[5];
      Arrays.fill(fillArray, 1, 4, 99);
      System.out.println("Filled Array:"+Array.toString(fillArray));
      int[] copyArray = Arrays.copyOf(numbers, numbers.length);
      System.out.println("Copied Array:"+Arrays.toString(copyArray));
    }
}
