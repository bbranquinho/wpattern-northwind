package br.com.wpattern.northwind.utils.database.beans;

import java.util.List;

import br.com.wpattern.northwind.utils.beans.BaseBean;

public class CategoriesAndSuppliersBean extends BaseBean {

	private static final long serialVersionUID = 4921401331412904304L;

	private List<CategoryBean> category;

	private List<SupplierBean> supplier;

	public CategoriesAndSuppliersBean() {
	}

	public CategoriesAndSuppliersBean(List<CategoryBean> categories, List<SupplierBean> suppliers) {
		this.category = categories;
		this.supplier = suppliers;
	}

	public List<CategoryBean> getCategory() {
		return this.category;
	}

	public void setCategory(List<CategoryBean> category) {
		this.category = category;
	}

	public List<SupplierBean> getSupplier() {
		return this.supplier;
	}

	public void setSupplier(List<SupplierBean> supplier) {
		this.supplier = supplier;
	}

}
