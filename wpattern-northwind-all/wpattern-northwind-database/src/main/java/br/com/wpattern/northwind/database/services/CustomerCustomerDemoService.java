package br.com.wpattern.northwind.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.CustomerCustomerDemoEntity;
import br.com.wpattern.northwind.database.entities.keys.CustomerCustomerDemoKeyEntity;
import br.com.wpattern.northwind.database.interfaces.ICustomerCustomerDemoDao;
import br.com.wpattern.northwind.database.utils.GenericServiceWithKey;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;
import br.com.wpattern.northwind.utils.database.beans.CustomerCustomerDemoBean;
import br.com.wpattern.northwind.utils.database.interfaces.ICustomerCustomerDemoService;
import br.com.wpattern.northwind.utils.database.keys.CustomerCustomerDemoKeyBean;

@Named
public class CustomerCustomerDemoService extends GenericServiceWithKey<CustomerCustomerDemoBean, CustomerCustomerDemoEntity, CustomerCustomerDemoKeyBean, CustomerCustomerDemoKeyEntity>
implements ICustomerCustomerDemoService {

	@Inject
	private ICustomerCustomerDemoDao customerCustomerDemoDao;

	@Override
	protected IGenericDao<CustomerCustomerDemoEntity, CustomerCustomerDemoKeyEntity> getConcreteDao() {
		return this.customerCustomerDemoDao;
	}

}
