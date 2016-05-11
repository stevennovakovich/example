package testgreeter;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import hello.Greeter;

public class TestGreeter {

  @Test
  public void testGreeterOutput() {
    Greeter greeter = new Greeter();
    String val = greeter.sayHello();
    Assert.assertEquals("Hello world!", val);
  }
}
