package org.bharani.blog.schema;

public class StudentAcademicResponseSchema {

	private StudentSchema student;
	private AcadamicSchema acadamics;

	public StudentSchema getStudent() {
		return student;
	}

	public void setStudent(StudentSchema student) {
		this.student = student;
	}

	public AcadamicSchema getAcadamics() {
		return acadamics;
	}

	public void setAcadamics(AcadamicSchema acadamics) {
		this.acadamics = acadamics;
	}

	@Override
	public String toString() {
		return "StudentAcademicSchema [student=" + student + ", acadamics=" + acadamics + "]";
	}

}
