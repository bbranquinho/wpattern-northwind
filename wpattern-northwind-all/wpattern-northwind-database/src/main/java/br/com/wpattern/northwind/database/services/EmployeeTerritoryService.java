package br.com.wpattern.northwind.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.EmployeeTerritoryEntity;
import br.com.wpattern.northwind.database.entities.keys.EmployeeTerritoryKeyEntity;
import br.com.wpattern.northwind.database.interfaces.IEmployeeTerritoryDao;
import br.com.wpattern.northwind.database.utils.GenericServiceWithKey;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;
import br.com.wpattern.northwind.utils.database.beans.EmployeeTerritoryBean;
import br.com.wpattern.northwind.utils.database.interfaces.IEmployeeTerritoryService;
import br.com.wpattern.northwind.utils.database.keys.EmployeeTerritoryKeyBean;

@Named
public class EmployeeTerritoryService extends GenericServiceWithKey<EmployeeTerritoryBean, EmployeeTerritoryEntity, EmployeeTerritoryKeyBean,  EmployeeTerritoryKeyEntity>
implements IEmployeeTerritoryService {

	@Inject
	private IEmployeeTerritoryDao employeeTerritoryDao;

	@Override
	protected IGenericDao<EmployeeTerritoryEntity, EmployeeTerritoryKeyEntity> getConcreteDao() {
		return this.employeeTerritoryDao;
	}


}
