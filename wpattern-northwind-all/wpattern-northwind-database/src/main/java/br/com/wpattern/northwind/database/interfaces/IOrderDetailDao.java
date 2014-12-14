package br.com.wpattern.northwind.database.interfaces;

import br.com.wpattern.northwind.database.entities.OrderDetailEntity;
import br.com.wpattern.northwind.database.entities.keys.OrderDetailKeyEntity;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;

public interface IOrderDetailDao extends IGenericDao<OrderDetailEntity, OrderDetailKeyEntity> {

}
