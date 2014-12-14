package br.com.wpattern.northwind.utils.database.interfaces;

import java.util.List;

import br.com.wpattern.northwind.utils.database.beans.CategoryBean;

public interface ICategoryService extends IServiceBase<CategoryBean, Long> {

	List<CategoryBean> findCategoriesByProductName(String productName);

}
