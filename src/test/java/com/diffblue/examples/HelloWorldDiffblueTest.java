package com.diffblue.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class HelloWorldDiffblueTest {
  /**
   * Method under test: {@link HelloWorld#greeting(String)}
   */
  @Test
  void testGreeting() {
    // Arrange, Act and Assert
    assertEquals("Hello Not all who wander are lost", (new HelloWorld()).greeting("Not all who wander are lost"));
  }
}
