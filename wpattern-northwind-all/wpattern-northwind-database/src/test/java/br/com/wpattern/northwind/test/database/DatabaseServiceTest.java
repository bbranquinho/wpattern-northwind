package br.com.wpattern.northwind.test.database;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.wpattern.northwind.test.database.base.AbstractDatabaseTestBase;
import br.com.wpattern.northwind.utils.database.beans.CategoryBean;
import br.com.wpattern.northwind.utils.database.beans.CustomerBean;
import br.com.wpattern.northwind.utils.database.beans.CustomerCustomerDemoBean;
import br.com.wpattern.northwind.utils.database.beans.CustomerDemographicBean;
import br.com.wpattern.northwind.utils.database.beans.EmployeeBean;
import br.com.wpattern.northwind.utils.database.beans.EmployeeTerritoryBean;
import br.com.wpattern.northwind.utils.database.beans.OrderBean;
import br.com.wpattern.northwind.utils.database.beans.OrderDetailBean;
import br.com.wpattern.northwind.utils.database.beans.ProductBean;
import br.com.wpattern.northwind.utils.database.beans.RegionBean;
import br.com.wpattern.northwind.utils.database.beans.ShipperBean;
import br.com.wpattern.northwind.utils.database.beans.SupplierBean;
import br.com.wpattern.northwind.utils.database.beans.TerritoryBean;
import br.com.wpattern.northwind.utils.database.interfaces.ICategoryService;
import br.com.wpattern.northwind.utils.database.interfaces.ICustomerCustomerDemoService;
import br.com.wpattern.northwind.utils.database.interfaces.ICustomerDemographicService;
import br.com.wpattern.northwind.utils.database.interfaces.ICustomerService;
import br.com.wpattern.northwind.utils.database.interfaces.IEmployeeService;
import br.com.wpattern.northwind.utils.database.interfaces.IEmployeeTerritoryService;
import br.com.wpattern.northwind.utils.database.interfaces.IOrderDetailService;
import br.com.wpattern.northwind.utils.database.interfaces.IOrderService;
import br.com.wpattern.northwind.utils.database.interfaces.IProductService;
import br.com.wpattern.northwind.utils.database.interfaces.IRegionService;
import br.com.wpattern.northwind.utils.database.interfaces.IShipperService;
import br.com.wpattern.northwind.utils.database.interfaces.ISupplierService;
import br.com.wpattern.northwind.utils.database.interfaces.ITerritoryService;

public class DatabaseServiceTest extends AbstractDatabaseTestBase {

	private final Logger logger = Logger.getLogger(getClass());

	@Inject
	private ICategoryService categoryService;

	@Inject
	private ICustomerCustomerDemoService customerCustomerDemoService;

	@Inject
	private ICustomerDemographicService customerDemographicService;

	@Inject
	private ICustomerService customerService;

	@Inject
	private IEmployeeService employeeService;

	@Inject
	private IEmployeeTerritoryService employeeTerritoryService;

	@Inject
	private IOrderService orderService;

	@Inject
	private IOrderDetailService orderDetailService;

	@Inject
	private IProductService productService;

	@Inject
	private IRegionService regionService;

	@Inject
	private IShipperService shipperService;

	@Inject
	private ISupplierService supplierService;

	@Inject
	private ITerritoryService territoryService;

	@Test
	public void testCategoryService() {
		List<CategoryBean> categories = this.categoryService.findAll();

		this.logger.debug(categories);
	}

	@Test
	public void testCustomerCustomerDemoService() {
		List<CustomerCustomerDemoBean> customerCustomerDemos = this.customerCustomerDemoService.findAll();

		this.logger.debug(customerCustomerDemos);
	}

	@Test
	public void testCustomerDemographicService() {
		List<CustomerDemographicBean> customerDemographics = this.customerDemographicService.findAll();

		this.logger.debug(customerDemographics);
	}

	@Test
	public void testCustomerService() {
		List<CustomerBean> customers = this.customerService.findAll();

		this.logger.debug(customers);
	}

	@Test
	public void testEmployeeService() {
		List<EmployeeBean> employees = this.employeeService.findAll();

		this.logger.debug(employees);
	}

	@Test
	public void testEmployeeTerritoryService() {
		List<EmployeeTerritoryBean> employeeTerritories = this.employeeTerritoryService.findAll();

		this.logger.debug(employeeTerritories);
	}

	@Test
	public void testOrderService() {
		List<OrderBean> orders = this.orderService.findAll();

		this.logger.debug(orders);
	}

	@Test
	public void testOrderDetailService() {
		List<OrderDetailBean> orderDetails = this.orderDetailService.findAll();

		this.logger.debug(orderDetails);
	}

	@Test
	public void testProductService() {
		List<ProductBean> products = this.productService.findAll();

		this.logger.debug(products);
	}

	@Test
	public void testRegionService() {
		List<RegionBean> regions = this.regionService.findAll();

		this.logger.debug(regions);
	}

	@Test
	public void testShipperService() {
		List<ShipperBean> shippers = this.shipperService.findAll();

		this.logger.debug(shippers);
	}

	@Test
	public void testSupplierService() {
		List<SupplierBean> suppliers = this.supplierService.findAll();

		this.logger.debug(suppliers);
	}

	@Test
	public void testTerritoryService() {
		List<TerritoryBean> territories = this.territoryService.findAll();

		this.logger.debug(territories);
	}

}
