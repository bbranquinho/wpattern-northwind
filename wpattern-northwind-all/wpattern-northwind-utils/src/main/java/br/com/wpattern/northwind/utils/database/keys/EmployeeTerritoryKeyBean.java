package br.com.wpattern.northwind.utils.database.keys;

import br.com.wpattern.northwind.utils.beans.BaseBean;

public class EmployeeTerritoryKeyBean extends BaseBean {

	private static final long serialVersionUID = 3053435448879085930L;

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

}
