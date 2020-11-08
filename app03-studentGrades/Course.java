
/**
 * The creatve a class course in order to give the student the modules where it will calculated the grade and for that i used 
 * an if stament and is course is link to the Class Module and the Class Grade and in order to link them i use variable such as 
 * String, int, and void.
 * 
 * .
 *
 * Alex Gordillo Adriano
 * @version 0.1 07/11/2020
 */
public class Course

{
    private String title;
    
    
    private String codeNo;
    
    private int finalMark;
    
    private grade finalGrade;
    
    
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
    public void addMark(int mark,int moduleNo)
    { 
        if(moduleNo ==1)
        {
          module1.AwardMark(mark);
          
        } 
        else if(moduleNo ==2)
        { 
            module2.AwardMark(mark);
        }
        else if(moduleNo ==3)
        { 
            module3.AwardMark(mark);
        }
        else if(moduleNo ==4)
        { 
            module4.AwardMark(mark);
        }
    }
    /**
     * 
     */
    public void print()
    {   //put your code here
        System.out.println("Course" + codeNo+"-"+title);
            
    }
    public grade covertToGrade(int mark)
    { 
        if((mark>=0 ) && (mark<=40))
        { 
            return grade.F;
        }
        else if ((mark>=0) && (mark<=50))
        { 
            return grade.D;
        }
        else if ((mark>=0) && (mark<=60))
        { 
            return grade.C;
        }
        else if((mark>=0) &&(mark<=70))
        { 
            return grade.B;
        }
        else if ((mark>=0) &&(mark<=100))
        { 
            return grade.A;
        }
        
        
        return grade.X;
    }

}
