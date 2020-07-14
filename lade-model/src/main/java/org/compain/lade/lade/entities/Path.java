package org.compain.lade.lade.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "path", uniqueConstraints = { @UniqueConstraint(columnNames = { "id_path" }) })

public class Path {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_path")
	private long idPath;

	@Column(name = "name", nullable=false )
	private String name;

	@Column(name = "height", nullable=false )
	private float height;

	@Column(name = "cotation", nullable=false )
	private String cotation;

	@Column(name = "point_number", nullable=false )
	private int pointNumber;	

	@OneToMany
	@JoinColumn(name="id_lenght")
	private List<Lenght> lenghts;
	
	// getter and setter

	public long getIdPath() {
		return idPath;
	}

	public void setIdPath(long idPath) {
		this.idPath = idPath;
	}
	public List<Lenght> getLenghts() {
		return lenghts;
	}
	public void setLenghts(List<Lenght> lenghts) {
		this.lenghts = lenghts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getPointNumber() {
		return pointNumber;
	}
	public void setPointNumber(int pointNumber) {
		this.pointNumber = pointNumber;
	}

}
