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
@Table(name = "comment",
uniqueConstraints = { @UniqueConstraint(columnNames = { "id_comment" }) })

public class Comment {
	
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "id_comment" )
	private long idComment;
    
    @Column( name = "comment", nullable=false  )
	private String comment;
    
    @Column( name = "publiction_date", nullable=false  )
	private Date publicationDate;
	
	
	public long getIdComment() {
		return idComment;
	}
	public void setIdComment(long idComment) {
		this.idComment = idComment;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

}
