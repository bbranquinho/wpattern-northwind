package br.com.wpattern.northwind.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.TerritoryEntity;
import br.com.wpattern.northwind.database.interfaces.ITerritoryDao;
import br.com.wpattern.northwind.database.utils.GenericService;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;
import br.com.wpattern.northwind.utils.database.beans.TerritoryBean;
import br.com.wpattern.northwind.utils.database.interfaces.ITerritoryService;

@Named
public class TerritoryService extends GenericService<TerritoryBean, TerritoryEntity, String> implements ITerritoryService {

	@Inject
	private ITerritoryDao territoryDao;

	@Override
	protected IGenericDao<TerritoryEntity, String> getConcreteDao() {
		return this.territoryDao;
	}

}
