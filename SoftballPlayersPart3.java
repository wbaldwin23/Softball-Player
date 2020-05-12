import java.io.IOException;
 
 /**
 *Program prints the output of the code for SoftballTeam.
 *@version 04/23/19
 *@author William Baldwin-COMP 1210-004
 */
public class SoftballPlayersPart3 {

/**
*Main carries out the action for the program.
*@param args Command line not used.
*/
   public static void main(String[] args) {
      
      
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.\n"
            + "Program ending.");
      }
      
      else {
         try {
            SoftballTeam a = new SoftballTeam();
            a.readPlayerFile(args[0]);
            System.out.println(a.generateReport());
         
            System.out.println(a.generateReportByNumber());
         
            System.out.println(a.generateReportByName());
         
            System.out.println(a.generateReportByRating());
         
            System.out.println(a.generateExcludedRecordsReport());
         }
         catch (IOException o) {
            System.out.println("Attempted to read file: " 
               + args[0] + " (No such file or directory)");
         }
      }
   
   
   }
}