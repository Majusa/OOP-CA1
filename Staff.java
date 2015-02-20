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
		lectureModules = new ObjectArrayList();
		coordinateModules = new ObjectArrayList();
	}
	
	public void appendModuleLecture(Module newModule) {
		if !(this.lectureModules.contains(existingModule)) {
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
	
	public void appendModuleCoordinate(Module newModule) {
		if !(this.lectureModules.contains(existingModule)) {
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
	
	public int numberOfLectureModules() {
		return lectureModules.size();
	}
	
	public int numberOfCoordinateModules() {
		return coordinateModules.size();
	}
	
	public boolean equals(Object object) {
		if !(object instanceof Staff) {
			return false;
		}
		else {
			Staff staff = (Staff) object;
			if (staff.forename.equals(forename) && staff.surname.equals(surname) && staff.id==id && staff.address.equals(address) && staff.lectureModules.equals(lectureModules) && staff.coordinateModules.equals(coordinateModules)) {
				return true;	
			}
			else {
				return false;	
			}
		}
	}
}
