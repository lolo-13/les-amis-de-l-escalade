package org.compain.lade.lade.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "reservation_inquiry",
uniqueConstraints = { @UniqueConstraint(columnNames = { "id_inquiry" }) })

public class ReservationInquiry {
	
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "id_inquiry" )
	private long idInquiry;
    
    @Column( name = "statut", nullable=false  )    
	private String statut;
    
    @Column( name = "lend_date", nullable=false  )
	private Date lendDate;
	
	// getter and setter
    
	public long getIdInquiry() {
		return idInquiry;
	}
	public void setIdInquiry(long idInquiry) {
		this.idInquiry = idInquiry;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public Date getLendDate() {
		return lendDate;
	}
	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}

}
