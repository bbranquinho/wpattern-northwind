package br.com.wpattern.northwind.database.daos;

import javax.inject.Named;

import br.com.wpattern.northwind.database.entities.EmployeeEntity;
import br.com.wpattern.northwind.database.interfaces.IEmployeeDao;
import br.com.wpattern.northwind.database.utils.GenericDao;

@Named
public class EmployeeDao extends GenericDao<EmployeeEntity, Long> implements IEmployeeDao {

}
