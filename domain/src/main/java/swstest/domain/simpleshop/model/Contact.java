package swstest.domain.simpleshop.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * The persistent class for the CONTACTS database table.
 * 
 */
@XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop")
@Entity
@Table(name="CONTACTS")
@NamedQuery(name="Contact.findAll", query="SELECT c FROM Contact c")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="ADDRESS_LINE1")
	private String addressLine1;

	@Column(name="ADDRESS_LINE2")
	private String addressLine2;

	@Column(name="CONTACT_NAME")
	private String contactName;

	private String name;

	private String note;

	//bi-directional many-to-one association to Suburb
	@ManyToOne
	private Suburb suburb;

	//bi-directional many-to-one association to ContactNumber
	@OneToMany(mappedBy="contact")
	private List<ContactNumber> contactNumbers;

	//bi-directional many-to-one association to Customer
	@OneToMany(mappedBy="contact")
	private List<Customer> customers;

	//bi-directional many-to-one association to Employee
	@OneToMany(mappedBy="contact")
	private List<Employee> employees;

	//bi-directional many-to-one association to Shipper
	@OneToMany(mappedBy="contact")
	private List<Shipper> shippers;

	//bi-directional many-to-one association to Supplier
	@OneToMany(mappedBy="contact")
	private List<Supplier> suppliers;

	public Contact() {
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

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Suburb getSuburb() {
		return this.suburb;
	}

	public void setSuburb(Suburb suburb) {
		this.suburb = suburb;
	}

	public List<ContactNumber> getContactNumbers() {
		return this.contactNumbers;
	}

	public void setContactNumbers(List<ContactNumber> contactNumbers) {
		this.contactNumbers = contactNumbers;
	}

	public ContactNumber addContactNumber(ContactNumber contactNumber) {
		getContactNumbers().add(contactNumber);
		contactNumber.setContact(this);

		return contactNumber;
	}

	public ContactNumber removeContactNumber(ContactNumber contactNumber) {
		getContactNumbers().remove(contactNumber);
		contactNumber.setContact(null);

		return contactNumber;
	}

	public List<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer addCustomer(Customer customer) {
		getCustomers().add(customer);
		customer.setContact(this);

		return customer;
	}

	public Customer removeCustomer(Customer customer) {
		getCustomers().remove(customer);
		customer.setContact(null);

		return customer;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setContact(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setContact(null);

		return employee;
	}

	public List<Shipper> getShippers() {
		return this.shippers;
	}

	public void setShippers(List<Shipper> shippers) {
		this.shippers = shippers;
	}

	public Shipper addShipper(Shipper shipper) {
		getShippers().add(shipper);
		shipper.setContact(this);

		return shipper;
	}

	public Shipper removeShipper(Shipper shipper) {
		getShippers().remove(shipper);
		shipper.setContact(null);

		return shipper;
	}

	public List<Supplier> getSuppliers() {
		return this.suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public Supplier addSupplier(Supplier supplier) {
		getSuppliers().add(supplier);
		supplier.setContact(this);

		return supplier;
	}

	public Supplier removeSupplier(Supplier supplier) {
		getSuppliers().remove(supplier);
		supplier.setContact(null);

		return supplier;
	}

}