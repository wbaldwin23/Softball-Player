import java.text.DecimalFormat;
/**
*Program is used for subclasses to use and inherit.
*
*Project_09
*@author William Baldwin-COMP 1210-004
*@version 04/03/19
*/
public abstract class SoftballPlayer implements Comparable<SoftballPlayer>{
   protected String number = "";
   protected String name = "";
   protected String position = "";
   protected double specializationFactor = 0.0;
   protected double battingAvg = 0.0;
   
   protected static int count = 0; 
   
   /**
   *Constant for calculating rating.
   */
   public static final int BASE_RATING = 10;
   
   /**
   *Constructor for the class.
   *@param numberIn Command line not used.
   *@param nameIn Command line not used.
   *@param positionIn Command line not used.
   *@param specializationFactorIn Command line not used.
   *@param battingAvgIn Command line not used.
   */
   public SoftballPlayer(String numberIn, String nameIn, String positionIn, 
      double specializationFactorIn, double battingAvgIn) {
      
      number = numberIn;
      name = nameIn;
      position = positionIn;
      specializationFactor = specializationFactorIn;
      battingAvg = battingAvgIn;
      count++;
   }
  
  /**
  *Method gets the variable number.
  *@return number
  */ 
   public String getNumber() {
      return number;
   }
   
   /**
   *Method sets the number used for the class.
   *@param numberIn Command line not used.
   */
   public void setNumber(String numberIn) {
      number = numberIn;
   }
   
    /**
  *Method gets the variable name.
  *@return name
  */ 
   public String getName() {
      return name;
   }
   
   /**
   *Method sets the name used for the class.
   *@param nameIn Command line not used.
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
    /**
  *Method gets the variable position.
  *@return postion
  */ 
   public String getPosition() {
      return position;
   }
   
   /**
   *Method sets the postion used for the class.
   *@param positionIn Command line not used.
   */
   public void setPosition(String positionIn) {
      position = positionIn;
   }
   
    /**
  *Method gets the variable battingAvg.
  *@return battingAvg
  */ 
   public double getBattingAvg() {
      return battingAvg;
   }
   
   /**
   *Method sets the battingAvg used for the class.
   *@param battingAvgIn Command line not used.
   */
   public void setBattingAvg(double battingAvgIn) {
      battingAvg = battingAvgIn;
   }
   
    /**
  *Method gets the variable specializationFactor.
  *@return specializationFactor 
  */ 
   public double getSpecializationFactor() {
      return specializationFactor;
   }
   
   /**
   *Method sets the specializationFactor used for the class.
   *@param specializationFactorIn Command line not used.
   */
   public void setSpecializationFactor(double specializationFactorIn) {
      specializationFactor = specializationFactorIn;
   }
   
    /**
  *Method gets the variable count.
  *@return count
  */ 
   public static int getCount() {
      return count;
   } 
  
  /**
  *Method resets the count.
  */ 
   public static void resetCount() {
      count = 0;
   }
  
  /**
  *Method returns a string of the stats in class.
  *@return Double.toString(battingAvg)
  */ 
   public String stats() {
      DecimalFormat df = new DecimalFormat(".000");
      return df.format(battingAvg);
   }

/**
*Method prints the info in the class.
*@return output
*/
   public String toString() {
      DecimalFormat df = new DecimalFormat(".000");
      String output = number + " " + name; 
      output += " (" + position + ") " + stats() + "\n";
      output += "Specialization Factor: " + specializationFactor; 
      output += " (" + this.getClass() + ")";
      output += " Rating: " + df.format(rating());
      return output;
   }

/**
*Method is an abstract one so it can be used for this class.
*@return rating
*/
   public abstract double rating();


   public int compareTo(SoftballPlayer obj) {
      return number.compareTo(obj.getNumber());
   }

}
