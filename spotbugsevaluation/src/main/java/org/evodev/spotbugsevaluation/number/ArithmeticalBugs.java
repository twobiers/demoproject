package org.evodev.spotbugsevaluation.number;

import java.math.BigInteger;

public class ArithmeticalBugs {

  // Not detected by spotbugs
  public double divisionByZero(int i) {
    String iString = String.valueOf(i);
    BigInteger bigInt = new BigInteger(iString);
    return bigInt.divide(BigInteger.ZERO).doubleValue();
  }

  // Detected CNT_ROUGH_CONSTANT_VALUE
  public double circumference(double diameter) {
    return diameter * 3.141;
  }
}
