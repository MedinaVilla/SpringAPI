package com.microservice.training.countriesdemo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "countries")
@EntityListeners(AuditingEntityListener.class)
@Data

@AllArgsConstructor
@NoArgsConstructor
public class CountryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id")
	Integer countryId;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "capital")
	String capital;
	
	@Column(name = "continent")
	String continent;
	
}
