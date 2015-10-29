package swstest.domain.simpleshop.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * The persistent class for the EMPLOYEES database table.
 * 
 */
@XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop")
@Entity
@Table(name="EMPLOYEES")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="EMPLOYMENT_TYPE")
	private int employmentType;

	@Column(name="HIRE_DATE")
	private byte[] hireDate;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	private Contact contact;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="employee")
	private List<Order> orders;

	public Employee() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmploymentType() {
		return this.employmentType;
	}

	public void setEmploymentType(int employmentType) {
		this.employmentType = employmentType;
	}

	public byte[] getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(byte[] hireDate) {
		this.hireDate = hireDate;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setEmployee(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setEmployee(null);

		return order;
	}

}