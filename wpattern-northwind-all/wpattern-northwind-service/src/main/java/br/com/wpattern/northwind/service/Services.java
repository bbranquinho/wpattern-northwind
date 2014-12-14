package br.com.wpattern.northwind.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;

import br.com.wpattern.northwind.utils.database.beans.CategoriesAndSuppliersBean;
import br.com.wpattern.northwind.utils.database.beans.CategoryBean;
import br.com.wpattern.northwind.utils.database.interfaces.ICategoryService;
import br.com.wpattern.northwind.utils.database.interfaces.IProductService;
import br.com.wpattern.northwind.utils.service.interfaces.IServices;

@Named
public class Services implements IServices
{
	private final Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private ICategoryService categoryService;

	@Inject
	private IProductService productService;

	@Override
	public Long insertCategory(CategoryBean category) {
		return this.categoryService.insert(category);
	}

	@Override
	public void updateCategory(CategoryBean category) {
		this.categoryService.update(category);
	}

	@Override
	public void deleteCategory(CategoryBean category) {
		this.categoryService.delete(category);
	}

	@Override
	public List<CategoryBean> findAllCategories() {
		if (this.logger.isDebugEnabled()) {
			this.logger.debug("Service invoked - findAllCategories");
		}

		return this.categoryService.findAll();
	}

	@Override
	public CategoryBean findCategoryById(Long id) {
		return this.categoryService.findById(id);
	}

	@Override
	public CategoriesAndSuppliersBean findCategoriesAndSuppliersByProductName(String productName) {
		if (this.logger.isDebugEnabled()) {
			this.logger.debug("Service invoked - findCategoriesAndSuppliersByProductName");
		}

		return this.productService.findCategoriesAndSuppliersByProductName(productName);
	}

}
