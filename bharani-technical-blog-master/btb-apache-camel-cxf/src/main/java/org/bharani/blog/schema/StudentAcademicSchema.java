package org.bharani.blog.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * @author Bharani Ravi Kanth R
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "student", "acadamics" })
@XmlRootElement(name = "StudentAcademic")

public class StudentAcademicSchema {

	@XmlElement(name = "student", required = true)
	private StudentSchema student;
	@XmlElement(name = "acadamics", required = true)
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
