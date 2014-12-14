package br.com.wpattern.northwind.utils.service.interfaces;

import java.util.List;

import br.com.wpattern.northwind.utils.database.beans.CategoriesAndSuppliersBean;
import br.com.wpattern.northwind.utils.database.beans.CategoryBean;

public interface IServices {

	public Long insertCategory(CategoryBean category);

	public void updateCategory(CategoryBean category);

	public void deleteCategory(CategoryBean category);

	public List<CategoryBean> findAllCategories();

	public CategoryBean findCategoryById(Long id);

	public CategoriesAndSuppliersBean findCategoriesAndSuppliersByProductName(String productName);

}
