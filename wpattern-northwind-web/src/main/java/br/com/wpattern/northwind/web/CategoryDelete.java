package br.com.wpattern.northwind.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.wpattern.northwind.utils.database.beans.CategoryBean;

@ViewScoped
@ManagedBean
public class CategoryDelete {

	private CategoryBean category;

	public String delete() {
		Factory.getServices().deleteCategory(this.category);
		return "categories?faces-redirect=true";
	}

	public String cancel() {
		return "categories?faces-redirect=true";
	}

	public CategoryBean getCategory() {
		return this.category;
	}

	public void setCategory(CategoryBean category) {
		this.category = category;
	}

}
