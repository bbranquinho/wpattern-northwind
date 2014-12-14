package br.com.wpattern.northwind.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.CustomerEntity;
import br.com.wpattern.northwind.database.interfaces.ICustomerDao;
import br.com.wpattern.northwind.database.utils.GenericService;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;
import br.com.wpattern.northwind.utils.database.beans.CustomerBean;
import br.com.wpattern.northwind.utils.database.interfaces.ICustomerService;

@Named
public class CustomerService extends GenericService<CustomerBean, CustomerEntity, Long> implements ICustomerService {

	@Inject
	private ICustomerDao customerDao;

	@Override
	protected IGenericDao<CustomerEntity, Long> getConcreteDao() {
		return this.customerDao;
	}

}
