package com.in.docstore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DOC_STORE")
public class DocStore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;
	private String docName;
	private String docType;
	private String docSize;
	public DocStore() {

	}
	public DocStore(String docName, String docType, String docSize) {
		this.docName = docName;
		this.docType = docType;
		this.docSize = docSize;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getDocSize() {
		return docSize;
	}
	public void setDocSize(String docSize) {
		this.docSize = docSize;
	}
	@Override
	public String toString() {
		return "Store [id=" + id + ", docName=" + docName + ", docType=" + docType + ", docSize=" + docSize + "]";
	}
}
