
/**
 * The Student class can gain and lose modules by its methods while handling the credits that the modules come with.
 * There is also a equals method to check if two students' attributes are identical
 * 
 * @author (Tom Fullalove)
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
            //This module gives them too many credits!
            return false; 
        }
        else
        {
            if !(this.modules.contains(newModule))
            {
            	//Valid NEW module has been given so we add it
        	this.modules.add(newModule); 
        	//Keep the number of credits up to date
            	this.credits+=newModule.getCredits(); 
            	return true;
            }
            else
            {
            	//We already had one of these modules so we refuse
            	return false; 
            }
        }
    }
    
    public boolean unEnroll(Module existingModule)
    {
        if (this.modules.contains(existingModule))
        {
            //We had this module, so we handle the credits that will go
            this.credits-=existingModule.getCredits();
            //Then remove the module
            this.modules.remove(existingModule);
            return true;
        }
        else
        {
            //We tried to remove a module we didn't have
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
            //It wasn't even a Student
            return false;
        }
        else
        {
            //We need the Student class attributes so we need to change 'object' from Object to Student
	    Student objStudent = (Student) object;
            if (objStudent.forename.equals(this.forename) && objStudent.surname.equals(this.surname) && objStudent.id==this.id && objStudent.address.equals(this.address) && objStudent.credits==this.credits && objStudent.modules.equals(this.modules))
            {
            	//All the attributes were the same
                return true;
            }
            else
            {
            	//There was at least one inconsistency in the attributes
                return false;
            }
        }
    }
}
