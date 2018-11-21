package org.bharani.blog.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.bharani.blog.schema.StudentAcademicResponseSchema;
import org.bharani.blog.schema.StudentAcademicSchema;

/**
 * 
 * @author Bharani Ravi Kanth R
 *
 */
@WebService(name = "StudentService")
public interface StudentService {

	public String addStudentDetails(@WebParam(name = "student_academic") StudentAcademicSchema studentAcadamics);

	public StudentAcademicResponseSchema getStudentDetails(@WebParam(name = "studentid") String student_id);

}
