package org.evodev.spotbugsevaluation.nullp;

public class BooleanNullPointers {

  private static final Boolean ABOOLEAN = null;
  private Boolean bBoolean = false;

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

  /** @return should always be null */
  public Boolean returnBooleanFromWrittenVariable() {
    bBoolean = null;

    return bBoolean;
  }

  public Boolean getbBoolean() {
    return bBoolean;
  }
}
