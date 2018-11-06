package tudelft.numfinder;

import java.util.Arrays;

public class NumFinderMain {

  public static void main(String[] args) {

    // this works
    // nf.find(new int[] {4, 25, 7, 9});

    doTheBusiness(new NumFinder(), new int[]{4, 3, 2, 1});
    doTheBusiness(new NumFinder(), new int[]{104, 3333, 22, -1});
    doTheBusiness(new NumFinder(), null);
  }

  private static void doTheBusiness(NumFinder numFinder, int[] numberArray) {
    numFinder.find(numberArray);

    try {
      System.out.println("Passed array: " + Arrays.toString(numberArray));
      System.out.println("Largest int: " + numFinder.getLargest());
      System.out.println("Smallest int: " + numFinder.getSmallest());
      System.out.println("");
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
