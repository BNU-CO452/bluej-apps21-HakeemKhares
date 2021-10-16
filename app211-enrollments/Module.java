
/**
 * This class odels a BNU module which forms part of a course, each module is
 * worth 15 coure points, which a student needs to achive a grade. 
 *
 * @author Hakeem Khares
 * @version 16/10/2021
 */
public class Module
{
    //Variables
    private String code;
    private String title;
    private int credit;
    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        //initilise instance variables
        credit = 15;
        this.code = code;
        this.title = title;
    }
    
    public String getCode()
    {
        return code;
    }
    
        public String getTitle()
    {
        return title;
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
     /**
      * This method will printout the Module code and title
      */
    public void print()
    {
        printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title + " Credit "
                                                        + credit);
        System.out.println();
    
    }
    
    /**
     * Print out the details of the module to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Module Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }
}
