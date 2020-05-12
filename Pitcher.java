/**
*Program is used for continuing the SoftballPlayer.
*
*Project_09
*@author William Baldwin-COMP 1210-004
*@version 04/03/19
*/
public class Pitcher extends SoftballPlayer {

   protected int wins = 0;
   protected int losses = 0;
   protected double era = 0.0;

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
   */
   public Pitcher(String numberIn, String nameIn, String positionIn, 
      double specializationFactorIn, double battingAvgIn, 
      int winsIn, int lossesIn, double eraIn) {
      
      super(numberIn, nameIn, positionIn, specializationFactorIn, battingAvgIn);
      
      wins = winsIn;
      losses = lossesIn;
      era = eraIn;
   }
   
    /**
  *Method gets the variable wins.
  *@return wins
  */ 
   public int getWins() {
      return wins;
   }
  
   /**
   *Method sets the wins used for the class.
   *@param winsIn Command line not used.
   */ 
   public void setWins(int winsIn) {
      wins = winsIn;
   }
   
    /**
  *Method gets the variable losses.
  *@return losses
  */ 
   public int getLosses() {
      return losses;
   }
   
    /**
   *Method sets the losses used for the class.
   *@param lossesIn Command line not used.
   */
   public void setLosses(int lossesIn) {
      losses = lossesIn;
   }

 /**
  *Method gets the variable era.
  *@return era
  */ 
   public double getEra() {
      return era;
   }
   
    /**
   *Method sets the era used for the class.
   *@param eraIn Command line not used.
   */
   public void setEra(double eraIn) {
      era = eraIn;
   }

/**
*Method calculates the rating used in the class.
*@return rating
*/
   public double rating() {
      double a = (BASE_RATING * specializationFactor); 
      double b = (1 / (1 + era));
      double c = (wins - losses) / 25.0;
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
          + Double.toString(era) + " ERA");
      return stats;
   }

}