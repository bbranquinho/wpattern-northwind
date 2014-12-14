package br.com.wpattern.northwind.database.daos;

import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.CustomerDemographicEntity;
import br.com.wpattern.northwind.database.interfaces.ICustomerDemographicDao;
import br.com.wpattern.northwind.database.utils.GenericDao;

@Named
public class CustomerDemographicDao extends GenericDao<CustomerDemographicEntity, Long> implements ICustomerDemographicDao {

}
