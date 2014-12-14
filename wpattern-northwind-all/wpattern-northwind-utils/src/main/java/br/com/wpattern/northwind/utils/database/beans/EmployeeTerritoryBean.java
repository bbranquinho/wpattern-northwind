package br.com.wpattern.northwind.utils.database.beans;

import br.com.wpattern.northwind.utils.beans.BaseBean;
import br.com.wpattern.northwind.utils.database.keys.EmployeeTerritoryKeyBean;

public class EmployeeTerritoryBean extends BaseBean {

	private static final long serialVersionUID = -1985920462960130257L;

	private EmployeeTerritoryKeyBean employeeTerritoryKey;

	public EmployeeTerritoryKeyBean getEmployeeTerritoryKey() {
		return this.employeeTerritoryKey;
	}

	public void setEmployeeTerritoryKey(EmployeeTerritoryKeyBean employeeTerritoryKey) {
		this.employeeTerritoryKey = employeeTerritoryKey;
	}

}
