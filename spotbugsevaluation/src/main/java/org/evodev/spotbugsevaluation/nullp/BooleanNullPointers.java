package org.evodev.spotbugsevaluation.nullp;

public class BooleanNullPointers {

  private final Boolean aBoolean = null;
  private Boolean bBoolean = null;

  // Unknown detection
  public Boolean returnDirectNull() {
    return null;
  }

  // Unknown detection
  public Boolean returnNullFromVariable() {
    return aBoolean;
  }

  // Unknown detection
  public Boolean returnNullFromOneVariableWithNotNullValue() {
    return aBoolean && bBoolean;
  }

  // Unknown detection
  public Boolean returnBooleanFromWrittenVariable() {
    bBoolean = false;
    return bBoolean;
  }
}
