package org.bharani.blog.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.ehcache.EhcacheConstants;
import org.apache.log4j.Logger;
import org.bharani.blog.schema.StudentAcademicSchema;

public class AddingStudentInCacheProcessor implements Processor {

	Logger logger = Logger.getLogger(this.getClass());

	public void process(Exchange exchange) throws Exception {

		StudentAcademicSchema student = exchange.getIn().getBody(StudentAcademicSchema.class);
		if (student != null) {
			logger.info(this.getClass() + "-------------StudentAcademicSchema Object Received-----------------------> " + student.toString());
			logger.info(this.getClass() + "Caching the Student object ");
			exchange.getOut().setHeader(EhcacheConstants.ACTION, EhcacheConstants.ACTION_PUT);
			exchange.getOut().setHeader(EhcacheConstants.KEY, student.getStudent().getStudent_id());
			exchange.getOut().setBody(student);
		}
	}
}
