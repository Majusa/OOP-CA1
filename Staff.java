public class Staff {
	String forename;
	String surname;
	long id;
	String address;
	ObjectArrayList lectureModules;
	ObjectArrayList coordinateModules;
	
	public Staff(String forename, String surname, long id, String address) {
		this.forename=forename;
		this.surname=surname;
		this.id=id;
		this.address=address;
		listLecture = new ObjectArrayList();
		listCoord = new ObjectArrayList();
	}
	
	public void AppendModuleLecture(Module newModule) {
		lectureModules.add(newModule);
	}
	
	public boolean RemoveModuleLecture(Module existingModule) {
		//check they lecture it - return false
		//remove it return true
	}
	
	public void AppendModuleCoord(Module newmodule) {
		coordinateModules.add(newModule);
	}
	
	public boolean RemoveModuleCoord(Module module) {
		//check they coord it - return false
		//remove it return true
	} 
	
	public int NumberOfLectureModules() {
		//return size from lect array list
	}
	
	public int NumberOfCoordModules() {
		//return size from coord array list
	}
	
	public boolean Equals(Staff staff) {
		//check all variables of staff with this.staff
	}
}
