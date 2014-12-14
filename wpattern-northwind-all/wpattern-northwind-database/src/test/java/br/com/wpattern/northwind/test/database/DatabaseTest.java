package br.com.wpattern.northwind.test.database;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.wpattern.northwind.test.database.base.AbstractDatabaseTestBase;
import br.com.wpattern.northwind.utils.database.interfaces.ICategoryService;
import br.com.wpattern.northwind.utils.database.interfaces.ICustomerCustomerDemoService;
import br.com.wpattern.northwind.utils.database.interfaces.ICustomerDemographicService;
import br.com.wpattern.northwind.utils.database.interfaces.ICustomerService;
import br.com.wpattern.northwind.utils.database.interfaces.IDatabaseService;
import br.com.wpattern.northwind.utils.database.interfaces.IEmployeeService;
import br.com.wpattern.northwind.utils.database.interfaces.IEmployeeTerritoryService;
import br.com.wpattern.northwind.utils.database.interfaces.IOrderDetailService;
import br.com.wpattern.northwind.utils.database.interfaces.IOrderService;
import br.com.wpattern.northwind.utils.database.interfaces.IProductService;
import br.com.wpattern.northwind.utils.database.interfaces.IRegionService;
import br.com.wpattern.northwind.utils.database.interfaces.IShipperService;
import br.com.wpattern.northwind.utils.database.interfaces.ISupplierService;
import br.com.wpattern.northwind.utils.database.interfaces.ITerritoryService;

public class DatabaseTest extends AbstractDatabaseTestBase {

	private final Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private IDatabaseService databaseService;

	@Test
	public void testCategoryService() {
		ICategoryService categoryService = this.databaseService.getCategoryService();

		this.logger.debug(categoryService.findAll());
	}

	@Test
	public void testCustomerService() {
		ICustomerService customerService = this.databaseService.getCustomerService();

		this.logger.debug(customerService.findAll());
	}

	@Test
	public void testCustomerCustomerDemoService() {
		ICustomerCustomerDemoService customerCustomerDemoService = this.databaseService.getCustomerCustomerDemoService();

		this.logger.debug(customerCustomerDemoService.findAll());
	}

	@Test
	public void testCustomerDemographicsService() {
		ICustomerDemographicService customerDemographicService = this.databaseService.getCustomerDemographicService();

		this.logger.debug(customerDemographicService.findAll());
	}

	@Test
	public void testEmployeeService() {
		IEmployeeService employeeService = this.databaseService.getEmployeeService();

		this.logger.debug(employeeService.findAll());
	}

	@Test
	public void testEmployeeTerritoryService() {
		IEmployeeTerritoryService employeeTerritoryService = this.databaseService.getEmployeeTerritoryService();

		this.logger.debug(employeeTerritoryService.findAll());
	}

	@Test
	public void testOrderService() {
		IOrderService orderService = this.databaseService.getOrderService();

		this.logger.debug(orderService.findAll());
	}

	@Test
	public void testOrderDetailService() {
		IOrderDetailService orderDetailService = this.databaseService.getOrderDetailService();

		this.logger.debug(orderDetailService.findAll());
	}

	@Test
	public void testProductService() {
		IProductService productService = this.databaseService.getProductService();

		this.logger.debug(productService.findAll());
	}

	@Test
	public void testShipperService() {
		IShipperService shipperService = this.databaseService.getShipperService();

		this.logger.debug(shipperService.findAll());
	}

	@Test
	public void testSupplierService() {
		ISupplierService supplierService = this.databaseService.getSupplierService();

		this.logger.debug(supplierService.findAll());
	}

	@Test
	public void testRegionService() {
		IRegionService regionService = this.databaseService.getRegionService();

		this.logger.debug(regionService.findAll());
	}

	@Test
	public void testTerritoryService() {
		ITerritoryService territoryService = this.databaseService.getTerritoryService();

		this.logger.debug(territoryService.findAll());
	}

}
