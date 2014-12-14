package br.com.wpattern.northwind.test.database;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.wpattern.northwind.database.entities.CategoryEntity;
import br.com.wpattern.northwind.database.utils.ParserDatabase;
import br.com.wpattern.northwind.utils.database.beans.CategoryBean;

public class ParserDatabaseTest {

	private static final Logger logger = Logger.getLogger(ParserDatabaseTest.class);

	@Test
	public void testeParserDatabase() {
		CategoryBean categoryBean = new CategoryBean();

		categoryBean.setCategoryId(10L);
		categoryBean.setCategoryName("Category");
		categoryBean.setDescription("Description");

		CategoryEntity categoryEntity = ParserDatabase.parserBeanToEntity(categoryBean, CategoryEntity.class);

		logger.debug(categoryEntity);
	}

	@Test
	public void testeListParserDatabase() {
		CategoryBean categoryBean1 = new CategoryBean();

		categoryBean1.setCategoryId(1L);
		categoryBean1.setCategoryName("Category 1");
		categoryBean1.setDescription("Description 2");

		CategoryBean categoryBean2 = new CategoryBean();

		categoryBean2.setCategoryId(2L);
		categoryBean2.setCategoryName("Category 2");
		categoryBean2.setDescription("Description 2");

		List<CategoryBean> categoriesBeans = new ArrayList<CategoryBean>();

		categoriesBeans.add(categoryBean1);
		categoriesBeans.add(categoryBean2);

		List<CategoryEntity> categoriesEntities = ParserDatabase.parserListBeansToEntities(categoriesBeans, CategoryEntity.class);

		logger.debug(categoriesEntities);
	}
}
