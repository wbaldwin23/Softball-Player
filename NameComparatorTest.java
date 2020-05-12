import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
*Class tests NameComparator and its methods.
*/
public class NameComparatorTest {


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
      
      NameComparator p = new NameComparator();
      Assert.assertEquals(-9, p.compare(roster[0], roster[1])); 
   }
}
