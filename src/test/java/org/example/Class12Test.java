package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Class12Test {
  @Test
  void isAnEvenNumber() {
    assertFalse(Class12.isAnEvenNumber(0));
    assertTrue(Class12.isAnEvenNumber(2));
    assertFalse(Class12.isAnEvenNumber(3));
    assertTrue(Class12.isAnEvenNumber(4));
    assertFalse(Class12.isAnEvenNumber(5));
  }

  @Test
  void constructionOfClass12IsPossible() {
    Class12 class12 = new Class12();
  }
}
