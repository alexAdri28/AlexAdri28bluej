
/**
 * This Class is called module where i have added the Mark, title and Code number for each module that Im going to be doing in
 * semester One.
 *
 * @author (Alex  Gordillo Adriano)
 * @version (06/11/2020)
 */
public class Module
{
    private String title;
    
    private String codeNo;
    
    private int mark;
    

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    { 
        mark = 0;
        this.title =title;
        this.codeNo=codeNo;
    }
    public void AwardMark(int mark)
    {
        if((mark>=0) && (mark<=100))
        { 
            this.mark= mark;
        }
        
        else 
          {
        
        
            System.out.print("invalid mark!!!");
        }
    }
    public void print()
    { 
        System.out.println("Module:" + codeNo + " " + "Mark=" + mark);
    }
}