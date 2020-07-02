package org.example;

public class Class12 {

  /**
   * Stupid Method to determine whether a given int is even
   *
   * @param i number to check
   * @return true if number is even, false if number is odd (or Zero)
   */
  public static boolean isAnEvenNumber(int i) {
    int j = 0;
    for (; i > 0; i--) {
      j++;
    }
    return j != 0 && j % 2 == 0;
  }
}
