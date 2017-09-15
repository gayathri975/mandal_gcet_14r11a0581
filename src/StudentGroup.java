import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.student = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		this.student = new getstudents();
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		this.student = new setstudents();
	}

	@Override
	public Student getStudent(int index) {
		this.student = new getstudent(10);
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		this.student = new setstudent("soniya", 20);
	}

	@Override
	public void addFirst(Student student) {
		this.student = new addFirst("hari");
	}

	@Override
	public void addLast(Student student) {
		this.student = new addLast("vanga");
	}

	@Override
	public void add(Student student, int index) {
		this.student = new add(kushal, 30);
	}

	@Override
	public void remove(int index) {
		this.student = new remove(20);
	}

	@Override
	public void remove(Student student) {
		this.student = new remove("soniya");
	}

	@Override
	public void removeFromIndex(int index) {
		this.student = new removeFromIndex(30);
	}

	@Override
	public void removeFromElement(Student student) {
		this.student = new removeFromElement("haritha");
	}

	@Override
	public void removeToIndex(int index) {
		this.student = new removeToIndex(25);
	}

	@Override
	public void removeToElement(Student student) {
		this.student = new removeToElement("manasa");
	}

	@Override
	public void bubbleSort() {
		bubblesort(student);
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		this.student = new getByBirthDate(15-06-1996);
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
           this.student = new getBetweenBirthDates(12-08-1996,15-10-1997);
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		this.student = new getNearBirthDate(15-06-2000, 120);
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		this.student = new getCurrentAgeByDate(30);
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		this.student = new getStudentByAge(22);
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		this.student = new getStudensWithMaxAvgMark();
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		this.student = new getNextStudent("lavanya");
		return null;
	}
}
