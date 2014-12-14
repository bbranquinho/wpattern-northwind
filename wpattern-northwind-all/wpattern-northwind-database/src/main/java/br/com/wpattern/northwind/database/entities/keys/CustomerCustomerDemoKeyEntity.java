package br.com.wpattern.northwind.database.entities.keys;

import javax.persistence.Embeddable;

import br.com.wpattern.northwind.database.utils.BaseKey;

@Embeddable
public class CustomerCustomerDemoKeyEntity extends BaseKey {

	private static final long serialVersionUID = 4369744859260336714L;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result	+ ((this.customerId == null) ? 0 : this.customerId.hashCode());
		result = prime * result	+ ((this.customerTypeId == null) ? 0 : this.customerTypeId.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (!super.equals(obj))
			return false;

		if (getClass() != obj.getClass())
			return false;

		CustomerCustomerDemoKeyEntity other = (CustomerCustomerDemoKeyEntity) obj;

		if (this.customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!this.customerId.equals(other.customerId))
			return false;
		if (this.customerTypeId == null) {
			if (other.customerTypeId != null)
				return false;
		} else if (!this.customerTypeId.equals(other.customerTypeId))
			return false;

		return true;
	}

}
