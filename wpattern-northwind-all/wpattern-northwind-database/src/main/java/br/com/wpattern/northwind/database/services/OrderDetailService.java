package br.com.wpattern.northwind.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.OrderDetailEntity;
import br.com.wpattern.northwind.database.entities.keys.OrderDetailKeyEntity;
import br.com.wpattern.northwind.database.interfaces.IOrderDetailDao;
import br.com.wpattern.northwind.database.utils.GenericServiceWithKey;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;
import br.com.wpattern.northwind.utils.database.beans.OrderDetailBean;
import br.com.wpattern.northwind.utils.database.interfaces.IOrderDetailService;
import br.com.wpattern.northwind.utils.database.keys.OrderDetailKeyBean;

@Named
public class OrderDetailService extends GenericServiceWithKey<OrderDetailBean, OrderDetailEntity, OrderDetailKeyBean, OrderDetailKeyEntity> implements IOrderDetailService {

	@Inject
	private IOrderDetailDao orderDetailDao;

	@Override
	protected IGenericDao<OrderDetailEntity, OrderDetailKeyEntity> getConcreteDao() {
		return this.orderDetailDao;
	}

}
