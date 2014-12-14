package br.com.wpattern.northwind.application.service.client;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.application.utils.interfaces.IApplicationServices;
import br.com.wpattern.northwind.utils.database.beans.CategoriesAndSuppliersBean;
import br.com.wpattern.northwind.utils.database.beans.CategoryBean;
import br.com.wpattern.northwind.utils.service.interfaces.IServices;

@Named
public class ApplicationServices implements IApplicationServices {

	@Inject
	private IServices services;

	@Override
	public Long insertCategory(CategoryBean category) {
		return this.services.insertCategory(category);
	}

	@Override
	public void updateCategory(CategoryBean category) {
		this.services.updateCategory(category);
	}

	@Override
	public void deleteCategory(CategoryBean category) {
		this.services.deleteCategory(category);
	}

	@Override
	public List<CategoryBean> findAllCategories() {
		return this.services.findAllCategories();
	}
	@Override
	public CategoriesAndSuppliersBean findCategoriesAndSuppliersByProductName(String productName) {
		return this.services.findCategoriesAndSuppliersByProductName(productName);
	}

	@Override
	public CategoryBean findCategoryById(Long id) {
		return this.services.findCategoryById(id);
	}

}
