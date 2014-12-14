package br.com.wpattern.northwind.utils.database.beans;

import br.com.wpattern.northwind.utils.beans.BaseBean;

public class TerritoryBean extends BaseBean {

	private static final long serialVersionUID = -5595366573533155123L;

	private String territoryId;

	private String territoryDescription;

	private Long regionId;

	public String getTerritoryId() {
		return this.territoryId;
	}

	public void setTerritoryId(String territoryId) {
		this.territoryId = territoryId;
	}

	public String getTerritoryDescription() {
		return this.territoryDescription;
	}

	public void setTerritoryDescription(String territoryDescription) {
		this.territoryDescription = territoryDescription;
	}

	public Long getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

}
