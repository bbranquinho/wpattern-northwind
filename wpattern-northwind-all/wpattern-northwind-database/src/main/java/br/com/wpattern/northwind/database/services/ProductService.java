package br.com.wpattern.northwind.database.services;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.ProductEntity;
import br.com.wpattern.northwind.database.interfaces.IProductDao;
import br.com.wpattern.northwind.database.utils.GenericService;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;
import br.com.wpattern.northwind.utils.database.beans.CategoriesAndSuppliersBean;
import br.com.wpattern.northwind.utils.database.beans.CategoryBean;
import br.com.wpattern.northwind.utils.database.beans.ProductBean;
import br.com.wpattern.northwind.utils.database.beans.SupplierBean;
import br.com.wpattern.northwind.utils.database.interfaces.ICategoryService;
import br.com.wpattern.northwind.utils.database.interfaces.IProductService;
import br.com.wpattern.northwind.utils.database.interfaces.ISupplierService;

@Named
public class ProductService extends GenericService<ProductBean, ProductEntity, Long> implements IProductService {

	@Inject
	private ICategoryService categoryService;

	@Inject
	private IProductDao productDao;

	@Inject
	private ISupplierService supplierService;

	@Override
	protected IGenericDao<ProductEntity, Long> getConcreteDao() {
		return this.productDao;
	}

	@Override
	public CategoriesAndSuppliersBean findCategoriesAndSuppliersByProductName(String productName) {
		List<CategoryBean> categories = this.categoryService.findCategoriesByProductName(productName);
		List<SupplierBean> suppliers = this.supplierService.findSuppliersByProductName(productName);

		CategoriesAndSuppliersBean suppliersAndCategoriesBean = new CategoriesAndSuppliersBean(categories, suppliers);

		return suppliersAndCategoriesBean;
	}

}
