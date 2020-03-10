package org.koans;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.koans.helpers.Koans;
import org.koans.helpers._____;

public class Lesson3Closeable extends Koans
{
  public static class Logger extends LoggerHelper implements _____
  {
    public Logger(String methodName)
    {
      super(methodName);
    }
    public void close()
    {
      output.append("Exiting " + methodName + "\n");
    }
  }
  @Test
  public void log()
  {
    // Add logging to All Exits in invokeMethod
    Logger.clearOutput();
    try
    {
      invokeMethod(1);
      invokeMethod(3);
      invokeMethod(4);
      invokeMethod(100);
      invokeMethod(10);
    }
    catch (Exception e)
    {
      // do nothing
    }
    assertEquals(expectedLog, Logger.getLog());
  }
  private int invokeMethod(Integer i)
  {
    Logger l = new Logger("invokeMethod");
    if (i == 1)
    { return l.log(i * 2); }
    if (i == 3)
    { return l.log(i * i); }
    if (7 < i)
    { return l.log(increase(i)); }
    return l.log(5);
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
   */
  private Integer increase(Integer i)
  {
    return i / (i - 10);
  }
  private String expectedLog = "Starting invokeMethod\n" + "value = 2\n" + "Exiting invokeMethod\n"
      + "Starting invokeMethod\n" + "value = 9\n" + "Exiting invokeMethod\n" + "Starting invokeMethod\n"
      + "value = 5\n" + "Exiting invokeMethod\n" + "Starting invokeMethod\n" + "value = 1\n"
      + "Exiting invokeMethod\n" + "Starting invokeMethod\n" + "Exiting invokeMethod\n" + "";
}
