package org.evodev.spotbugsevaluation.number;

import java.math.BigInteger;

public class ArithmeticalBugs {

  // Not detected by spotbugs
  public double divisionByZero(int i) {
    return new BigInteger(String.valueOf(i))
        .divide(new BigInteger(String.valueOf(0)))
        .doubleValue();
  }

  // Detected CNT_ROUGH_CONSTANT_VALUE
  public double circumference(double diameter) {
    return diameter * 3.141;
  }
}
