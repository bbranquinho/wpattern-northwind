package br.com.wpattern.northwind.database.daos;

import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.OrderDetailEntity;
import br.com.wpattern.northwind.database.entities.keys.OrderDetailKeyEntity;
import br.com.wpattern.northwind.database.interfaces.IOrderDetailDao;
import br.com.wpattern.northwind.database.utils.GenericDao;

@Named
public class OrderDetailDao extends GenericDao<OrderDetailEntity, OrderDetailKeyEntity> implements IOrderDetailDao {

}
