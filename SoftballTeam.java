import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

/**
*Program is used to read file and sort info.
*
*Project_10
*@author William Baldwin-COMP 1210-004
*@version 04/15/19
*/
public class SoftballTeam {

//Instance variables
   private String teamName;
   private SoftballPlayer[] roster;
   private int playerCount;
   private String[] excludedRecords;
   private int excludedCount;
   private int ignoredCount;
   
 //Class variables
   private static int teamCount = 0;
   
 //Constants 
 /**
 *constant for max of roster.
 */
   public static final int MAX_PLAYERS = 24;
   /**
   *constant for excluded.
   */
   public static final int MAX_EXCLUDED = 30;
  
  /**
  *Constructor for the class.
  */ 
   public SoftballTeam() {
      roster = new SoftballPlayer[24];
      excludedRecords = new String[30];
      teamName = "";
      playerCount = 0;
      excludedCount = 0;
      ignoredCount = 0;
      teamCount++;
   }
  
  /**
  *Method gets teamName.
  *@return teamName
  */ 
   public String getTeamName() {
      return teamName;
   }
  
  /**
  *Method sets teamName for class.
  *@param teamNameIn Command line not used.
  */
   public void setTeamName(String teamNameIn) {
      teamName = teamNameIn;
   }
  
  /**
  *Method gets roster.
  *@return roster
  */ 
   public SoftballPlayer[] getRoster() {
      return roster;
   }
   /**
  *Method sets roster for class.
  *@param rosterIn Command line not used.
  */
   public void setRoster(SoftballPlayer[] rosterIn) {
      roster = rosterIn;
   }
  
  /**
  *Method gets playerCount.
  *@return playerCount
  */ 
   public int getPlayerCount() {
      return playerCount;
   }
   
   /**
  *Method sets playerCount for class.
  *@param playerCountIn Command line not used.
  */
   public void setPlayerCount(int playerCountIn) {
      playerCount = playerCountIn;
   }
   
   /**
  *Method gets excludedRecords.
  *@return excludedRecords
  */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
  
  /**
  *Method sets excludedRecords for class.
  *@param excludedRecordsIn Command line not used.
  */ 
   public void setExcludedRecords(String[] excludedRecordsIn) {
      excludedRecords = excludedRecordsIn;
   }
   
   /**
  *Method gets excludedCount.
  *@return excludedCount
  */
   public int getExcludedCount() {
      return excludedCount;
   }
  
  /**
  *Method sets excludedCount for class.
  *@param excludedCountIn Command line not used.
  */ 
   public void setExcludedCount(int excludedCountIn) {
      excludedCount = excludedCountIn;
   }
   
   /**
  *Method gets ignoredCount.
  *@return ignoredCount
  */
   public int getIgnoredCount() {
      return ignoredCount;
   }
  
  /**
  *Method sets ignoredCount for class.
  *@param ignoredCountIn Command line not used.
  */ 
   public void setIgnoredCount(int ignoredCountIn) {
      ignoredCount = ignoredCountIn;
   }
   
   /**
  *Method gets teamCount.
  *@return teamCount
  */
   public static int getTeamCount() {
      return teamCount;
   }
  /**
  *Method resets the teamcount.
  */ 
   public static void resetTeamCount() {
      teamCount = 0;
   }
   
