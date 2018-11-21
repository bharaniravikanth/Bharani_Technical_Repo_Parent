package org.bharani.blog.service.impl;

import org.apache.camel.Body;
import org.apache.camel.Handler;
import org.bharani.blog.schema.StudentAcademicResponseSchema;
import org.bharani.blog.schema.StudentAcademicSchema;
import org.osgi.framework.ServiceException;

public class GetStudentDetailsHandler extends AbstractHandler {

	@Handler
	public StudentAcademicResponseSchema process(@Body StudentAcademicSchema student) throws Exception {
		logger.info("inside GetStudentDetailsHandler.process()");
		StudentAcademicResponseSchema academicResponseSchema = new StudentAcademicResponseSchema();
		if (student != null) {
			academicResponseSchema.setAcadamics(student.getAcadamics());
			academicResponseSchema.setStudent(student.getStudent());
			return academicResponseSchema;
		} else {
			throw new ServiceException("Cannot find Student details");
		}
	}
}
