package br.com.wpattern.northwind.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.EmployeeEntity;
import br.com.wpattern.northwind.database.interfaces.IEmployeeDao;
import br.com.wpattern.northwind.database.utils.GenericService;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;
import br.com.wpattern.northwind.utils.database.beans.EmployeeBean;
import br.com.wpattern.northwind.utils.database.interfaces.IEmployeeService;

@Named
public class EmployeeService extends GenericService<EmployeeBean, EmployeeEntity, Long> implements IEmployeeService {

	@Inject
	private IEmployeeDao employeeDao;

	@Override
	protected IGenericDao<EmployeeEntity, Long> getConcreteDao() {
		return this.employeeDao;
	}

}
