package br.com.wpattern.northwind.utils.database.interfaces;

import br.com.wpattern.northwind.utils.database.beans.CategoriesAndSuppliersBean;
import br.com.wpattern.northwind.utils.database.beans.ProductBean;

public interface IProductService extends IServiceBase<ProductBean, Long> {

	public CategoriesAndSuppliersBean findCategoriesAndSuppliersByProductName(String productName);

}
