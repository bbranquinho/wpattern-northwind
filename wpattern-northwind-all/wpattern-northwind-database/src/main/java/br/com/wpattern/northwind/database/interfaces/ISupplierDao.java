package br.com.wpattern.northwind.database.interfaces;

import java.util.List;

import br.com.wpattern.northwind.database.entities.SupplierEntity;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;

public interface ISupplierDao extends IGenericDao<SupplierEntity, Long> {

	public List<SupplierEntity> findSuppliersByProductName(String productName);

}
