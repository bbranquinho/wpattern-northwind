package br.com.wpattern.northwind.utils.database.keys;

import br.com.wpattern.northwind.utils.beans.BaseBean;

public class OrderDetailKeyBean extends BaseBean {

	private static final long serialVersionUID = 3306153454146037073L;

	private Long orderId;

	private Long productId;

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.orderId == null) ? 0 : this.orderId.hashCode());
		result = prime * result
				+ ((this.productId == null) ? 0 : this.productId.hashCode());
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
		OrderDetailKeyBean other = (OrderDetailKeyBean) obj;
		if (this.orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!this.orderId.equals(other.orderId))
			return false;
		if (this.productId == null) {
			if (other.productId != null)
				return false;
		} else if (!this.productId.equals(other.productId))
			return false;
		return true;
	}

}
