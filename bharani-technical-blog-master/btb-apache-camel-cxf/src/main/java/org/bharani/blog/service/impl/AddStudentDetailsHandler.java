package org.bharani.blog.service.impl;

import org.apache.camel.Body;
import org.apache.camel.Handler;
import org.bharani.blog.schema.StudentAcademicSchema;

/**
 * 
 * @author Bharani Ravi Kanth R
 *
 */
public class AddStudentDetailsHandler extends AbstractHandler {

	@Handler
	public void process(@Body StudentAcademicSchema studentAcademicSchema) throws Exception {

		logger.info("inside AddStudentDetailsHandler.process()");

	}
}
