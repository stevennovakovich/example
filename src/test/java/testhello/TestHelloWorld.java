package testhello;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import hello.Greeter;

public class TestHelloWorld {
  public void testHelloWorld() {
    Greeter greeter = new Greeter();
    String val = greeter.sayHello();
    Assert.assertEquals("Hello world!", val);
  }
}
