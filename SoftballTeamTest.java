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
public class SoftballTeamTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**
*Method tests the getters of the class.
*@throws IOException Command line not used.
*/
   @Test public void gettersTest() throws IOException {
      SoftballTeam r = new SoftballTeam();
      r.readPlayerFile("softball_player_data1.csv");
      
      Assert.assertEquals("Auburn Stars", r.getTeamName());
      
      Assert.assertEquals(5, r.getPlayerCount());
      Assert.assertEquals(1, r.getExcludedCount());
      Assert.assertEquals(0, r.getIgnoredCount());
      r.resetTeamCount();
      Assert.assertEquals(0, r.getTeamCount());
   }
   
 /**
*Method tests the getters of the class.
*/
   @Test public void arrayGettersTest() {
      SoftballTeam r = new SoftballTeam();
      Assert.assertEquals(new SoftballPlayer[24], r.getRoster());
      Assert.assertEquals(new String[30], r.getExcludedRecords());
   }
   
  /**
*Method tests the getters of the class.
*/
   @Test public void settersTest() {
      SoftballTeam r = new SoftballTeam();
      
      r.setTeamName("Auburn Stars");
      Assert.assertEquals("Auburn Stars", r.getTeamName());
   
      r.setPlayerCount(7);
      Assert.assertEquals(7, r.getPlayerCount());
      
      r.setExcludedCount(1);
      Assert.assertEquals(1, r.getExcludedCount());
      
      r.setIgnoredCount(5);
      Assert.assertEquals(5, r.getIgnoredCount());
      
      r.setRoster(new SoftballPlayer[24]);
      Assert.assertEquals(new SoftballPlayer[24], r.getRoster());
      
      r.setExcludedRecords(new String[30]);
      Assert.assertEquals(new String[30], r.getExcludedRecords());
   }
  
  /**
*Method tests the readFile of the class.
*@throws IOException Command line not used.
*/ 
   @Test public void readPlayerFileTest() throws IOException {
      SoftballTeam r = new SoftballTeam();
      r.readPlayerFile("softball_player_data1.csv");
      
      Assert.assertEquals("Auburn Stars", r.getTeamName());
   
      r.readPlayerFile("softball_player_data2.csv");
      
      Assert.assertEquals("My Bigger Team", r.getTeamName());
      
      r.readPlayerFile("softball_player_data3.large_team_file.csv");
      
      Assert.assertEquals("My Biggest Team File", r.getTeamName());
   }
   
   /**
*Method tests the generateReport of the class.
*@throws IOException Command line not used.
*/
   @Test public void generateReportTest() throws IOException {
      SoftballTeam r = new SoftballTeam();
      r.readPlayerFile("softball_player_data1.csv");
   
      Assert.assertEquals(true, r.generateReport().contains("Auburn Stars"));
   }
   
   /**
*Method tests the generateReportByNumber of the class.
*@throws IOException Command line not used.
*/
   @Test public void generateReportByNumberTest() throws IOException {
      SoftballTeam r = new SoftballTeam();
      r.readPlayerFile("softball_player_data1.csv");
   
      Assert.assertEquals(true, r.generateReportByNumber().contains(
         "09 Pat Williams RF .480\n"
         + "23 Jackie Smith 3B .275\n32 Pat Jones RF .375\n"
         + "34 Sammi James LHP 5 wins, 4 losses, 17 saves, 3.85 ERA\n"
         + "43 Jo Williams RHP 22 wins, 4 losses, 2.85 ERA"));
         
   }
   
   /**
*Method tests the generateReportbyName of the class.
*@throws IOException Command line not used.
*/
   @Test public void generateReportByName() throws IOException {
      SoftballTeam r = new SoftballTeam();
      r.readPlayerFile("softball_player_data1.csv");
   
      Assert.assertEquals(true, r.generateReportByName().contains(
         "34 Sammi James LHP 5 wins, 4 losses, 17 saves, 3.85 ERA\n"
         + "32 Pat Jones RF .375\n23 Jackie Smith 3B .275\n"
         + "43 Jo Williams RHP 22 wins, 4 losses, 2.85 ERA\n"
         + "09 Pat Williams RF .480"));
    
   }
   
    /**
*Method tests the generateReportbyRating of the class.
*@throws IOException Command line not used.
*/ 
   @Test public void generateReportByRating() throws IOException {
      SoftballTeam r = new SoftballTeam();
      r.readPlayerFile("softball_player_data1.csv");
   
      Assert.assertEquals(true, r.generateReportByRating().contains(
         "4.560 09 Pat Williams RF .480\n"
         + "3.740 43 Jo Williams RHP 22 wins, 4 losses, 2.85 ERA\n"
         + "3.562 32 Pat Jones RF .375\n2.922 23 Jackie Smith 3B .275\n"
         + "2.474 34 Sammi James LHP 5 wins, 4 losses, 17 saves, 3.85 ERA"));
   }
  
    /**
*Method tests the generateExcludedRecords of the class.
*@throws IOException Command line not used.
*/ 
   @Test public void generateExcludedRecordsReportTest() throws IOException {
      SoftballTeam r = new SoftballTeam();
      r.readPlayerFile("softball_player_data_part3a.csv");
      Assert.assertEquals(true, r.generateExcludedRecordsReport().contains(
         "InvalidCategoryException: " 
         + "For category: \"L\" in: L,23,Gayle Adams,2B,1.25,.225,.875\n"
         + "java.lang.NumberFormatException: For input string: " 
         + "\".480a\" in: O,09,Pat Williams,RF,1.0,.480a,.950\n"
         + "Number of ignored records from file: 0"));
   }
  
  /**
  *Method tests ignored count.
  *@throws IOException
  */ 
   @Test public void ignoredCountTest() throws IOException {
      SoftballTeam r = new SoftballTeam();
      r.readPlayerFile("softball_player_data_part3c.csv");
      Assert.assertEquals(6, r.getIgnoredCount());
   }
}
