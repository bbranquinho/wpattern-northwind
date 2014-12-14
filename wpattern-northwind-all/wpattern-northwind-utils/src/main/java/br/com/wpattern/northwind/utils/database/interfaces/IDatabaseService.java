package br.com.wpattern.northwind.utils.database.interfaces;

public interface IDatabaseService {

	public ICategoryService getCategoryService();

	public ICustomerService getCustomerService();

	public ICustomerCustomerDemoService getCustomerCustomerDemoService();

	public ICustomerDemographicService getCustomerDemographicService();

	public IEmployeeService getEmployeeService();

	public IEmployeeTerritoryService getEmployeeTerritoryService();

	public IOrderService getOrderService();

	public IOrderDetailService getOrderDetailService();

	public IProductService getProductService();

	public IRegionService getRegionService();

	public IShipperService getShipperService();

	public ISupplierService getSupplierService();

	public ITerritoryService getTerritoryService();

}
