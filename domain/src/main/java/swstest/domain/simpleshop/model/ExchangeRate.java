package swstest.domain.simpleshop.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the EXCHANGE_RATES database table.
 * 
 */
@XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop")
@Entity
@Table(name="EXCHANGE_RATES")
@NamedQuery(name="ExchangeRate.findAll", query="SELECT e FROM ExchangeRate e")
public class ExchangeRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="FROM_SYMBOL")
	private String fromSymbol;

	private BigDecimal rate;

	@Column(name="RECORD_DATE")
	private Date recordDate;

	@Column(name="TO_SYMBOL")
	private String toSymbol;

	public ExchangeRate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromSymbol() {
		return this.fromSymbol;
	}

	public void setFromSymbol(String fromSymbol) {
		this.fromSymbol = fromSymbol;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public Date getRecordDate() {
		return this.recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public String getToSymbol() {
		return this.toSymbol;
	}

	public void setToSymbol(String toSymbol) {
		this.toSymbol = toSymbol;
	}

}