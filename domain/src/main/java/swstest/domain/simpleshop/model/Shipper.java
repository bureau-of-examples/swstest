package swstest.domain.simpleshop.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * The persistent class for the SHIPPERS database table.
 * 
 */
@XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop")
@Entity
@Table(name="SHIPPERS")
@NamedQuery(name="Shipper.findAll", query="SELECT s FROM Shipper s")
public class Shipper implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="shipper")
	private List<Order> orders;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	private Contact contact;

	public Shipper() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setShipper(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setShipper(null);

		return order;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}