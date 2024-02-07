import static org.junit.Assert.*;

import java.sql.Array;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedWithElems(){
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }
  
  @Test
  public void testReverseInPlace2(){
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3,2,1}, input1);
  }
  @Test
  public void testReverseInPlaceElems(){
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertEquals(3, input1[0]);
    assertEquals(2, input1[1]);
    assertEquals(1, input1[2]);
  }
}
