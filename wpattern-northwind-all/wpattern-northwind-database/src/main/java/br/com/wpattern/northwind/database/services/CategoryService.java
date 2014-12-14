package br.com.wpattern.northwind.database.services;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.CategoryEntity;
import br.com.wpattern.northwind.database.interfaces.ICategoryDao;
import br.com.wpattern.northwind.database.utils.GenericService;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;
import br.com.wpattern.northwind.utils.database.beans.CategoryBean;
import br.com.wpattern.northwind.utils.database.interfaces.ICategoryService;

@Named
public class CategoryService extends GenericService<CategoryBean, CategoryEntity, Long> implements ICategoryService {

	@Inject
	private ICategoryDao categoryDao;

	@Override
	protected IGenericDao<CategoryEntity, Long> getConcreteDao() {
		return this.categoryDao;
	}

	@Override
	public List<CategoryBean> findCategoriesByProductName(String productName) {
		List<CategoryEntity> categoriesEntity = this.categoryDao.findCategoriesByProductName(productName);

		return parserEntity(categoriesEntity);
	}

}
