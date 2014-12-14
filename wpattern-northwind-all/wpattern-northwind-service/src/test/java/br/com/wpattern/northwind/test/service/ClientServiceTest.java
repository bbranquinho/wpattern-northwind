package br.com.wpattern.northwind.test.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.wpattern.northwind.test.service.base.AbstractServiceTestBase;
import br.com.wpattern.northwind.utils.database.beans.CategoryBean;
import br.com.wpattern.northwind.utils.service.interfaces.IServices;

public class ClientServiceTest extends AbstractServiceTestBase {

	private static final Logger logger = Logger.getLogger(AbstractServiceTestBase.class);

	@Inject
	private IServices services;

	@Test
	public void clientTest() {
		List<CategoryBean> categories = this.services.findAllCategories();

		if (logger.isDebugEnabled()) {
			logger.debug(categories);
		}
	}

}
