package br.com.wpattern.northwind.database.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.wpattern.northwind.database.utils.BaseEntity;

@Entity
@Table(name="Region")
public class RegionEntity extends BaseEntity {

	private static final long serialVersionUID = 5292766533275018525L;

	@Id
	@GeneratedValue
	private Long regionId;

	private String regionDescription;

	public Long getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public String getRegionDescription() {
		return this.regionDescription;
	}

	public void setRegionDescription(String regionDescription) {
		this.regionDescription = regionDescription;
	}

}
