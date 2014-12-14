package br.com.wpattern.northwind.utils.database.beans;

import java.math.BigDecimal;

import br.com.wpattern.northwind.utils.beans.BaseBean;
import br.com.wpattern.northwind.utils.database.keys.OrderDetailKeyBean;

public class OrderDetailBean extends BaseBean {

	private static final long serialVersionUID = 1258567997277034903L;

	private OrderDetailKeyBean orderDetailKey;

	private BigDecimal unitPrice;

	private Integer quantity;

	private Float discount;

	public OrderDetailKeyBean getOrderDetailKey() {
		return this.orderDetailKey;
	}

	public void setOrderDetailKey(OrderDetailKeyBean orderDetailKey) {
		this.orderDetailKey = orderDetailKey;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getDiscount() {
		return this.discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

}
