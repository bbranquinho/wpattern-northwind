package br.com.wpattern.northwind.database.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.wpattern.northwind.database.utils.BaseEntity;

@Entity
@Table(name="Territories")
public class TerritoryEntity extends BaseEntity {

	private static final long serialVersionUID = 9192327415417989794L;

	@Id
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
