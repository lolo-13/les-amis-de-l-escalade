package org.compain.lade.lade.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "spot",
uniqueConstraints = { @UniqueConstraint(columnNames = { "id_spot" }) })

public class Spot {
	
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "id_spot" ) 
	private int idSpot;    
	
	@Column( name = "name", nullable=false  )
	private String name;
	
	@OneToOne
	private Address address;
	
	@Column( name = "tag" )
	private boolean tag;
	
	@OneToMany
	private List<Path> paths;
	
	// getter and setter	

	public int getIdSpot() {
		return idSpot;
	}
	public void setIdSpot(int idSpot) {
		this.idSpot = idSpot;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public boolean isTag() {
		return tag;
	}
	public void setTag(boolean tag) {
		this.tag = tag;
	}
	public List<Path> getPaths() {
		return paths;
	}
	public void setPaths(List<Path> paths) {
		this.paths = paths;
	}

}
