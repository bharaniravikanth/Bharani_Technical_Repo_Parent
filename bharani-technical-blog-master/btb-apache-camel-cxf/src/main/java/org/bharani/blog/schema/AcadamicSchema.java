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
@XmlType(propOrder = { "student_class", "student_class_section", "student_science_score", "student_math_score", "student_social_studies_score" })
@XmlRootElement(name = "AcadamicSchema")
public class AcadamicSchema {

	@XmlElement(name = "student_class", required = true)
	private String student_class;
	@XmlElement(name = "student_class_section", required = true)
	private String student_class_section;
	@XmlElement(name = "student_science_score", required = true)
	private String student_science_score;
	@XmlElement(name = "student_math_score", required = true)
	private String student_math_score;
	@XmlElement(name = "student_social_studies_score", required = true)
	private String student_social_studies_score;

	public String getStudent_class() {
		return student_class;
	}

	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}

	public String getStudent_class_section() {
		return student_class_section;
	}

	public void setStudent_class_section(String student_class_section) {
		this.student_class_section = student_class_section;
	}

	public String getStudent_science_score() {
		return student_science_score;
	}

	public void setStudent_science_score(String student_science_score) {
		this.student_science_score = student_science_score;
	}

	public String getStudent_math_score() {
		return student_math_score;
	}

	public void setStudent_math_score(String student_math_score) {
		this.student_math_score = student_math_score;
	}

	public String getStudent_social_studies_score() {
		return student_social_studies_score;
	}

	public void setStudent_social_studies_score(String student_social_studies_score) {
		this.student_social_studies_score = student_social_studies_score;
	}

	@Override
	public String toString() {
		return "AcadamicSchema [student_class=" + student_class + ", student_class_section=" + student_class_section + ", student_science_score=" + student_science_score + ", student_math_score=" + student_math_score + ", student_social_studies_score="
				+ student_social_studies_score + "]";
	}

}
