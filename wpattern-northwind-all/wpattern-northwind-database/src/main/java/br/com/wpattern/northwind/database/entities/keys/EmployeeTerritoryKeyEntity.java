package br.com.wpattern.northwind.database.entities.keys;

import javax.persistence.Embeddable;

import br.com.wpattern.northwind.database.utils.BaseKey;

@Embeddable
public class EmployeeTerritoryKeyEntity extends BaseKey {

	private static final long serialVersionUID = 3213987759124775296L;

	private Long employeeId;

	private String territoryId;

	public Long getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getTerritoryId() {
		return this.territoryId;
	}

	public void setTerritoryId(String territoryId) {
		this.territoryId = territoryId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.employeeId == null) ? 0 : this.employeeId.hashCode());
		result = prime * result
				+ ((this.territoryId == null) ? 0 : this.territoryId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeTerritoryKeyEntity other = (EmployeeTerritoryKeyEntity) obj;
		if (this.employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!this.employeeId.equals(other.employeeId))
			return false;
		if (this.territoryId == null) {
			if (other.territoryId != null)
				return false;
		} else if (!this.territoryId.equals(other.territoryId))
			return false;
		return true;
	}

}
