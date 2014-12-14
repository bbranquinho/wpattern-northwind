package br.com.wpattern.northwind.database.interfaces;

import java.util.List;

import br.com.wpattern.northwind.database.entities.CategoryEntity;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;

public interface ICategoryDao extends IGenericDao<CategoryEntity, Long> {

	public List<CategoryEntity> findCategoriesByProductName(String productName);

}
