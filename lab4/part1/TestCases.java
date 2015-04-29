import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.fail;
import org.junit.Test;

public class TestCases
{
   private static final double DELTA = 0.00001;

   @Test
   public void testSimpleIf1()
   {
      assertEquals(1.7, SimpleIf.max(1.2, 1.7), DELTA);
   }

   @Test
   public void testSimpleIf2()
   {
      assertEquals(9.0, SimpleIf.max(9.0, 3.2), DELTA);
   }

   @Test
   public void testSimpleIf3()
   {
      assertEquals(2.5, SimpleIf.max(2.5, 0.1), DELTA);

      fail("Missing SimpleIf3");

      /* TO DO: Write one more valid test case. */
   }

   @Test
   public void testSimpleLoop1()
   {
      assertEquals(7, SimpleLoop.sum(3, 4));
   }

   @Test
   public void testSimpleLoop2()
   {
      assertEquals(7, SimpleLoop.sum(-2, 4));
   }

   @Test
   public void testSimpleLoop3()
   {

      assertEquals(10, SimpleLoop.sum(1, 4));

      fail("Missing SimpleLoop3");

      /* TO DO: Write one more valid test case to make sure that
         this function is not just returning 7. */
   }

   @Test
   public void testSimpleArray1()
   {
      /* What are those parameters?  They are newly allocated arrays
         with initial values. */
      assertArrayEquals(null, 
         SimpleArray.squareAll(new int[] {1, 2, 3}), new int[] {1, 4, 9});
   }

   @Test
   public void testSimpleArray2()
   {
      assertArrayEquals(null, 
         SimpleArray.squareAll(new int[] {7, 5}), new int[] {49, 25});
   }

   @Test
   public void testSimpleArray3()
   {

      assertArrayEquals(null,
	     SimpleArray.squareAll(new int[] {2, 4}), new int[] {4, 16});

      fail("Missing SimpleArray3");

      /* TO DO: Add a new test case. */
   }

   @Test
   public void testSimpleList1()
   {
      List<Integer> input =
         new LinkedList<Integer>(Arrays.asList(new Integer[] {1, 2, 3}));
      List<Integer> expected =
         new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 4, 9}));

      assertEquals(expected, SimpleList.squareAll(input));

      /* TO DO: Add a new test case. */
   }

   @Test
   public void testSimpleList2()
   {

      List<Integer> input =
	     new LinkedList<Integer>(Arrays.asList(new Integer[] {3, 2, 1}));
	  List<Integer> expected =
	     new ArrayList<Integer>(Arrays.asList(new Integer[] {9, 4, 1}));
		 
	  assertEquals(expected, SimpleList.squareAll(input));
      /* TO DO: Add a new test case. */
   }
   
   @Test
   public void testSimpeList3()
   {
	   List<Integer> input =
	     new LinkedList<Integer>(Arrays.asList(new Integer[] {2, 4, 5}));
	   List<Integer> expected =
	     new ArrayList<Integer>(Arrays.asList(new Integer[] {4, 16, 25}));
	   
	   assertEquals(expected, SimpleList.squareAll(input));
   }

      fail("Missing SimpleList2");
      /* TO DO: Add a new test case. */
   }


   @Test
   public void testBetterLoop1()
   {
      assertTrue(BetterLoop.contains(new int[] {7, 5}, 5));
   }

   @Test
   public void testBetterLoop2()
   {
      assertTrue(BetterLoop.contains(new int[] {7, 5, 2, 4}, 4));
   }

   @Test
   public void testBetterLoop3()
   {

      assertTrue(BetterLoop.contains(new int[] {2, 5, 6, 7, 8}, 5));
	  assertFalse(BetterLoop.contains(new int[] {2, 4, 8, 7, 6}, 1));
      /* TO DO: Write a valid test case where the expected result is false. */
   }
   
   

      fail("Missing BetterLoop3");
      /* TO DO: Write a valid test case where the expected result is false. */
   }

}
