package br.com.wpattern.northwind.database.interfaces;

import br.com.wpattern.northwind.database.entities.ProductEntity;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;

public interface IProductDao extends IGenericDao<ProductEntity, Long> {

}
