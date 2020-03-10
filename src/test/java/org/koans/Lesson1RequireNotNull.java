package org.koans;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Objects;

import org.junit.Test;
import org.koans.helpers.HashMap___;
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
  @Test
  public void hashes() throws Exception
  {
    String name = "Zach";
    int number = 42;
    double pi = 3.14;
    int hash = Objects.hash(name, number, ___);
    assertEquals(-1325618168, hash);
  }
  @Test
  public void binaryAndUnderscores() throws Exception
  {
    int answer = 0b0_0010_1010;
    assertEquals(___, answer);
  }
  @Test
  public void binaryFlags() throws Exception
  {
    int starting = 0b0_0111_1111;
    int turnOffEveryOther = ____;
    int answer = starting ^ turnOffEveryOther;
    assertEquals(42, answer);
  }
  @Test
  public void diamondOperator() throws Exception
  {
    // get this to compile.
    HashMap<Integer, HashMap<String, Integer>> map = new HashMap___();
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
