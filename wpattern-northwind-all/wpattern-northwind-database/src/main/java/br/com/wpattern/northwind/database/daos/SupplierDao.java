package br.com.wpattern.northwind.database.daos;

import java.util.List;

import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.SupplierEntity;
import br.com.wpattern.northwind.database.interfaces.ISupplierDao;
import br.com.wpattern.northwind.database.utils.GenericDao;

@Named
public class SupplierDao extends GenericDao<SupplierEntity, Long> implements ISupplierDao {

	@Override
	public List<SupplierEntity> findSuppliersByProductName(String productName) {
		return executeQuery("SELECT s FROM SupplierEntity s WHERE (SELECT count(*) FROM ProductEntity p WHERE (p.productName LIKE '%" + productName + "%') AND (p.supplierId = s.supplierId)) > 0");
	}

}
