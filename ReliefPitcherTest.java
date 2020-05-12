import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
*Program is used to test ReliefPitcher.
*
*Project_09
*@author William Baldwin-COMP 1210-004
*@version 04/03/19
*/
public class ReliefPitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**
*Method tests getters of its class.
*/
   @Test public void gettersTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 
         2.0, .125, 5, 4, 3.85, 17);
      
      Assert.assertEquals(17, p4.getSaves());
   } 
  
   /**
  *Method tests the set method.
  */  
   @Test public void settersTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 
         2.0, .125, 5, 4, 3.85, 17);
    
      p4.setSaves(10);
      Assert.assertEquals(10, p4.getSaves(), .000001);     
   }
  
  /**
  *Method compares values of rating.
  */ 
   @Test public void ratingTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 
         2.0, .125, 5, 4, 3.85, 17);
   
      Assert.assertEquals(2.4742268041237114, p4.rating(), .000001);
   }
  
  /**
  *Method tests the stat method of the class.
  */ 
   @Test public void statsTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 
         2.0, .125, 5, 4, 3.85, 17);
   
      Assert.assertEquals("5 wins, 4 losses, 17 saves, 3.85 ERA", p4.stats());
   }  
}
