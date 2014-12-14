package br.com.wpattern.northwind.test.database;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.wpattern.northwind.database.entities.CategoryEntity;
import br.com.wpattern.northwind.database.entities.CustomerCustomerDemoEntity;
import br.com.wpattern.northwind.database.entities.CustomerDemographicEntity;
import br.com.wpattern.northwind.database.entities.CustomerEntity;
import br.com.wpattern.northwind.database.entities.EmployeeEntity;
import br.com.wpattern.northwind.database.entities.EmployeeTerritoryEntity;
import br.com.wpattern.northwind.database.entities.OrderDetailEntity;
import br.com.wpattern.northwind.database.entities.OrderEntity;
import br.com.wpattern.northwind.database.entities.ProductEntity;
import br.com.wpattern.northwind.database.entities.RegionEntity;
import br.com.wpattern.northwind.database.entities.ShipperEntity;
import br.com.wpattern.northwind.database.entities.SupplierEntity;
import br.com.wpattern.northwind.database.entities.TerritoryEntity;
import br.com.wpattern.northwind.database.interfaces.ICategoryDao;
import br.com.wpattern.northwind.database.interfaces.ICustomerCustomerDemoDao;
import br.com.wpattern.northwind.database.interfaces.ICustomerDao;
import br.com.wpattern.northwind.database.interfaces.ICustomerDemographicDao;
import br.com.wpattern.northwind.database.interfaces.IEmployeeDao;
import br.com.wpattern.northwind.database.interfaces.IEmployeeTerritoryDao;
import br.com.wpattern.northwind.database.interfaces.IOrderDao;
import br.com.wpattern.northwind.database.interfaces.IOrderDetailDao;
import br.com.wpattern.northwind.database.interfaces.IProductDao;
import br.com.wpattern.northwind.database.interfaces.IRegionDao;
import br.com.wpattern.northwind.database.interfaces.IShipperDao;
import br.com.wpattern.northwind.database.interfaces.ISupplierDao;
import br.com.wpattern.northwind.database.interfaces.ITerritoryDao;
import br.com.wpattern.northwind.test.database.base.AbstractDatabaseTestBase;

public class DatabaseDaoTest extends AbstractDatabaseTestBase {

	private final Logger logger = Logger.getLogger(getClass());

	@Inject
	private ICategoryDao categoryDao;

	@Inject
	private ICustomerCustomerDemoDao customerCustomerDemoDao;

	@Inject
	private ICustomerDao customerDao;

	@Inject
	private ICustomerDemographicDao customerDemographicDao;

	@Inject
	private IEmployeeDao employeeDao;

	@Inject
	private IEmployeeTerritoryDao employeeTerritoryDao;

	@Inject
	private IOrderDao orderDao;

	@Inject
	private IOrderDetailDao orderDetailDao;

	@Inject
	private IProductDao productDao;

	@Inject
	private IRegionDao regionDao;

	@Inject
	private IShipperDao shipperDao;

	@Inject
	private ISupplierDao supplierDao;

	@Inject
	private ITerritoryDao territoryDao;

	@Test
	public void testCategoryDao() {
		List<CategoryEntity> categories = this.categoryDao.findAll();

		this.logger.debug(categories);
	}

	@Test
	public void testCustomerCustomerDemoDao() {
		List<CustomerCustomerDemoEntity> customerCustomerDemo = this.customerCustomerDemoDao.findAll();

		this.logger.debug(customerCustomerDemo);
	}

	@Test
	public void testCustomerDao() {
		List<CustomerEntity> customers = this.customerDao.findAll();

		this.logger.debug(customers);
	}

	@Test
	public void testCustomerDemographicDao() {
		List<CustomerDemographicEntity> customerDemographics = this.customerDemographicDao.findAll();

		this.logger.debug(customerDemographics);
	}

	@Test
	public void testEmployeeDao() {
		List<EmployeeEntity> employees = this.employeeDao.findAll();

		this.logger.debug(employees);
	}

	@Test
	public void testEmployeeTerritoryDao() {
		List<EmployeeTerritoryEntity> employeeTerritories = this.employeeTerritoryDao.findAll();

		this.logger.debug(employeeTerritories);
	}

	@Test
	public void testOrderDao() {
		List<OrderEntity> orders = this.orderDao.findAll();

		this.logger.debug(orders);
	}

	@Test
	public void testOrderDetailDao() {
		List<OrderDetailEntity> orderDetails = this.orderDetailDao.findAll();

		this.logger.debug(orderDetails);
	}

	@Test
	public void testProductDao() {
		List<ProductEntity> products = this.productDao.findAll();

		this.logger.debug(products);
	}

	@Test
	public void testRegionDao() {
		List<RegionEntity> regions = this.regionDao.findAll();

		this.logger.debug(regions);
	}

	@Test
	public void testShipperDao() {
		List<ShipperEntity> shippers = this.shipperDao.findAll();

		this.logger.debug(shippers);
	}

	@Test
	public void testSupplierDao() {
		List<SupplierEntity> suppliers = this.supplierDao.findAll();

		this.logger.debug(suppliers);
	}

	@Test
	public void testTerritoryDao() {
		List<TerritoryEntity> territories = this.territoryDao.findAll();

		this.logger.debug(territories);
	}

}
