/**
 *Program takes the exception and formats it.
 *@version 04/23/19
 *@author William Baldwin-COMP 1210-004
 */
public class InvalidCategoryException extends Exception {

/**
*Method formats the exception for the file.
*@param category Command line not used.
*/
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   } 


}