package com.cogninus.bootmvc.models;

// Generated Apr 1, 2017 1:20:47 AM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OmsIdAttributes generated by hbm2java
 */
@Entity
@Table(name = "OMS_ID_ATTRIBUTES")
public class OmsIdAttributes implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1562652292253220087L;
	private OmsIdAttributesId id;
	private String name;
	private String isactive;
	private String createUser;
	private Date createDate;
	private String updateUser;
	private Date updateDate;

	public OmsIdAttributes() {
	}

	public OmsIdAttributes(OmsIdAttributesId id, String name, String isactive) {
		this.id = id;
		this.name = name;
		this.isactive = isactive;
	}

	public OmsIdAttributes(OmsIdAttributesId id, String name, String isactive,
			String createUser, Date createDate, String updateUser,
			Date updateDate) {
		this.id = id;
		this.name = name;
		this.isactive = isactive;
		this.createUser = createUser;
		this.createDate = createDate;
		this.updateUser = updateUser;
		this.updateDate = updateDate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "code", column = @Column(name = "CODE", nullable = false, length = 3)),
			@AttributeOverride(name = "category", column = @Column(name = "CATEGORY", nullable = false, length = 20)) })
	public OmsIdAttributesId getId() {
		return this.id;
	}

	public void setId(OmsIdAttributesId id) {
		this.id = id;
	}

	@Column(name = "NAME", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "ISACTIVE", nullable = false, length = 1)
	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Column(name = "CREATE_USER", length = 10)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATE_DATE", length = 7)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "UPDATE_USER", length = 10)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATE_DATE", length = 7)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
