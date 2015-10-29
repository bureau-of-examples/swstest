package swstest.domain.simpleshop.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * The persistent class for the PRODUCTS database table.
 * 
 */
@XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop")
@Entity
@Table(name="PRODUCTS")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	private String quantityperunit;

	private int stock;

	//bi-directional many-to-one association to OrderItem
	@OneToMany(mappedBy="product")
	private List<OrderItem> orderItems;

	//bi-directional many-to-many association to Category
	@ManyToMany
	@JoinTable(
		name="PRODUCT_CATEGORIES"
		, joinColumns={
			@JoinColumn(name="PRODUCT_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="CATEGORY_ID")
			}
		)
	private List<Category> categories;

	//bi-directional many-to-one association to ProductImage
    @ElementCollection
    @CollectionTable(name="PRODUCT_IMAGES", joinColumns=@JoinColumn(name="PRODUCT_ID"))
	private List<String> productImages;

	//bi-directional many-to-one association to ProductSupplier
	@OneToMany(mappedBy="product")
	private List<ProductSupplier> productSuppliers;

	public Product() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantityperunit() {
		return this.quantityperunit;
	}

	public void setQuantityperunit(String quantityperunit) {
		this.quantityperunit = quantityperunit;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public List<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public OrderItem addOrderItem(OrderItem orderItem) {
		getOrderItems().add(orderItem);
		orderItem.setProduct(this);

		return orderItem;
	}

	public OrderItem removeOrderItem(OrderItem orderItem) {
		getOrderItems().remove(orderItem);
		orderItem.setProduct(null);

		return orderItem;
	}

	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<String> getProductImages() {
		return this.productImages;
	}

	public void setProductImages(List<String> productImages) {
		this.productImages = productImages;
	}


	public List<ProductSupplier> getProductSuppliers() {
		return this.productSuppliers;
	}

	public void setProductSuppliers(List<ProductSupplier> productSuppliers) {
		this.productSuppliers = productSuppliers;
	}

	public ProductSupplier addProductSupplier(ProductSupplier productSupplier) {
		getProductSuppliers().add(productSupplier);
		productSupplier.setProduct(this);

		return productSupplier;
	}

	public ProductSupplier removeProductSupplier(ProductSupplier productSupplier) {
		getProductSuppliers().remove(productSupplier);
		productSupplier.setProduct(null);

		return productSupplier;
	}

}