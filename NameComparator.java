import java.util.Comparator;

/**
*Program is used to sort by name.
*
*Project_10
*@author William Baldwin-COMP 1210-004
*@version 04/15/19
*/
public class NameComparator implements Comparator<SoftballPlayer> {

   /**
   *Method sorts based on name.
   *@param p1 Command line not used.
   *@param p2 Command line not used.
   *@return 0
   */
   public int compare(SoftballPlayer p1, SoftballPlayer p2) {
      String str1 = p1.getName().toUpperCase();
      int sb1 = str1.indexOf(' ');
      String result1 = str1.substring(sb1 + 1);
      result1 += str1.substring(0, sb1);
      
      String str2 = p2.getName().toUpperCase();
      int sb2 = str2.indexOf(' ');
      String result2 = str2.substring(sb2 + 1);
      result2 += str2.substring(0, sb2);
      
      int victorneedstoreadtheAPI = result1.compareTo(result2);
      return victorneedstoreadtheAPI;
   }

}