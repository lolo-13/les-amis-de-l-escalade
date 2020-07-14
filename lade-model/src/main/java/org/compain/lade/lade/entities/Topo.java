package org.compain.lade.lade.entities;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "topo",
uniqueConstraints = { @UniqueConstraint(columnNames = { "id_topo" }) })

public class Topo {
	
	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "id_topo" )
	private int idTopo; 
	
	@Column( name = "name", nullable=false  )
	private String name;
	
	@Column( name = "available", nullable=false  )
	private boolean available;
	
	@Column( name = "description", nullable=false  )
	private String description;
	
	@Column( name = "publication_date", nullable=false  )
	private Date publicationDate;
	
	@OneToMany
	private List<ReservationInquiry> reservationInquiries = new ArrayList<>();
	
	@OneToMany
	private List<Comment> comments;
	
	// getter and setter
	
	public int getIdTopo() {
		return idTopo;
	}
	public void setIdTopo(int idTopo) {
		this.idTopo = idTopo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public List<ReservationInquiry> getReservationInquiries() {
		return reservationInquiries;
	}
	public void setReservationInquiries(List<ReservationInquiry> reservationInquiries) {
		this.reservationInquiries = reservationInquiries;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
