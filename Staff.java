/**
 * The Staff class allows Staff to append and remove lecture and coordinated modules
 * as well as storing personal information and identification of the Staff.
 * 
 * @author (Ben Fullalove)
 */
 public class Staff {
 	
	//Declare attributes for Staff
	String forename;
	String surname;
	long id;
	String address;
	ObjectArrayList lectureModules;
	ObjectArrayList coordinateModules;
	
	//Constructor which inititialises or assigns all attributes
	public Staff(String forename, String surname, long id, String address) {
		this.forename=forename;
		this.surname=surname;
		this.id=id;
		this.address=address;
		lectureModules = new ObjectArrayList();
		coordinateModules = new ObjectArrayList();
	}
	
	//Functions used to handle lectured modules
	public void appendModuleLecture(Module newModule) {
		if (!(this.lectureModules.contains(newModule))) {
			lectureModules.add(newModule);
		}
	}
	
	public boolean removeModuleLecture(Module existingModule) {
		if (this.lectureModules.contains(existingModule)) {
			this.lectureModules.remove(existingModule);
			return true;
		}
		else {
			return false;
		}
	}
	
	//Functions used to handle coordinated modules
	public void appendModuleCoordinate(Module newModule) {
		if (!(this.lectureModules.contains(newModule))) {
			coordinateModules.add(newModule);
		}
	}
	
	public boolean removeModuleCoordinate(Module existingModule) {
		if (this.coordinateModules.contains(existingModule)) {
			this.coordinateModules.remove(existingModule);
			return true;
		}
		else {
			return false;
		}
	}
	
	//Functions to return the size of module lists
	public int numberOfLectureModules() {
		return lectureModules.size();
	}
	
	public int numberOfCoordinateModules() {
		return coordinateModules.size();
	}
	
	//Function to check if the given Staff and this Staff have all ettributes equal
	public boolean equals(Object object) {
		if (!(object instanceof Staff)) {
			//need to return false here else we cannot cast it to a Staff
			return false;
		}
		else {
			//cast the object into a Staff
			Staff staff = (Staff) object;
			
			//check all attributes of the two Staff are equal
			if (staff.forename.equals(forename) && staff.surname.equals(surname) && staff.id==id && staff.address.equals(address) && staff.lectureModules.equals(lectureModules) && staff.coordinateModules.equals(coordinateModules)) {
				return true;	
			}
			else {
				return false;	
			}
		}
	}
}
