package br.com.wpattern.northwind.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.ShipperEntity;
import br.com.wpattern.northwind.database.interfaces.IShipperDao;
import br.com.wpattern.northwind.database.utils.GenericService;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;
import br.com.wpattern.northwind.utils.database.beans.ShipperBean;
import br.com.wpattern.northwind.utils.database.interfaces.IShipperService;

@Named
public class ShipperService extends GenericService<ShipperBean, ShipperEntity, Long> implements IShipperService {

	@Inject
	private IShipperDao shipperDao;

	@Override
	protected IGenericDao<ShipperEntity, Long> getConcreteDao() {
		return this.shipperDao;
	}

}
