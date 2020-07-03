package org.evodev.spotbugsevaluation.nullp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BooleanNullPointersTest {

  BooleanNullPointers booleanNullPointers;

  @BeforeEach
  void setUp() {
    booleanNullPointers = new BooleanNullPointers();
  }

  @Test
  void returnDirectNullReturnsNull() {
    assertNull(booleanNullPointers.returnDirectNull());
  }

  @Test
  void returnNullFromVariableReturnsNull() {
    assertNull(booleanNullPointers.returnNullFromVariable());
  }

  @Test
  void returnNullFromOneVariableWithNotNullValueThrowsNullPointerException() {
    assertThrows(
        NullPointerException.class,
        () -> booleanNullPointers.returnNullFromOneVariableWithNotNullValue());
  }

  @Test
  void returnBooleanFromWrittenVariableReturnsFalse() {
    assertFalse(booleanNullPointers.returnBooleanFromWrittenVariable());
  }
}
