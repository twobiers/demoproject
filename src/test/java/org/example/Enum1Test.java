package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Enum1Test {
  @Test
  void getTestString() {
    assertEquals(Enum1.TEST.getTestString(), "TEST TEST 123");
    assertEquals(Enum1.TEST2.getTestString(), "TEST2 TEST2 321");
  }
}