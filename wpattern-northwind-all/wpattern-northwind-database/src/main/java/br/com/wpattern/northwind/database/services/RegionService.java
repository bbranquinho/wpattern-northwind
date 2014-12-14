package br.com.wpattern.northwind.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.RegionEntity;
import br.com.wpattern.northwind.database.interfaces.IRegionDao;
import br.com.wpattern.northwind.database.utils.GenericService;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;
import br.com.wpattern.northwind.utils.database.beans.RegionBean;
import br.com.wpattern.northwind.utils.database.interfaces.IRegionService;

@Named
public class RegionService extends GenericService<RegionBean, RegionEntity, Long> implements IRegionService {

	@Inject
	private IRegionDao regionDao;

	@Override
	protected IGenericDao<RegionEntity, Long> getConcreteDao() {
		return this.regionDao;
	}

}
