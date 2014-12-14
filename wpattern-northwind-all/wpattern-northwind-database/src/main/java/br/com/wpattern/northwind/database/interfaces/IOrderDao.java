package br.com.wpattern.northwind.database.interfaces;

import br.com.wpattern.northwind.database.entities.OrderEntity;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;

public interface IOrderDao extends IGenericDao<OrderEntity, Long> {

}
