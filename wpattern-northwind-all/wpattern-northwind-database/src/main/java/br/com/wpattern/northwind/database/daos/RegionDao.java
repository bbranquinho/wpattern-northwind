package br.com.wpattern.northwind.database.daos;

import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.RegionEntity;
import br.com.wpattern.northwind.database.interfaces.IRegionDao;
import br.com.wpattern.northwind.database.utils.GenericDao;

@Named
public class RegionDao extends GenericDao<RegionEntity, Long> implements IRegionDao {

}
