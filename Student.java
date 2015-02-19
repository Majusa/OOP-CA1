
/**
 * Write a description of class Student here.
 * 
 * @author (Tom Fullalove) 
 * @version (a version number or a date)
 */
public class Student
{
    String forename;
    String surname;
    long id;
    String address;
    ObjectArrayList modules;
    int credits;

    public Student(String forename, String surname, long id, String address)
    {
        this.forename = forename;
        this.surname = surname;
        this.id = id;
        this.address = address;
        this.modules = new ObjectArrayList();
        this.credits = 0;
    }

    public boolean enroll(Module newModule)
    {
        if (this.getCredits() + newModule.getCredits() > 120)
        {
            return false; //This module gives them too many credits!
        }
        else
        {
            this.modules.add(newModule);
            this.credits+=newModule.getCredits();
            return true;
        }
    }
    
    public boolean unEnroll(Module existingModule)
    {
        if (this.modules.contains(existingModule))
        {
            this.credits-=existingModule.getCredits();
            this.modules.remove(existingModule); // modifies in-place and returns boolean success!
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int getCredits()
    {
        return this.credits;
    }
    
    public boolean equals(Object object)
    {
        if (!(object instanceof Student))
        {
            return false;
        }
        else
        {
			Student objStudent = (Student) object;
            if (objStudent.forename.equals(this.forename) && objStudent.surname.equals(this.surname) && objStudent.id==this.id && objStudent.address.equals(this.address) && objStudent.credits==this.credits && objStudent.modules.equals(this.modules))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
