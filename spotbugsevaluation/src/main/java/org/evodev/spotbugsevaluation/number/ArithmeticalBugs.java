package org.evodev.spotbugsevaluation.number;

import java.math.BigInteger;

public class ArithmeticalBugs {

  // Not detected by spotbugs
  public double division(int i, int j) {
    BigInteger bigI = new BigInteger(String.valueOf(i));
    BigInteger bigJ = new BigInteger(String.valueOf(j));
    return bigI.divide(bigJ).doubleValue();
  }

  // Detected CNT_ROUGH_CONSTANT_VALUE
  public double circumference(double diameter) {
    return diameter * 3.141;
  }
}
