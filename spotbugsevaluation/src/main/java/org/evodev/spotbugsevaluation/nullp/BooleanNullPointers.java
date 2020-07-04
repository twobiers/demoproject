package org.evodev.spotbugsevaluation.nullp;

public class BooleanNullPointers {

  private static final Boolean ABOOLEAN = null;

  // Unknown detection
  public Boolean returnDirectNull() {
    return null;
  }

  // Unknown detection
  public Boolean returnNullFromVariable() {
    return ABOOLEAN;
  }

  // Unknown detection
  public Boolean booleanOperationAnd(Boolean a, Boolean b) {
    return a && b;
  }

  /**
   * Some whack function that avoids Code Smell in Code Check and still allows to securely write a
   * null value to an not-null-initialised Boolean
   *
   * @return should always be null except your timestamp equals Long.MIN_VALUE
   */
  public Boolean returnBooleanFromWrittenVariable() {
    Boolean bBoolean = System.currentTimeMillis() > Long.MIN_VALUE;
    if (System.currentTimeMillis() > Long.MIN_VALUE) {
      bBoolean = null;
    }
    return bBoolean;
  }
}
