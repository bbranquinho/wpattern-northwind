package br.com.wpattern.northwind.database.interfaces;

import br.com.wpattern.northwind.database.entities.CustomerEntity;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;

public interface ICustomerDao extends IGenericDao<CustomerEntity, Long> {

}
