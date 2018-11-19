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
@XmlType(propOrder = { "student_id", "student_name", "student_age" })
@XmlRootElement(name = "StudentSchema")
public class StudentSchema {

	@XmlElement(name = "student_id", required = true)
	private String student_id;
	@XmlElement(name = "student_name", required = true)
	private String student_name;
	@XmlElement(name = "student_age", required = true)
	private String student_age;

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_age() {
		return student_age;
	}

	public void setStudent_age(String student_age) {
		this.student_age = student_age;
	}

	@Override
	public String toString() {
		return "StudentSchema [student_id=" + student_id + ", student_name=" + student_name + ", student_age=" + student_age + "]";
	}

}
