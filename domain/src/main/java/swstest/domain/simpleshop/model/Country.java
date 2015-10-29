package swstest.domain.simpleshop.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * The persistent class for the COUNTRIES database table.
 * 
 */
@Entity
@Table(name="COUNTRIES")
@XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop")
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COUNTRY_CODE")
	private String countryCode;

	@Column(name="CURRENCY_SYMBOL")
	private String currencySymbol;

	private String name;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="country")
	private List<Order> orders;

	//bi-directional many-to-one association to Suburb
	@OneToMany(mappedBy="country")
	private List<Suburb> suburbs;

	public Country() {
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCurrencySymbol() {
		return this.currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) {
		this.currencySymbol = currencySymbol;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setCountry(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setCountry(null);

		return order;
	}

	public List<Suburb> getSuburbs() {
		return this.suburbs;
	}

	public void setSuburbs(List<Suburb> suburbs) {
		this.suburbs = suburbs;
	}

	public Suburb addSuburb(Suburb suburb) {
		getSuburbs().add(suburb);
		suburb.setCountry(this);

		return suburb;
	}

	public Suburb removeSuburb(Suburb suburb) {
		getSuburbs().remove(suburb);
		suburb.setCountry(null);

		return suburb;
	}

}