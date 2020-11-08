
/**
 * Write a description of class Course here.
 *
 * @author Derek Peacock
 * @version 0.1
 */
public class Course

{
    private String title;
    
    
    private String codeNo;
    
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        //initialise intance variables
        this.codeNo = codeNo;
        this.title= title;
        
        module1 = new Module("Programming Cocepts","CO452");
        module2 = new Module("Computer Architectures","CO450");
        module3 = new Module("Web Development","CO456");
        module4 = new Module("Digital Technologies And Professinal Practice","CO454");
    }
    /**
     * 
     */
    public void addModule(Module module,int moduleNo)
    {
    }
    /**
     * 
     */
    public void print()
    {   //put your code here
        System.out.println("Course" + codeNo+"-"+title);
            
    }

}
