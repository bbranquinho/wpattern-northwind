package br.com.wpattern.northwind.database.services;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.SupplierEntity;
import br.com.wpattern.northwind.database.interfaces.ISupplierDao;
import br.com.wpattern.northwind.database.utils.GenericService;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;
import br.com.wpattern.northwind.utils.database.beans.SupplierBean;
import br.com.wpattern.northwind.utils.database.interfaces.ISupplierService;

@Named
public class SupplierService extends GenericService<SupplierBean, SupplierEntity, Long> implements ISupplierService {

	@Inject
	private ISupplierDao supplierDao;

	@Override
	protected IGenericDao<SupplierEntity, Long> getConcreteDao() {
		return this.supplierDao;
	}

	@Override
	public List<SupplierBean> findSuppliersByProductName(String productName) {
		List<SupplierEntity> suppliersEntity = this.supplierDao.findSuppliersByProductName(productName);

		return parserEntity(suppliersEntity);
	}

}
