package base;

import org.testng.annotations.Test;

public class Base 
{
  @Test
  public void setup()
  {
	  System.out.println("this is setup");
  }
  @Test
  public void login()
  {
	  System.out.println("this is login");
  }
}
