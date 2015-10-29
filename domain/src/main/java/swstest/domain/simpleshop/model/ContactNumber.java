package swstest.domain.simpleshop.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;


/**
 * The persistent class for the CONTACT_NUMBERS database table.
 * 
 */
@XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop")
@Entity
@Table(name="CONTACT_NUMBERS")
@NamedQuery(name="ContactNumber.findAll", query="SELECT c FROM ContactNumber c")
public class ContactNumber implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ContactNumberPK id;

	@Column(name="CONTACT_NUMBER")
	private String contactNumber;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	private Contact contact;

	public ContactNumber() {
	}

	public ContactNumberPK getId() {
		return this.id;
	}

	public void setId(ContactNumberPK id) {
		this.id = id;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}