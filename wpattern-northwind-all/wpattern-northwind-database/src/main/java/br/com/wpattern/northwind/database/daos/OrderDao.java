package br.com.wpattern.northwind.database.daos;

import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.OrderEntity;
import br.com.wpattern.northwind.database.interfaces.IOrderDao;
import br.com.wpattern.northwind.database.utils.GenericDao;

@Named
public class OrderDao extends GenericDao<OrderEntity, Long> implements IOrderDao {

}
