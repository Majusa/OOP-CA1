/**
 * Simple program which tests Student, Staff, Module and (indirectly) ObjectArrayList.
 * @author Matt Gilbert
 */
public class Test {
	
	public static void main(String[] args) {
	
		// Test the constructors by making some students, staff and modules
		Student ben        = new Student("Ben", "Fullalove", 0, "bf254");
		Student egor       = new Student("Egor", "Grigorev", 1, "gg276");
		Student matt       = new Student("Matt", "Gilbert", 2, "mdg209");
		Student tom        = new Student("Tom", "Fullalove", 3, "tmf206");
		Staff   jonathan   = new Staff("Jonathan", "Fieldsend", 4, "J.E.Fieldsend");
		Staff   richard    = new Staff("Richard", "Everson", 5, "R.M.Everson");
		Staff   yiming     = new Staff("Yiming", "Ying", 6, null);
		Staff   zena       = new Staff("Zena", "Wood", 7, null);
		Module  forScience = new Module("ECM1408", "Programming for Science", 15);
		Module  oop        = new Module("ECM1410", "Object Oriented Programming", 15);
		Module  socProf    = new Module("ECM1407",
			"Social and Professional Issues of the Information Age", 15);
		
		// Set up staff for some Term 1 modules
		yiming.appendModuleCoordinate(socProf);
		yiming.appendModuleLecture(socProf);
		zena.appendModuleCoordinate(socProf); // Add coordinator by staff
		zena.appendModuleLecture(socProf);    // Add lecturer by staff
		forScience.addCoordinator(richard);   // Add coordinator by module
		forScience.addLecturer(richard);      // Add lecturer by module
		
		// Enroll Matt on some Term 1 modules
		matt.enroll(socProf);                 // Add student by student
		forScience.addStudent(matt);          // Add student by module
		
		// Remove Zena and Yiming
		socProf.remCoordinator(yiming);       // Remove coordinator by module
		socProf.remLecturer(yiming);          // Remove lecturer by module
		zena.removeModuleCoordinate(socProf); // Remove coordinator by staff
		zena.removeModuleLecture(socProf);    // Remove lecturer by staff
		
		// Unenroll Matt from Term 1 modules
		matt.unEnroll(forScience);            // Remove student by student
		socProf.remStudent(matt);             // Remove student by module
		
		// Set up staff and students for a Term 2 module
		oop.addCoordinator(jonathan);
		jonathan.appendModuleLecture(oop);
		ben.enroll(oop);
		egor.enroll(oop);
		oop.addStudent(matt);
		oop.addStudent(tom);
		
		// Check getCredits(), numberOfLectureModules() and numberOfCoordinateModules()
		assert ben.getCredits() == egor.getCredits();
		assert jonathan.numberOfLectureModules() > yiming.numberOfLectureModules();
		assert richard.numberOfCoordinateModules() > zena.numberOfCoordinateModules();
		
		// Can we enroll Matt on to a module which would increase his credits past 120?
		int someCredits = matt.getCredits();
		assert someCredits > 0;
		Module allYourCredits = new Module("AYC9001", "All your credits are belong to us", 120);
		assert !matt.enroll(allYourCredits);       // Enroll should fail
		assert !(matt.getCredits() > someCredits); // Matt should not get more credits
		
		// Can we remove staff and students from modules they are not part of?
		Module weaving = new Module("UBW1024", "Underwater Basket Weaving", -15);
		assert !egor.unEnroll(weaving);
		assert !jonathan.removeModuleLecture(weaving);
		assert !richard.removeModuleCoordinate(weaving);
		assert !weaving.remStudent(ben);
		assert !weaving.remLecturer(zena);
		assert !weaving.remCoordinator(yiming);
		
		System.out.println("All good!");
	}
}