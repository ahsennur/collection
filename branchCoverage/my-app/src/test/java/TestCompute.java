import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
//import static org.junit.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  @Test
  public void test1() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(0);
    int result=c.countNumberOfOccurrences("s");
    assertEquals(result,-1);
  }
  @Test
  public void test2() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(7);
    when(mq.contains(anyString())).thenReturn(false);
    int result=c.countNumberOfOccurrences("s");
    assertEquals(result,0);
  }
  
  
  @Test
  public void test3() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(7);
    when(mq.contains(anyString())).thenReturn(true);
    int result=c.countNumberOfOccurrences("s");
    assertNotEquals(result,-1);
  }
  
  @Test
  public void test4() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(7);
    when(mq.contains(anyString())).thenReturn(true);
    when(mq.getAt(anyInt())).thenReturn("s");
    int result=c.countNumberOfOccurrences("s");
    assertNotEquals(result,-1);
    assertNotEquals(result,0);
  }
  
}