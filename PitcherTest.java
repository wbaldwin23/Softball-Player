import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
*Program is used to test Pitcher.
*
*Project_09
*@author William Baldwin-COMP 1210-004
*@version 04/03/19
*/
public class PitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**
*Method tests getters of its class.
*/
   @Test public void gettersTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
         2.0, .125, 22, 4, 2.85);
   
      Assert.assertEquals(22, p3.getWins());
      Assert.assertEquals(4, p3.getLosses());
      Assert.assertEquals(2.85, p3.getEra(), .000001);
   }
   
    /**
  *Method tests the set method.
  */  
   @Test public void settersTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
         2.0, .125, 22, 4, 2.85);
         
      p3.setWins(25);
      Assert.assertEquals(25, p3.getWins());
         
      p3.setLosses(10);
      Assert.assertEquals(10, p3.getLosses());
      
      p3.setEra(3.45);
      Assert.assertEquals(3.45, p3.getEra(), .000001);
   
   }
   
   /**
  *Method compares values of rating.
  */ 
   @Test public void ratingTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
         2.0, .125, 22, 4, 2.85);
   
      Assert.assertEquals(3.74025974025974, p3.rating(), 0.000001);
   }
   
   /**
  *Method tests the stat method of the class.
  */ 
   @Test public void statsTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
         2.0, .125, 22, 4, 2.85); 
      Assert.assertEquals("22 wins, 4 losses, 2.85 ERA", p3.stats());
   }
   
   
}
