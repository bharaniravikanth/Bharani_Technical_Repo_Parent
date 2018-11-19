package org.bharani.blog.service;

import org.bharani.blog.schema.StudentAcademicSchema;

public interface StudentService {

	public void addStudentDetails(StudentAcademicSchema studentAcadamics);

	public String getStudentDetails(String student_id);

}
