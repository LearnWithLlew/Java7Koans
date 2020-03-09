package org.koans;

import static org.junit.Assert.assertEquals;

import java.util.Objects;

import org.junit.Test;
import org.koans.helpers.Koans;

public class Lesson1RequireNotNull extends Koans
{
  @Test
  public void toUpperCase()
  {
    String name = getName1();
    String display = name.trim().toUpperCase();
    assertEquals(___, display);
  }
  @Test
  public void toNullerCase()
  {
    try
    {
      String name = getName2();
      String display = name.trim().toUpperCase();
    }
    catch (Exception e)
    {
      e.printStackTrace();
      assertEquals(___, e.getStackTrace()[0].getLineNumber());
    }
  }
  @Test
  public void codeWithoutNulls()
  {
    try
    {
      String name = Objects.requireNonNull(getName2());
      String display = name.trim().toUpperCase();
    }
    catch (Exception e)
    {
      e.printStackTrace();
      assertEquals(___, e.getStackTrace()[1].getLineNumber());
    }
  }
  /********************************** helper code below ********************/
  /**
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * @return
   */
  private String getName1()
  {
    return "Neo";
  }
  private String getName2()
  {
    return null;
  }
}
