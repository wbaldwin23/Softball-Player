/**
*Program is used for continuing SoftballPlayer.
*
*Project_09
*@author William Baldwin-COMP 1210-004
*@version 04/03/19
*/
public class ReliefPitcher extends Pitcher {

   private int saves = 0;
   
   /**
   *Constructor for the class.
   *@param numberIn Command line not used.
   *@param nameIn Command line not used.
   *@param positionIn Command line not used.
   *@param specializationFactorIn Command line not used.
   *@param battingAvgIn Command line not used.
   *@param winsIn Command line not used.
   *@param lossesIn Command line not used.
   *@param eraIn Command line not used.
   *@param savesIn Command line not used.
   */
   public ReliefPitcher(String numberIn, String nameIn, String positionIn, 
      double specializationFactorIn, double battingAvgIn, 
      int winsIn, int lossesIn, double eraIn, int savesIn) {
    
      super(numberIn, nameIn, positionIn, specializationFactorIn, battingAvgIn,
         winsIn, lossesIn, eraIn);
         
      saves = savesIn;  
   }
   
    /**
  *Method gets the variable saves.
  *@return saves
  */ 
   public int getSaves() {
      return saves;
   }
  
  /**
   *Method sets the saves used for the class.
   *@param savesIn Command line not used.
   */  
   public void setSaves(int savesIn) {
      saves = savesIn;
   }
 
 /**
*Method calculates the rating used in the class.
*@return rating
*/  
   public double rating() {
      double a = (BASE_RATING * specializationFactor); 
      double b = (1 / (1 + era));
      double c = (wins - losses + saves) / 30.0;
      double rating = a * b * c;
      return rating;
   }
 
 /**
  *Overrides the stats of parent to print out different info.
  *@return stats
  */   
   public String stats() {
      String stats = (Integer.toString(wins) + " wins, " 
         + Integer.toString(losses) + " losses, "
          + Integer.toString(saves) + " saves, "
           + Double.toString(era) + " ERA");
      return stats;
   }
}