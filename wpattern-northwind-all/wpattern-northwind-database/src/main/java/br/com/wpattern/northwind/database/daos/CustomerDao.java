package br.com.wpattern.northwind.database.daos;

import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.CustomerEntity;
import br.com.wpattern.northwind.database.interfaces.ICustomerDao;
import br.com.wpattern.northwind.database.utils.GenericDao;

@Named
public class CustomerDao extends GenericDao<CustomerEntity, Long> implements ICustomerDao {

}
