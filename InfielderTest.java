import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


 /**
*Program is used to test Infielder.
*
*Project_09
*@author William Baldwin-COMP 1210-004
*@version 04/03/19
*/
public class InfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**
*Method tests getters of its class.
*/
   @Test public void gettersTest() {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 
         1.25, .275, .850);
      Assert.assertEquals(0.850, p2.getInfielderFieldingAvg(), .000001);
   }
  
  /**
  *Method tests the set method.
  */ 
   @Test public void settersTest() {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      p2.setInfielderFieldingAvg(.950);
      Assert.assertEquals(.950, p2.getInfielderFieldingAvg(), .000001);
   }
   
   /**
  *Method compares values of rating.
  */  
   @Test public void ratingTest() {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 
         1.25, .275, .850);
      Assert.assertEquals(2.9218750000000004, p2.rating(), .000001);
   } 
}
