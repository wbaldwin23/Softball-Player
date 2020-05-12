import java.io.IOException;

 /**
*Program is used to read file and sort info.
*
*Project_10
*@author William Baldwin-COMP 1210-004
*@version 04/15/19
*/
public class SoftballPlayersPart2 {

/**
*Method carries out the methods of the other classes.
*@param args Command line not used.
*@throws IOException Command line not used.
*/
   public static void main(String[] args) throws IOException {
      
      
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.\n"
            + "Program ending.");
      }
      
      else {
         SoftballTeam a = new SoftballTeam();
         a.readPlayerFile(args[0]);
         System.out.println(a.generateReport());
      
         System.out.println(a.generateReportByNumber());
      
         System.out.println(a.generateReportByName());
      
         System.out.println(a.generateReportByRating());
      
         System.out.println(a.generateExcludedRecordsReport());
      
      }
   
   
   }
}