package br.com.wpattern.northwind.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.OrderEntity;
import br.com.wpattern.northwind.database.interfaces.IOrderDao;
import br.com.wpattern.northwind.database.utils.GenericService;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;
import br.com.wpattern.northwind.utils.database.beans.OrderBean;
import br.com.wpattern.northwind.utils.database.interfaces.IOrderService;

@Named
public class OrderService extends GenericService<OrderBean, OrderEntity, Long> implements IOrderService {

	@Inject
	private IOrderDao orderDao;

	@Override
	protected IGenericDao<OrderEntity, Long> getConcreteDao() {
		return this.orderDao;
	}

}
