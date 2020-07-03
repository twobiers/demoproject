package org.evodev.spotbugsevaluation.number;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmeticalBugsTest {

  ArithmeticalBugs arithmeticalBugs;

  @BeforeEach
  void setUp() {
    arithmeticalBugs = new ArithmeticalBugs();
  }

  @Test
  void circumference() {
    assertEquals(62.82, arithmeticalBugs.circumference(20));
  }

  @Test
  void divisionTest() {
    assertEquals(2.0, arithmeticalBugs.division(4, 2));
    assertThrows(ArithmeticException.class, () -> arithmeticalBugs.division(20, 0));
  }
}
