import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /**
*Program is used to test Outfielder.
*
*Project_09
*@author William Baldwin-COMP 1210-004
*@version 04/03/19
*/
public class OutfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**
*Method tests getters of its class.
*/
   @Test public void gettersTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      
      Assert.assertEquals(0.950, p1.getOutfielderFieldingAvg(), .000001);
      Assert.assertEquals("32", p1.getNumber());
      Assert.assertEquals("Pat Jones", p1.getName());
      Assert.assertEquals("RF", p1.getPosition());
      Assert.assertEquals(.375, p1.getBattingAvg(), .000001);
      Assert.assertEquals(1.0, p1.getSpecializationFactor(), .000001);
      p1.resetCount();
      Assert.assertEquals(0, p1.getCount());
   }
   
   /**
  *Method tests the set method.
  */ 
   @Test public void settersTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      
      p1.setOutfielderFieldingAvg(.850);
      Assert.assertEquals(.850, p1.getOutfielderFieldingAvg(), .000001);
      
      p1.setNumber("42");
      Assert.assertEquals("42", p1.getNumber());
      
      p1.setName("Billy West");
      Assert.assertEquals("Billy West", p1.getName());
      
      p1.setPosition("LF");
      Assert.assertEquals("LF", p1.getPosition());
      
      p1.setSpecializationFactor(15.0);
      Assert.assertEquals(15.0, p1.getSpecializationFactor(), .000001);
      
      p1.setBattingAvg(.678);
      Assert.assertEquals(.678, p1.getBattingAvg(), .000001);
   }
   
   /**
  *Method tests stats method.
  */  
   @Test public void statsTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
   
      Assert.assertEquals(".375", p1.stats());
   }
  
   /**
  *Method compares values of rating.
  */  
   @Test public void ratingTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      Assert.assertEquals(3.5625, p1.rating(), .000001);
   } 
   
    /**
  *Method tests toString.
  */  
   @Test public void toStringTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
   
      Assert.assertEquals(true, p1.toString().contains("(class Outfielder)"));
   }
     
}
