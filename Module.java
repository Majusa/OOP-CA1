public class Module {
    
    String code;
    String name;
    int credits;
    ObjectArrayList lecturerList;
    ObjectArrayList coordinatorList;
    
    
    public Module(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        lecturerList = new ObjectArrayList();
        coordinatorList = new ObjectArrayList();
    }
  
    public void addLecturer(Staff newStaff) {
        newStaff.appendModuleLecture(this);
    }
  
    public boolean remLecturer(Staff existingStaff) {
        return (existingStaff.removeModuleLecture(this));
    }
  
    public void addCoordinator(Staff existingStaff) {
        existingStaff.appendModuleCoordinate(this);
    }
  
    public boolean remCoordinator(Staff existingStaff) {
        return (existingStaff.removeModuleCoordinate(this));
    }
  
    public void addStudent(Student newStudent) {
        newStudent.enroll(this);
    }
  
    public boolean remStudent(Student existingStudent) {
        return (existingStudent.unEnroll(this));
    }
  
    public int getCredits() {
        return this.credits; //placeholder
    }
}
