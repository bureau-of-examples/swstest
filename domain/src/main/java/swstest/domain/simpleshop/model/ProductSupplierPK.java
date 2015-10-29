package swstest.domain.simpleshop.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;

/**
 * The primary key class for the PRODUCT_SUPPLIERS database table.
 * 
 */
@XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop")
@Embeddable
public class ProductSupplierPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PRODUCT_ID", insertable=false, updatable=false)
	private int productId;

	@Column(name="SUPPLIER_ID", insertable=false, updatable=false)
	private int supplierId;

	public ProductSupplierPK() {
	}
	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProductSupplierPK)) {
			return false;
		}
		ProductSupplierPK castOther = (ProductSupplierPK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.supplierId == castOther.supplierId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.supplierId;
		
		return hash;
	}
}