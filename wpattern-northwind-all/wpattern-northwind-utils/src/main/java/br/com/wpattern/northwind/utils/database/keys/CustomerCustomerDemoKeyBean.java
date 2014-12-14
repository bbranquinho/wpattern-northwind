package br.com.wpattern.northwind.utils.database.keys;

import br.com.wpattern.northwind.utils.beans.BaseBean;

public class CustomerCustomerDemoKeyBean extends BaseBean {

	private static final long serialVersionUID = 6181882805756871863L;

	private String customerId;

	private String customerTypeId;

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerTypeId() {
		return this.customerTypeId;
	}

	public void setCustomerTypeId(String customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

}
