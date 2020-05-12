import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
*Method tests the RatingComparator class.
*/
public class RatingComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**
*Method tests the compare method in class.
*/
   @Test public void compareTest() {
      SoftballPlayer[] roster = new SoftballPlayer[24];
      roster[0] = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      roster[1] = new Infielder("23", "Jackie Smith", "3B", 1.25, .275, .850);
      roster[3] = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      
      RatingComparator p = new RatingComparator();
      Assert.assertEquals(-1, p.compare(roster[0], roster[1]));
      Assert.assertEquals(1, p.compare(roster[1], roster[0])); 
      Assert.assertEquals(0, p.compare(roster[0], roster[3])); 
   }
}
