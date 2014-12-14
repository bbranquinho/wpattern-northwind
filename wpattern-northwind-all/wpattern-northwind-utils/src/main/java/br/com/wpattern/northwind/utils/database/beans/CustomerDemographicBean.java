package br.com.wpattern.northwind.utils.database.beans;

import br.com.wpattern.northwind.utils.beans.BaseBean;

public class CustomerDemographicBean extends BaseBean {

	private static final long serialVersionUID = 6443248907331883548L;

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
