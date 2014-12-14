package br.com.wpattern.northwind.database.daos;

import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.TerritoryEntity;
import br.com.wpattern.northwind.database.interfaces.ITerritoryDao;
import br.com.wpattern.northwind.database.utils.GenericDao;

@Named
public class TerritoryDao extends GenericDao<TerritoryEntity, String> implements ITerritoryDao {

}
