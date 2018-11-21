package org.bharani.blog.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.ehcache.EhcacheConstants;
import org.apache.log4j.Logger;

public class GettingStudentFromCacheProcessor implements Processor {

	Logger logger = Logger.getLogger(this.getClass());

	public void process(Exchange exchange) throws Exception {

		String student_ID = exchange.getIn().getBody(String.class);
		if (student_ID != null) {
			exchange.getOut().setHeader(EhcacheConstants.ACTION, EhcacheConstants.ACTION_GET);;
			exchange.getOut().setHeader(EhcacheConstants.KEY, student_ID);
		}
	}
}
