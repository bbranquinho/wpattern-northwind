package br.com.wpattern.northwind.utils.database.beans;

import br.com.wpattern.northwind.utils.beans.BaseBean;

public class RegionBean extends BaseBean {

	private static final long serialVersionUID = 1767153710840509790L;

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
