package br.com.wpattern.northwind.application.interfaces;

import java.util.List;

import br.com.wpattern.northwind.utils.database.beans.CategoryBean;
import br.com.wpattern.northwind.utils.service.interfaces.IServices;

public interface ICategoryGrid {

	public void addCategories(List<CategoryBean> categories);

	public IServices getService();

}
