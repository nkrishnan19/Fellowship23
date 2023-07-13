import junit.framework.*;

public class TestSub extends TestCase {

  public void testSub() {
    int sum = Calculator.sub(2, 4);
    assertTrue(sum == -2);
  }

}
