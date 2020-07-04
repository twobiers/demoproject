package org.evodev.kotlinjavainterop.extensionfunctions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringExtensionsConsumerTest {

  StringExtensionsConsumer stringExtensionsConsumer;

  @Test
  void getIntegerRepresentation() {
    assertEquals(123, stringExtensionsConsumer.getIntegerRepresentation("123"));
    assertEquals(-123, stringExtensionsConsumer.getIntegerRepresentation("-123"));
    assertThrows(
        NumberFormatException.class, () -> stringExtensionsConsumer.getIntegerRepresentation(""));
    assertThrows(
        NumberFormatException.class,
        () -> stringExtensionsConsumer.getIntegerRepresentation("abc"));
    assertThrows(
        NumberFormatException.class,
        () -> stringExtensionsConsumer.getIntegerRepresentation("123abc"));
  }

  @BeforeEach
  void setUp() {
    stringExtensionsConsumer = new StringExtensionsConsumer();
  }
}
