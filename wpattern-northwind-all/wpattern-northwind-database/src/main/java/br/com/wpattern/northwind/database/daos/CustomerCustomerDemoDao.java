package br.com.wpattern.northwind.database.daos;

import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.CustomerCustomerDemoEntity;
import br.com.wpattern.northwind.database.entities.keys.CustomerCustomerDemoKeyEntity;
import br.com.wpattern.northwind.database.interfaces.ICustomerCustomerDemoDao;
import br.com.wpattern.northwind.database.utils.GenericDao;

@Named
public class CustomerCustomerDemoDao extends GenericDao<CustomerCustomerDemoEntity, CustomerCustomerDemoKeyEntity> implements ICustomerCustomerDemoDao {

}
