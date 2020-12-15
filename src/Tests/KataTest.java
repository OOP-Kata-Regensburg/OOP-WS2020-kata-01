import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import junit.framework.JUnit4TestAdapter;
import org.junit.AfterClass;
public class KataTest {

private int[] values; 
private String testString; 
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
private static int correctMethods = 0; 
    // declare
  
    @Before
    public void setUp() throws Exception 
    {
      // define
      values = new int[] {1, 2, 3, 4, 5, 6, 7};
      testString = "regal";
    }

    @Test
    public void kataIntArrayMaximum() {
      String str = "Failure: The maximum value is expected to be %d which is not equal to the result of kataIntArrayMaximum which returned %d!";

      int testValue = Kata.kataIntArrayMaximum(values);

      try {
        assertEquals(String.format(str, 7, testValue), 7, testValue);
        correctMethods++;   

      } catch (AssertionError ae) {
        System.out.println("\n" + ANSI_RED + String.format(str, 7, testValue));
      }
    }

    @Test
    public void kataIntArrayAverage() {
      String str = "Failure: The average value is expected to be %d which is not equal to the result kataIntArrayAverage which returned %d!";

      int testValue = Kata.kataIntArrayAverage(values);


       try{
        assertEquals(String.format(str, 4, testValue), 4, testValue); 
        correctMethods++;  

       } catch (AssertionError ae){
        System.out.println("\n" + ANSI_RED + String.format(str, 4, testValue));
       }
    }

    @Test
    public void kataStringReversed() 
    {
      String str = "Failure: The average value is expected to be %s which is not equal to the result kataStringReversed which returned %s!";

      String testValue = Kata.kataStringReversed(testString);

      try{
        assertEquals("lager", Kata.kataStringReversed(testString));
        correctMethods++;  

      } catch (AssertionError ae){
          System.out.println("\n" + ANSI_RED + String.format(str, "lager", testValue));
      }
    }
    
    @Test
    public void kataStringReplaceA() 
    {
      String str = "Failure: The average value is expected to be %s which is not equal to the result kataStringReplaceA which returned %s!";
      
      String testValue = Kata.kataStringReplaceA(testString);

      try{
        assertEquals("regel", Kata.kataStringReplaceA(testString));
        correctMethods++;  

      } catch (AssertionError ae){
          System.out.println("\n" + ANSI_RED + String.format(str, "regel", testValue));
      }
    }

    @AfterClass
    public static void checkIfAllCorrect(){
      if (correctMethods == 4){
        System.out.println(ANSI_GREEN + "all correct. Great!");
      }
    }
    public static void main(String[] args) {
      junit.textui.TestRunner.run(suite());
    }

    public static junit.framework.Test suite() 
    {
      return new JUnit4TestAdapter(KataTest.class);
    }
}
