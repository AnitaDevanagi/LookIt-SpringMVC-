package com.anita.LookIt.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customerdetails")
public class CustomerDetails {
	@Id
	@Column(name="id")
    private int id;
	@Column(name="email")
	private  String email;
	@Column(name="issue")
	private String issue;
	@Column(name="createdate")
	private String createdate;
	@Column(name="modificationdate")
	private String modificationdate;
	@Column(name="status")
	private String status;
	@Column(name=" asignee")
	private String asignee;
	@Column(name="model")
	private String model;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getModificationdate() {
		return modificationdate;
	}
	public void setModificationdate(String modificationdate) {
		this.modificationdate = modificationdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAsignee() {
		return asignee;
	}
	public void setAsignee(String asignee) {
		this.asignee = asignee;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", email=" + email + ", issue=" + issue + ", createdate=" + createdate
				+ ", modificationdate=" + modificationdate + ", status=" + status + ", asignee=" + asignee + ", model="
				+ model + "]";
	}
	

}
