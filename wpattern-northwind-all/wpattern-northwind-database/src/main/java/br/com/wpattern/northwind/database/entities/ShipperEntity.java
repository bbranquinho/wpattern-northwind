package br.com.wpattern.northwind.database.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.wpattern.northwind.database.utils.BaseEntity;

@Entity
@Table(name="Shippers")
public class ShipperEntity extends BaseEntity {

	private static final long serialVersionUID = -8775562070677332786L;

	@Id
	@GeneratedValue
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
