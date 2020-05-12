/**
*Program is used as a continuation of SoftballPlayer.
*
*Project_09
*@author William Baldwin-COMP 1210-004
*@version 04/03/19
*/
public class Infielder extends SoftballPlayer {

   private double infielderFieldingAvg;

/**
   *Constructor for the class.
   *@param numberIn Command line not used.
   *@param nameIn Command line not used.
   *@param positionIn Command line not used.
   *@param specializationFactorIn Command line not used.
   *@param battingAvgIn Command line not used.
   *@param infielderFieldingAvgIn Command line not used.
   */
   public Infielder(String numberIn, String nameIn, String positionIn, 
      double specializationFactorIn, double battingAvgIn, 
      double infielderFieldingAvgIn) {
      
      super(numberIn, nameIn, positionIn, specializationFactorIn, battingAvgIn);
      infielderFieldingAvg = infielderFieldingAvgIn;
   }

 /**
  *Method gets the variable infielderFieldingAvg.
  *@return infielderFieldingAvg
  */ 
   public double getInfielderFieldingAvg() {
      return infielderFieldingAvg;
   }

/**
   *Method sets the infielderFieldingAvg used for the class.
   *@param infielderFieldingAvgIn Command line not used.
   */
   public void setInfielderFieldingAvg(double infielderFieldingAvgIn) {
      infielderFieldingAvg = infielderFieldingAvgIn; 
   }
   
    /**
   *Method calculates rating for the class to use in toString.
   *@return rating
   */
   public double rating() {
      double rating = ((BASE_RATING * specializationFactor 
         * battingAvg * infielderFieldingAvg));
      return rating;
   }
   
   
   
}