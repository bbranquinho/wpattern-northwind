package br.com.wpattern.northwind.database.entities;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.wpattern.northwind.database.entities.keys.OrderDetailKeyEntity;
import br.com.wpattern.northwind.database.utils.BaseEntity;

@Entity
@Table(name="\"Order Details\"")
public class OrderDetailEntity extends BaseEntity {

	private static final long serialVersionUID = 4145513888438234634L;

	@EmbeddedId
	private OrderDetailKeyEntity orderDetailKey;

	private BigDecimal unitPrice;

	private Integer quantity;

	private Float discount;

	public OrderDetailKeyEntity getOrderDetailKey() {
		return this.orderDetailKey;
	}

	public void setOrderDetailKey(OrderDetailKeyEntity orderDetailKey) {
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
