import java.text.DecimalFormat;
/**
*Program is used to calculate an outfielder's info.
*
*Project_09
*@author William Baldwin-COMP 1210-004
*@version 04/03/19
*/
public class Outfielder extends SoftballPlayer {

   private double outfielderFieldingAvg = 0.0;
   
   /**
   *Constructor for the class.
   *@param numberIn Command line not used.
   *@param nameIn Command line not used.
   *@param positionIn Command line not used.
   *@param specializationFactorIn Command line not used.
   *@param battingAvgIn Command line not used.
   *@param outfielderFieldingAvgIn Command line not used.
   */
   public Outfielder(String numberIn, String nameIn, String positionIn, 
      double specializationFactorIn, double battingAvgIn, 
      double outfielderFieldingAvgIn) {
      
      super(numberIn, nameIn, positionIn, specializationFactorIn, battingAvgIn);
      outfielderFieldingAvg = outfielderFieldingAvgIn;
   }
   
     /**
  *Method gets the variable outfielderFieldingAvg.
  *@return outfielderFieldingAvg 
  */ 
   public double getOutfielderFieldingAvg() {
      return outfielderFieldingAvg;
   }
   
    /**
   *Method sets the outfielderFieldingAvg used for the class.
   *@param outfielderFieldingAvgIn Command line not used.
   */
   public void setOutfielderFieldingAvg(double outfielderFieldingAvgIn) {
      outfielderFieldingAvg = outfielderFieldingAvgIn; 
   }
   
   /**
   *Method calculates rating for the class to use in toString.
   *@return rating
   */
   public double rating() {
      DecimalFormat df = new DecimalFormat(".000");
      double rating = ((BASE_RATING * specializationFactor 
         * battingAvg * outfielderFieldingAvg));
      return rating;
   }
   
}