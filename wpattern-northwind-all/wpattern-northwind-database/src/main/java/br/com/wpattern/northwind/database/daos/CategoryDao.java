package br.com.wpattern.northwind.database.daos;

import java.util.List;

import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.CategoryEntity;
import br.com.wpattern.northwind.database.interfaces.ICategoryDao;
import br.com.wpattern.northwind.database.utils.GenericDao;

@Named
public class CategoryDao extends GenericDao<CategoryEntity, Long> implements ICategoryDao {

	@Override
	public List<CategoryEntity> findCategoriesByProductName(String productName) {
		return executeQuery("SELECT c FROM CategoryEntity c WHERE (SELECT count(*) FROM ProductEntity p WHERE (p.productName LIKE '%" + productName + "%') AND (p.categoryId = c.categoryId)) > 0");
	}

}
