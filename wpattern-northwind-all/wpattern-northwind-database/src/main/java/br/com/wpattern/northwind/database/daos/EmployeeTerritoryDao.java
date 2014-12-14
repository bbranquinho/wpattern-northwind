package br.com.wpattern.northwind.database.daos;

import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.EmployeeTerritoryEntity;
import br.com.wpattern.northwind.database.entities.keys.EmployeeTerritoryKeyEntity;
import br.com.wpattern.northwind.database.interfaces.IEmployeeTerritoryDao;
import br.com.wpattern.northwind.database.utils.GenericDao;

@Named
public class EmployeeTerritoryDao extends GenericDao<EmployeeTerritoryEntity, EmployeeTerritoryKeyEntity> implements IEmployeeTerritoryDao {

}
