
/**
 * Write a description of class Name here.
 *
 * @author (Remus Iftimie)
 * @version (1.2)
 */
public class Name
{
    private String first;
    private String last;
    
    public Name(String first, String last)
    {
        this.first = first;
        this.last = last;
    }
    public String getFirstName()
    {
        return first;
    }
    public String getLastName()
    {
        return last;
    }
    public String getFullName()
    {
        String name = "";
        if(first != null)
        {
            name = name + first;
        }
        if(last != null)
        {
            name = name + " " + last;
        }
        return name;
    }
    public void setFirstName(String first)
    {
        this.first = first;
    }
    public void setLastName(String last)
    {
        this.last = last;
    }
    public void setFullName(String first, String last)
    {
      setFirstName(first);
      setLastName(last);
    }
    
}
