package com.in.docstore.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String custName;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date created; 
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date DOB;
	private String city;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn 
	private List<DocStore> docStore;

	public Customer() {

	}
	public Customer(String custName, Date created, Date dOB, String city, List<DocStore> docStore) {
		super();
		this.custName = custName;
		this.created = created;
		DOB = dOB;
		this.city = city;
		this.docStore = docStore;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public Date getCreated() {
		return created;
	}


	public void setCreated(Date created) {
		this.created = created;
	}


	public Date getDOB() {
		return DOB;
	}


	public void setDOB(Date dOB) {
		DOB = dOB;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public List<DocStore> getDocStore() {
		return docStore;
	}


	public void setDocStore(List<DocStore> docStore) {
		this.docStore = docStore;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", custName=" + custName + ", created=" + created + ", DOB=" + DOB + ", city="
				+ city + ", docStore=" + docStore + "]";
	}


}
