
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    String forename;
    String surname;
    long id;
    String address;
    ObjectArrayList[] modules;
    int credits;

    public Student(String forename, String surname, long id, String address)
    {
        this.forename = forename;
        this.surname = surname;
        this.id = id;
        this.address = address;
    }

    public boolean enroll(Module newModule)
    {
        if (this.getCredits() + newModule.getCreds() > 120)
        {
            return false; //This module gives them too many credits!
        }
        else
        {
            this.modules.add(newModule);
            this.credits+=newModule.getCreds();
            return true;
        }
    }
    
    public boolean unEnroll(Module existingModule)
    {
        if (this.modules.contains(existingModule))
        {
            this.credits-=existingModule.getCreds();
            this.modules=this.modules.remove(existingModule);
            return true;
        }
        else
        {
            return true;
        }
    }
    
    public boolean getCreds()
    {
        return this.credits;
    }
    
    public boolean equals(Object objStudent)
    {
        if (!(objStudent instanceof Student))
        {
            return false;
        }
        else
        {
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