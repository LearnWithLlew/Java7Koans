package org.koans;

import static org.junit.Assert.assertEquals;

import java.io.Closeable;
import java.io.IOException;

import org.junit.Test;
import org.koans.helpers.Koans;

public class Lesson2SurpressedExceptions extends Koans
{
  public static class AlwaysBe implements Closeable
  {
    @Override
    public void close() throws IOException
    {
      throw new RuntimeException("closing");
    }
  }
  @Test
  public void tryFinally()
  {
    try
    {
      AlwaysBe c = null;
      try
      {
        c = new AlwaysBe();
        throw new RuntimeException("try");
      }
      finally
      {
        c.close();
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
      assertEquals(___, e.getMessage());
      assertEquals(___, e.getSuppressed().length);
    }
  }
  @Test
  public void supressed()
  {
    try
    {
      try (AlwaysBe c = new AlwaysBe();)
      {
        throw new RuntimeException("try");
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
      assertEquals(___, e.getMessage());
      assertEquals(___, e.getSuppressed().length);
      assertEquals(___, e.getSuppressed()[0].getMessage());
    }
  }
}
