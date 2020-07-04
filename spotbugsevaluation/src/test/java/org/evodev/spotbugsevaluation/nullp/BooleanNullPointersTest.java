package org.evodev.spotbugsevaluation.nullp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
  void returnBooleanFromWrittenVariableReturnsFalse() {
    assertNull(booleanNullPointers.returnBooleanFromWrittenVariable());
  }

  @Test
  void booleanOperationAnd() {
    assertFalse(booleanNullPointers.booleanOperationAnd(true, false));
    assertTrue(booleanNullPointers.booleanOperationAnd(true, true));
    assertFalse(booleanNullPointers.booleanOperationAnd(false, false));
    assertFalse(booleanNullPointers.booleanOperationAnd(false, false));
    assertThrows(
        NullPointerException.class, () -> booleanNullPointers.booleanOperationAnd(null, false));
    assertThrows(
        NullPointerException.class, () -> booleanNullPointers.booleanOperationAnd(null, true));
    assertThrows(
        NullPointerException.class, () -> booleanNullPointers.booleanOperationAnd(true, null));

    // Special Case!
    // First element in AND Operation false -> result will always be false
    assertFalse(booleanNullPointers.booleanOperationAnd(false, null));
  }
}
