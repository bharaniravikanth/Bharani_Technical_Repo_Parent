package org.bharani.blog.service.impl;

import org.apache.camel.Body;
import org.apache.camel.Handler;
import org.bharani.blog.schema.StudentAcademicResponseSchema;

public class GetStudentDetailsHandler extends AbstractHandler {

	@Handler
	public StudentAcademicResponseSchema process(@Body String student_id) throws Exception {
		logger.info("inside GetStudentDetailsHandler.process()");
		return null;
	}
}
