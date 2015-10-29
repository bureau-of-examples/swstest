package swstest.domain.simpleshop.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;

/**
 * The primary key class for the ORDER_ITEMS database table.
 * 
 */
@XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop")
@Embeddable
public class OrderItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private int orderId;

	@Column(name="ITEM_INDEX")
	private int itemIndex;

	public OrderItemPK() {
	}
	public int getOrderId() {
		return this.orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getItemIndex() {
		return this.itemIndex;
	}
	public void setItemIndex(int itemIndex) {
		this.itemIndex = itemIndex;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderItemPK)) {
			return false;
		}
		OrderItemPK castOther = (OrderItemPK)other;
		return 
			(this.orderId == castOther.orderId)
			&& (this.itemIndex == castOther.itemIndex);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId;
		hash = hash * prime + this.itemIndex;
		
		return hash;
	}
}