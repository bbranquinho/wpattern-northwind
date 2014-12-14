package br.com.wpattern.northwind.database.daos;

import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.ProductEntity;
import br.com.wpattern.northwind.database.interfaces.IProductDao;
import br.com.wpattern.northwind.database.utils.GenericDao;

@Named
public class ProductDao extends GenericDao<ProductEntity, Long> implements IProductDao {

}
