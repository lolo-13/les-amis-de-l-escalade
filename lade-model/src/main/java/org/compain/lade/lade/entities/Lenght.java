package org.compain.lade.lade.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "lenght",
uniqueConstraints = { @UniqueConstraint(columnNames = { "id_lenght" }) })


public class Lenght {	
	
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "id_lenght" )
	private long idLenght;
	
	@Column( name = "name" )
	private String Name;
	
	@Column( name = "height" )
	private float height;
	
	@Column( name = "cotation" )
	private String cotation;
	
	// getter and setter
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public String getCotation() {
		return cotation;
	}
	public void setCotation(String cotation) {
		this.cotation = cotation;
	}	
	public long getIdLenght() {
		return idLenght;
	}
	public void setIdLenght(long idLenght) {
		this.idLenght = idLenght;
	}
}
