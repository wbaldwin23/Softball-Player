import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *Program tests the code of program.
 *@version 04/23/19
 *@author William Baldwin-COMP 1210-004
 */
public class SoftballPlayersPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**
*Tests if there is no file in command line.
*/
   @Test public void noFileNameTest() {
      SoftballPlayersPart3 app = new SoftballPlayersPart3();
      String[] args1 = {}; 
      app.main(args1); 
      Assert.assertEquals("Team count should be 0. ",
                          0, SoftballTeam.getTeamCount());
      SoftballTeam.resetTeamCount();
   }

/**
*Tests the reading file name and printing info.
*/
   @Test public void fileNameTest() {
      String[] args2 = {"softball_player_data1.csv"};
      SoftballPlayersPart3.main(args2);
      Assert.assertEquals("Team count should be 1. ",
         1, SoftballTeam.getTeamCount());
         
      SoftballTeam.resetTeamCount();
   
      SoftballPlayersPart3 app = new SoftballPlayersPart3();
   }
   /**
   *Method tests wrong file.
   */
   @Test public void wrongfilenameTest() {
      String[] args3 = {"wrongfile.csv"};
      SoftballPlayersPart3.main(args3);
      Assert.assertEquals("Team count should be 1. ",
                          1, SoftballTeam.getTeamCount());
                          
      SoftballTeam.resetTeamCount();
      SoftballPlayersPart3 app = new SoftballPlayersPart3();
   }
   
  
}
