package br.com.wpattern.northwind.database.interfaces;

import br.com.wpattern.northwind.database.entities.EmployeeEntity;
import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;

public interface IEmployeeDao extends IGenericDao<EmployeeEntity, Long> {

}
