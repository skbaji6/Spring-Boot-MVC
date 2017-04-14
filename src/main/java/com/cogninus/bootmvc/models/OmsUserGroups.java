package com.cogninus.bootmvc.models;

// Generated Apr 1, 2017 1:20:47 AM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OmsUserGroups generated by hbm2java
 */
@Entity
@Table(name = "OMS_USER_GROUPS")
public class OmsUserGroups implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6596044497808045364L;
	private BigDecimal grpId;
	private String grpName;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date modifiedDate;
	private String adminEmail;

	public OmsUserGroups() {
	}

	public OmsUserGroups(BigDecimal grpId, String grpName) {
		this.grpId = grpId;
		this.grpName = grpName;
	}

	public OmsUserGroups(BigDecimal grpId, String grpName, String createdBy,
			Date createdDate, String modifiedBy, Date modifiedDate,
			String adminEmail) {
		this.grpId = grpId;
		this.grpName = grpName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.adminEmail = adminEmail;
	}

	@Id
	@Column(name = "GRP_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getGrpId() {
		return this.grpId;
	}

	public void setGrpId(BigDecimal grpId) {
		this.grpId = grpId;
	}

	@Column(name = "GRP_NAME", nullable = false, length = 150)
	public String getGrpName() {
		return this.grpName;
	}

	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}

	@Column(name = "CREATED_BY", length = 20)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE", length = 7)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "MODIFIED_BY", length = 20)
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFIED_DATE", length = 7)
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Column(name = "ADMIN_EMAIL", length = 150)
	public String getAdminEmail() {
		return this.adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

}