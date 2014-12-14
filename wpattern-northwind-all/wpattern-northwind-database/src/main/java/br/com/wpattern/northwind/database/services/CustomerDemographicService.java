package br.com.wpattern.northwind.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.CustomerDemographicEntity;
import br.com.wpattern.northwind.database.interfaces.ICustomerDemographicDao;
import br.com.wpattern.northwind.database.utils.GenericService;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;
import br.com.wpattern.northwind.utils.database.beans.CustomerDemographicBean;
import br.com.wpattern.northwind.utils.database.interfaces.ICustomerDemographicService;

@Named
public class CustomerDemographicService extends GenericService<CustomerDemographicBean, CustomerDemographicEntity, Long> implements ICustomerDemographicService {

	@Inject
	private ICustomerDemographicDao customerDemographicDao;

	@Override
	protected IGenericDao<CustomerDemographicEntity, Long> getConcreteDao() {
		return this.customerDemographicDao;
	}

}