   /**
   *Method reads the file for the class.
   *@param fileName Command line not used.
   *@throws IOException Command line not used.
   */
   public void readPlayerFile(String fileName) throws IOException  {
   
      Scanner scanFile = new Scanner(new File(fileName));
      
      teamName = scanFile.nextLine();
      String type = "";
      String number = "";
      String name = "";
      String position = "";
      String specializationFactor = "";
      String battingAvg = "";
      String outfielderFieldingAvg = "";
      String infielderFieldingAvg = "";
      String wins = "";
      String losses = "";
      String era = "";
      String saves = "";
      
      int i = 0;
      
      while (scanFile.hasNext()) {
      
         String p = scanFile.nextLine();
         Scanner s = new Scanner(p).useDelimiter(",");
         //s.useDelimiter(",");
         try {
            type = s.next();
            number = s.next();
            name = s.next();
            position = s.next();
            specializationFactor = s.next();
            battingAvg = s.next();
            if (playerCount < MAX_PLAYERS) {
               switch(type.charAt(0)) {
                  case 'O': 
                     outfielderFieldingAvg = s.next();
                     roster[playerCount] = 
                        new Outfielder(number, name, position,
                        Double.parseDouble(specializationFactor), 
                        Double.parseDouble(battingAvg),
                        Double.parseDouble(outfielderFieldingAvg));
                     playerCount++;
                     break;
                  case 'I':
                     infielderFieldingAvg = s.next();
                     roster[playerCount] = new Infielder(number, name, position,
                        Double.parseDouble(specializationFactor), 
                        Double.parseDouble(battingAvg),
                        Double.parseDouble(infielderFieldingAvg));
                     playerCount++;
                     break;
                  case 'P':
                     wins = s.next();
                     losses = s.next();
                     era = s.next();
                     roster[playerCount] = new Pitcher(number, name, position,
                        Double.parseDouble(specializationFactor),
                        Double.parseDouble(battingAvg),
                        Integer.parseInt(wins), Integer.parseInt(losses),
                        Double.parseDouble(era));
                     playerCount++;
                     break;
                  case 'R':
                     wins = s.next();
                     losses = s.next();
                     era = s.next();
                     saves = s.next();
                     roster[playerCount] = 
                        new ReliefPitcher(number, name, position,
                        Double.parseDouble(specializationFactor),
                        Double.parseDouble(battingAvg),
                        Integer.parseInt(wins),
                        Integer.parseInt(losses), Double.parseDouble(era),
                        Integer.parseInt(saves));
                     playerCount++;
                     break;
                  default:
                     throw new InvalidCategoryException(type);   
                     
               }     
              
            }
         }
         catch (NumberFormatException e) {
            if (excludedCount < MAX_EXCLUDED) {
               excludedRecords[excludedCount++] = e + " in: " + p;
            }
         }
         catch (InvalidCategoryException e) {
            if (excludedCount < MAX_EXCLUDED) {
               excludedRecords[excludedCount++] = e + " in: " + p;
            }
         }
         if (playerCount >= MAX_PLAYERS) {
            if (excludedCount < MAX_EXCLUDED) {
               String max = "Maximum player count of 24 exceeded for:";
               excludedRecords[excludedCount++] = max + " " + p;
            }
            else {
               ignoredCount++;
            }
         }
         
      }
        
      
      
   }
  
  /**
  *Method returns the the report with natural order.
  *@return result
  */ 
   public String generateReport() {
      String result = "\n---------------------------------------\n" 
         + "Team Report for " + teamName + "\n" 
         + "---------------------------------------\n\n";
      for (int i = 0; i < playerCount; i++) {
         result += roster[i] + "\n\n";
      }
      
      return result;
   }
   
   /**
   *Method sorts list by number.
   *@return result
   */
   public String generateReportByNumber() {
      String result = "\n---------------------------------------\n" 
         + "Team Report for " + teamName + " (by Number)\n" 
         + "---------------------------------------\n";
      SoftballPlayer[] bp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(bp);
      for (int i = 0; i < playerCount; i++) {
         result += bp[i].getNumber() + " ";
         result += bp[i].getName() + " ";
         result += bp[i].getPosition() + " ";
         result += bp[i].stats() + "\n";
      }
      return result;
   }
  
  /**
  *Method returns list with order based on name.
  *@return bp
  */ 
   public String generateReportByName() {
      String result = "\n---------------------------------------\n" 
         + "Team Report for " + teamName + " (by Name)\n" 
         + "---------------------------------------\n";
      SoftballPlayer[] bp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(bp, new NameComparator());
      for (int i = 0; i < playerCount; i++) {
         result += bp[i].getNumber() + " ";
         result += bp[i].getName() + " ";
         result += bp[i].getPosition() + " ";
         result += bp[i].stats() + "\n";
      } 
      return result;
   }
   
   /**
   *Method sorts by rating for the class.
   *@return result 
   */
   public String generateReportByRating() {
      String result = "\n---------------------------------------\n" 
         + "Team Report for " + teamName + " (by Rating)\n" 
         + "---------------------------------------\n";
      SoftballPlayer[] bp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(bp, new RatingComparator());
      DecimalFormat df = new DecimalFormat("0.000");
      for (int i = 0; i < playerCount; i++) {
         result += df.format(bp[i].rating()) + " ";
         result += bp[i].getNumber() + " ";
         result += bp[i].getName() + " ";
         result += bp[i].getPosition() + " ";
         result += bp[i].stats() + "\n";
      }
      return result;
   }
   
   /**
   *Method shows excluded list.
   *@return result
   */
   public String generateExcludedRecordsReport() {
      String result = "\n---------------------------------------\n" 
         + "Excluded Records Report\n" 
         + "---------------------------------------\n";
      for (int i = 0; i < excludedCount; i++) {
         result += excludedRecords[i] + "\n";
      }
      result += "Number of ignored records from file: " + ignoredCount;
      return result;
   }
}