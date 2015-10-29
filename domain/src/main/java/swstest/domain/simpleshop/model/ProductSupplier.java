package swstest.domain.simpleshop.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * The persistent class for the PRODUCT_SUPPLIERS database table.
 * 
 */
@XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop")
@Entity
@Table(name="PRODUCT_SUPPLIERS")
@NamedQuery(name="ProductSupplier.findAll", query="SELECT p FROM ProductSupplier p")
public class ProductSupplier implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProductSupplierPK id;

	private String note;

	@Column(name="OUT_OF_STOCK_DATE")
	private byte[] outOfStockDate;

	@Column(name="SELL_PRICE")
	private BigDecimal sellPrice;

	@Column(name="UNIT_PRICE_DATE")
	private byte[] unitPriceDate;

	private String url;

	//bi-directional many-to-one association to Product
	@ManyToOne
	private Product product;

	//bi-directional many-to-one association to Supplier
	@ManyToOne
	private Supplier supplier;

	public ProductSupplier() {
	}

	public ProductSupplierPK getId() {
		return this.id;
	}

	public void setId(ProductSupplierPK id) {
		this.id = id;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public byte[] getOutOfStockDate() {
		return this.outOfStockDate;
	}

	public void setOutOfStockDate(byte[] outOfStockDate) {
		this.outOfStockDate = outOfStockDate;
	}

	public BigDecimal getSellPrice() {
		return this.sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public byte[] getUnitPriceDate() {
		return this.unitPriceDate;
	}

	public void setUnitPriceDate(byte[] unitPriceDate) {
		this.unitPriceDate = unitPriceDate;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}