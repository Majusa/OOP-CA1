public class Staff {
	public String forename;
	public String surname;
	public long id;
	public String address;
	public ObjectArrayList listLecture;
	public ObjectArrayList listCoord;
	
	public Staff(String forename, String surname, long id, String address) {
		this.forename=forename;
		this.surname=surname;
		this.id=id;
		this.address=address;
		listLecture = new ObjectArrayList();
		listCoord = new ObjectArrayList();
	}
	
	public void AppendModuleLecture(Module module) {
		//append module
	}
	
	public boolean RemoveModuleLecture(Module module) {
		//check they lecture it - return false
		//remove it return true
	}
	
	public void AppendModuleCoord(Module module) {
		//append module
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
