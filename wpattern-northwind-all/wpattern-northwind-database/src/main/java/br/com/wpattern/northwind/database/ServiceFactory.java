package br.com.wpattern.northwind.database;

import javax.inject.Inject;
import javax.inject.Named;

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

@Named
public class ServiceFactory implements IDatabaseService {

	@Inject
	private ICategoryService categoryService;

	@Inject
	private ICustomerCustomerDemoService customerCustomerDemoService;

	@Inject
	private ICustomerService customerService;

	@Inject
	private ICustomerDemographicService customerDemographicService;

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

	@Override
	public ICategoryService getCategoryService() {
		return this.categoryService;
	}

	@Override
	public ICustomerService getCustomerService() {
		return this.customerService;
	}

	@Override
	public ICustomerCustomerDemoService getCustomerCustomerDemoService() {
		return this.customerCustomerDemoService;
	}

	@Override
	public ICustomerDemographicService getCustomerDemographicService() {
		return this.customerDemographicService;
	}

	@Override
	public IEmployeeService getEmployeeService() {
		return this.employeeService;
	}

	@Override
	public IEmployeeTerritoryService getEmployeeTerritoryService() {
		return this.employeeTerritoryService;
	}

	@Override
	public IOrderService getOrderService() {
		return this.orderService;
	}

	@Override
	public IOrderDetailService getOrderDetailService() {
		return this.orderDetailService;
	}

	@Override
	public IProductService getProductService() {
		return this.productService;
	}

	@Override
	public IRegionService getRegionService() {
		return this.regionService;
	}

	@Override
	public IShipperService getShipperService() {
		return this.shipperService;
	}

	@Override
	public ISupplierService getSupplierService() {
		return this.supplierService;
	}

	@Override
	public ITerritoryService getTerritoryService() {
		return this.territoryService;
	}

}
