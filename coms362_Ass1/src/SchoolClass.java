import java.io.Serializable;

public class SchoolClass implements Serializable {

	/**
	 * Generated UID
	 */
	private static final long serialVersionUID = -4563883151582762151L;
	private Grade grade;
	private String name;

	public SchoolClass(String name, Grade g) {
		grade = g;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Grade getGrade() {
		return grade;
	}

	public boolean passed() {
		return grade != Grade.F;
	}
}
