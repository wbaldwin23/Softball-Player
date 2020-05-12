import java.util.Comparator;
/**
*Program is used to sort by rating.
*
*Project_10
*@author William Baldwin-COMP 1210-004
*@version 04/15/19
*/
public class RatingComparator implements 
   Comparator<SoftballPlayer> { 

/**
*Method compares objects by rating.
*@param p1 Command line not used.
*@param p2 Command line not used.
*@return 0
*/
   public int compare(SoftballPlayer p1, SoftballPlayer p2) {
      if (p1.rating() > p2.rating()) {
         return -1;
      }
      else if (p1.rating() < p2.rating()) {
         return 1;
      }
      else {
         return 0;
      }
   
   }

}