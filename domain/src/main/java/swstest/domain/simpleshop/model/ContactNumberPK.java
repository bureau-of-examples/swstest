package swstest.domain.simpleshop.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;

/**
 * The primary key class for the CONTACT_NUMBERS database table.
 * 
 */
@XmlType(namespace = "https://github.com/zhy2002/swstest/simpleshop")
@Embeddable
public class ContactNumberPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CONTACT_ID", insertable=false, updatable=false)
	private int contactId;

	@Column(name="CONTACT_TYPE")
	private String contactType;

	public ContactNumberPK() {
	}
	public int getContactId() {
		return this.contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactType() {
		return this.contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ContactNumberPK)) {
			return false;
		}
		ContactNumberPK castOther = (ContactNumberPK)other;
		return 
			(this.contactId == castOther.contactId)
			&& this.contactType.equals(castOther.contactType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.contactId;
		hash = hash * prime + this.contactType.hashCode();
		
		return hash;
	}
}