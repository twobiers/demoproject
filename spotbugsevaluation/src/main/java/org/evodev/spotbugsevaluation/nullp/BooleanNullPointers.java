package org.evodev.spotbugsevaluation.nullp;

public class BooleanNullPointers {

  public Boolean aBoolean = null;
  public Boolean bBoolean = false;

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
    aBoolean = false;
    return aBoolean;
  }
}
