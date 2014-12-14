package br.com.wpattern.northwind.database.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.wpattern.northwind.database.utils.BaseEntity;

@Entity
@Table(name="CustomerDemographics")
public class CustomerDemographicEntity extends BaseEntity {

	private static final long serialVersionUID = 793956243144169997L;

	@Id
	private String customerTypeId;

	private String customerDesc;

	public String getCustomerTypeId() {
		return this.customerTypeId;
	}

	public void setCustomerTypeId(String customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

	public String getCustomerDesc() {
		return this.customerDesc;
	}

	public void setCustomerDesc(String customerDesc) {
		this.customerDesc = customerDesc;
	}

}
