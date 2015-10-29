package swstest.domain.simpleshop.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ORDERS database table.
 * 
 */
@XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop")
@Entity
@Table(name="ORDERS")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="ADDRESS_LINE1")
	private String addressLine1;

	@Column(name="ADDRESS_LINE2")
	private String addressLine2;

	private BigDecimal freight;

	@Column(name="NUMBER_OF_PARCELS")
	private int numberOfParcels;

	@Column(name="ORDER_DATE")
	private byte[] orderDate;

	@Column(name="REQUIRED_DATE")
	private byte[] requiredDate;

	@Column(name="SHIP_NAME")
	private String shipName;

	@Column(name="SHIPPED_DATE")
	private byte[] shippedDate;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="COUNTRY_CODE")
	private Country country;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	private Customer customer;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	private Employee employee;

	//bi-directional many-to-one association to Shipper
	@ManyToOne
	private Shipper shipper;

	//bi-directional many-to-one association to Suburb
	@ManyToOne
	private Suburb suburb;

	//bi-directional many-to-one association to OrderItem
	@OneToMany(mappedBy="order")
	private List<OrderItem> orderItems;

	public Order() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public BigDecimal getFreight() {
		return this.freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	public int getNumberOfParcels() {
		return this.numberOfParcels;
	}

	public void setNumberOfParcels(int numberOfParcels) {
		this.numberOfParcels = numberOfParcels;
	}

	public byte[] getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(byte[] orderDate) {
		this.orderDate = orderDate;
	}

	public byte[] getRequiredDate() {
		return this.requiredDate;
	}

	public void setRequiredDate(byte[] requiredDate) {
		this.requiredDate = requiredDate;
	}

	public String getShipName() {
		return this.shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public byte[] getShippedDate() {
		return this.shippedDate;
	}

	public void setShippedDate(byte[] shippedDate) {
		this.shippedDate = shippedDate;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Shipper getShipper() {
		return this.shipper;
	}

	public void setShipper(Shipper shipper) {
		this.shipper = shipper;
	}

	public Suburb getSuburb() {
		return this.suburb;
	}

	public void setSuburb(Suburb suburb) {
		this.suburb = suburb;
	}

	public List<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public OrderItem addOrderItem(OrderItem orderItem) {
		getOrderItems().add(orderItem);
		orderItem.setOrder(this);

		return orderItem;
	}

	public OrderItem removeOrderItem(OrderItem orderItem) {
		getOrderItems().remove(orderItem);
		orderItem.setOrder(null);

		return orderItem;
	}

}