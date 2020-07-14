package org.compain.lade.lade.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "address",
uniqueConstraints = { @UniqueConstraint(columnNames = { "id_address" }) })

public class Address {	
	
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "id_address" )
	private int idAddress;
    
    @Column( name = "street_number" )
	private String streetNumber;
    
	@Column( name = "street_name", nullable=false )
	private String streetName;
	
	@Column( name = "post_code", nullable=false  )
	private String postCode;
	
	@Column( name = "city", nullable=false  )
	private String city;
	
	@Column( name = "country", nullable=false  )
	private String country;
	
	// getter and setter
	
	public int getIdAddress() {
		return idAddress;
	}
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}	
  	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}	
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
