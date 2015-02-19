/**
 * Tests Student, Staff, Module and ObjectArrayList
 * @author Matt Gilbert
 */
public class Test {
	
	public static void main(String[] args) {
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
		
		yiming.appendModuleCoordinate(socProf);
		yiming.appendModuleLecture(socProf);
		zena.appendModuleCoordinate(socProf);
		zena.appendModuleLecture(socProf);
		forScience.addCoordinator(richard);
		forScience.addLecturer(richard);
		
		matt.enroll(socProf);
		forScience.addStudent(matt);
		assert matt.getCredits() > 0;
		
		socProf.remCoordinator(yiming);
		socProf.remLecturer(yiming);
		zena.removeModuleCoordinate(socProf);
		zena.removeModuleLecture(socProf);
		
		matt.unEnroll(forScience);
		socProf.remStudent(matt);
		
		oop.addCoordinator(jonathan);
		jonathan.appendModuleLecture(oop);
		
		ben.enroll(oop);
		egor.enroll(oop);
		oop.addStudent(matt);
		oop.addStudent(tom);
		assert ben.getCredits() == egor.getCredits();
		
		assert jonathan.numberOfLectureModules() > yiming.numberOfLectureModules();
		assert richard.numberOfCoordinateModules() > zena.numberOfCoordinateModules();
	}
}