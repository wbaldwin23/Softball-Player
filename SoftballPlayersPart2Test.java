import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
*Program is used to test SoftballTeam.
*
*Project_10
*@author William Baldwin-COMP 1210-004
*@version 04/15/19
*/

public class SoftballPlayersPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


/**
*Method tests no file in the class.
*@throws IOException Command line not used.
*/
   @Test public void noFileNameTest() throws IOException {
      String[] args1 = {}; 
      SoftballPlayersPart2.main(args1); 
      Assert.assertEquals("Team count should be 0. ",
                          0, SoftballTeam.getTeamCount());
   
   }
   
   /**
*Method tests a file in the class.
*@throws IOException Command line not used.
*/
   @Test public void fileNameTest() throws IOException {
      String[] args2 = {"softball_player_data1.csv"};
      SoftballPlayersPart2.main(args2);
      Assert.assertEquals("Team count should be 1. ",
         1, SoftballTeam.getTeamCount());
   
      SoftballPlayersPart2 app = new SoftballPlayersPart2();
   }
}
