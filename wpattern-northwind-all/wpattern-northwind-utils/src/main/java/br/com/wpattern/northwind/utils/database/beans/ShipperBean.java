package br.com.wpattern.northwind.utils.database.beans;

import br.com.wpattern.northwind.utils.beans.BaseBean;

public class ShipperBean extends BaseBean {

	private static final long serialVersionUID = -8164789475702544857L;

	private Long shipperId;

	private String companyName;

	private String phone;

	public Long getShipperId() {
		return this.shipperId;
	}

	public void setShipperId(Long shipperId) {
		this.shipperId = shipperId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
