package org.example;

public enum Enum1 {
  TEST("TEST TEST 123"),
  TEST2("TEST2 TEST2 321");

  private final String testString;

  Enum1(String s) {
    testString = s;
  }

  public String getTestString() {
    return testString;
  }
}
