package br.com.wpattern.northwind.database.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.wpattern.northwind.database.entities.keys.EmployeeTerritoryKeyEntity;
import br.com.wpattern.northwind.database.utils.BaseEntity;

@Entity
@Table(name="EmployeeTerritories")
public class EmployeeTerritoryEntity extends BaseEntity {

	private static final long serialVersionUID = 2038543779795275237L;

	@EmbeddedId
	private EmployeeTerritoryKeyEntity employeeTerritoryKey;

	public EmployeeTerritoryKeyEntity getEmployeeTerritoryKey() {
		return this.employeeTerritoryKey;
	}

	public void setEmployeeTerritoryKey(EmployeeTerritoryKeyEntity employeeTerritoryKey) {
		this.employeeTerritoryKey = employeeTerritoryKey;
	}

}
