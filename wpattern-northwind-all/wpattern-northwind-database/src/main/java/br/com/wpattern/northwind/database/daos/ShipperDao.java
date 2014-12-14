package br.com.wpattern.northwind.database.daos;

import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.ShipperEntity;
import br.com.wpattern.northwind.database.interfaces.IShipperDao;
import br.com.wpattern.northwind.database.utils.GenericDao;

@Named
public class ShipperDao extends GenericDao<ShipperEntity, Long> implements IShipperDao {

}
