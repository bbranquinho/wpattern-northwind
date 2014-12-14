package br.com.wpattern.northwind.utils.database.beans;

import br.com.wpattern.northwind.utils.beans.BaseBean;
import br.com.wpattern.northwind.utils.database.keys.CustomerCustomerDemoKeyBean;

public class CustomerCustomerDemoBean extends BaseBean {

	private static final long serialVersionUID = -2051746233714072104L;

	private CustomerCustomerDemoKeyBean customerCustomerDemoKey;

	public CustomerCustomerDemoKeyBean getCustomerCustomerDemoKey() {
		return this.customerCustomerDemoKey;
	}

	public void setCustomerCustomerDemoKey(CustomerCustomerDemoKeyBean customerCustomerDemoKey) {
		this.customerCustomerDemoKey = customerCustomerDemoKey;
	}

}
