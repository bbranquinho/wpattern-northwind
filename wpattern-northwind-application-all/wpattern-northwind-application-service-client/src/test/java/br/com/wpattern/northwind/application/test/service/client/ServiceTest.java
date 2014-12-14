package br.com.wpattern.northwind.application.test.service.client;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.wpattern.northwind.utils.service.interfaces.IServices;

public class ServiceTest extends AbstractBase {

	private Logger logger = Logger.getLogger(getClass());

	@Inject
	private IServices services;

	@Test
	public void testService() {
		this.logger.debug(this.services.findAllCategories());
	}

}
