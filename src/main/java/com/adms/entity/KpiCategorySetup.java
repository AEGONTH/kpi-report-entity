package com.adms.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.adms.common.domain.BaseAuditDomain;

@Entity
@Table(name="KPI_CATEGORY_SETUP")
public class KpiCategorySetup extends BaseAuditDomain {

	private static final long serialVersionUID = 1970933367109717410L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="TSR_LEVEL")
	private String tsrLevel;
	
	@ManyToOne
	@JoinColumn(name="CAMPAIGN_CODE", referencedColumnName="CAMPAIGN_CODE", nullable=true)
	private Campaign campaign;
	
	@Column(name="LIST_LOT_CODE")
	private String listLotCode;
	
	@ManyToOne
	@JoinColumn(name="TSR_CODE", referencedColumnName="TSR_CODE")
	private Tsr tsr;
	
	@Column(name="CATEGORY")
	private String category;
	
	@Column(name="TARGET")
	private BigDecimal target;
	
	@Column(name="WEIGHT")
	private BigDecimal weight;
	
	@Column(name="EFFECTIVE_DATE")
	@Temporal(TemporalType.DATE)
	private Date effectiveDate;

	@Column(name="END_DATE")
	@Temporal(TemporalType.DATE)
	private Date endDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTsrLevel() {
		return tsrLevel;
	}

	public void setTsrLevel(String tsrLevel) {
		this.tsrLevel = tsrLevel;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public String getListLotCode() {
		return listLotCode;
	}

	public void setListLotCode(String listLotCode) {
		this.listLotCode = listLotCode;
	}

	public Tsr getTsr() {
		return tsr;
	}

	public void setTsr(Tsr tsr) {
		this.tsr = tsr;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getTarget() {
		return target;
	}

	public void setTarget(BigDecimal target) {
		this.target = target;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
