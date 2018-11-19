package org.bharani.blog.service;

import org.bharani.blog.schema.StudentAcademicSchema;

/**
 * 
 * @author Bharani Ravi Kanth R
 *
 */
public interface StudentService {

	public void addStudentDetails(StudentAcademicSchema studentAcadamics);

	public String getStudentDetails(String student_id);

}
