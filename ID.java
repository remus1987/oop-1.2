import java.util.Scanner;

public class ID
{
    private final String str1 = "STU";
    private final String str2 = "STAFF";
    private String input = "";
    private String stud_id = str1+input;
    private String staff_id = str2+input;

    public ID(String stud_id, String staff_id)
    {
        this.stud_id = stud_id;
        this.staff_id = staff_id;
    }
    
    public void setStudentID(String stud_id)
    {    
        System.out.println("Enter your student ID number");
        Scanner s1 = new Scanner(System.in);
        input = s1.next();
        if(input.length()==5 && input!=null)
        {
            stud_id = str1+input;
        }
        else
        {
            System.out.println("Error! Please enter a 5 digit number !");
        }
    }
    public void setTutorID(String staff_id)
    {
     System.out.println("Enter your tutor ID number");
        Scanner s2 = new Scanner(System.in);
        input = s2.next();
        if(input.length()==3 && input!=null)
        {
            stud_id = str1+input;
        }
        else
        {
            System.out.println("Error! Please enter a 3 digit number !");
        }
    }
    public String getStudentID()
    {
        return stud_id;
    }
    public String getTutorID()
    {
        return staff_id;
    }
}
