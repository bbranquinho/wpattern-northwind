package br.com.wpattern.northwind.test.database;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.wpattern.northwind.database.entities.CategoryEntity;
import br.com.wpattern.northwind.database.entities.SupplierEntity;
import br.com.wpattern.northwind.database.interfaces.ICategoryDao;
import br.com.wpattern.northwind.database.interfaces.ISupplierDao;
import br.com.wpattern.northwind.test.database.base.AbstractDatabaseTestBase;

public class DatabaseQueryTest extends AbstractDatabaseTestBase {

	/**
	 * Logger.
	 */
	private final Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private ICategoryDao categoryDao;

	@Inject
	private ISupplierDao supplierDao;

	@Test
	public void testCategoryQuery() {
		List<CategoryEntity> categories = this.categoryDao.findCategoriesByProductName("gu");

		if (this.logger.isDebugEnabled()) {
			this.logger.debug(categories);
		}
	}

	@Test
	public void testSupplierQuery() {
		List<SupplierEntity> suppliers = this.supplierDao.findSuppliersByProductName("gu");

		if (this.logger.isDebugEnabled()) {
			this.logger.debug(suppliers);
		}
	}

}
