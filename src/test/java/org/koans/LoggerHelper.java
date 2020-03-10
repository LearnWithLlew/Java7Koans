package org.koans;

public class LoggerHelper
{
  public static StringBuilder output = new StringBuilder();
  protected String            methodName;
  public LoggerHelper(String methodName)
  {
    this.methodName = methodName;
    output.append("Starting " + methodName + "\n");
  }
  public <T> T log(T t)
  {
    output.append("value = " + t + "\n");
    return t;
  }
  public static void clearOutput()
  {
    output = new StringBuilder();
  }
  public static String getLog()
  {
    return output.toString();
  }
}