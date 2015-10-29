package swstest.domain.simpleshop.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * The persistent class for the SUPPLIERS database table.
 * 
 */
@XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop")
@Entity
@Table(name="SUPPLIERS")
@NamedQuery(name="Supplier.findAll", query="SELECT s FROM Supplier s")
public class Supplier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to OrderItem
	@OneToMany(mappedBy="supplier")
	private List<OrderItem> orderItems;

	//bi-directional many-to-one association to ProductSupplier
	@OneToMany(mappedBy="supplier")
	private List<ProductSupplier> productSuppliers;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	private Contact contact;

	public Supplier() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public OrderItem addOrderItem(OrderItem orderItem) {
		getOrderItems().add(orderItem);
		orderItem.setSupplier(this);

		return orderItem;
	}

	public OrderItem removeOrderItem(OrderItem orderItem) {
		getOrderItems().remove(orderItem);
		orderItem.setSupplier(null);

		return orderItem;
	}

	public List<ProductSupplier> getProductSuppliers() {
		return this.productSuppliers;
	}

	public void setProductSuppliers(List<ProductSupplier> productSuppliers) {
		this.productSuppliers = productSuppliers;
	}

	public ProductSupplier addProductSupplier(ProductSupplier productSupplier) {
		getProductSuppliers().add(productSupplier);
		productSupplier.setSupplier(this);

		return productSupplier;
	}

	public ProductSupplier removeProductSupplier(ProductSupplier productSupplier) {
		getProductSuppliers().remove(productSupplier);
		productSupplier.setSupplier(null);

		return productSupplier;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}