package org.example;

import org.junit.jupiter.api.Test;

/** Unit test for simple App. */
public class AppTest {
  /** Rigorous Test :-) */
  @Test
  public void shouldRunWithoutException() {
    App.main(null);
  }

  @Test
  public void constructionOfAppIsPossible() {
    App app = new App();
  }
}
