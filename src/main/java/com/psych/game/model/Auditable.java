package com.psych.game.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@JsonIgnoreProperties(value = {"createdAt","updatedAt"}, allowGetters=true)
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;	
	
	@Column(nullable=false, updatable=false)
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Getter @Setter
	private Date createdAt = new Date();
	
	@Column(nullable=false, updatable=false)
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Getter @Setter	
	private Date updatedAt = new Date();

}
