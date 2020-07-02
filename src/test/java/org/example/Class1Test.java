package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class1Test {

  @Test
  void isAnEvenNumber() {
    assertTrue(Class1.isAnEvenNumber(2));
    assertFalse(Class1.isAnEvenNumber(3));
    assertTrue(Class1.isAnEvenNumber(4));
    assertFalse(Class1.isAnEvenNumber(5));
  }
}