package com.adms.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.adms.common.domain.BaseAuditDomain;

@Entity
@Table(name="KPI_RESULT")
public class KpiResult extends BaseAuditDomain {

	private static final long serialVersionUID = 3317766257739147106L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="YEAR_MONTH")
	private String yearMonth;
	
	@ManyToOne
	@JoinColumn(name="CAMPAIGN_CODE", referencedColumnName="CAMPAIGN_CODE")
	private Campaign campaign;
	
	@Column(name="LIST_LOT_CODE")
	private String listLotCode;
	
	@ManyToOne
	@JoinColumn(name="DSM_CODE", referencedColumnName="TSR_CODE")
	private Tsr dsm;

	@ManyToOne
	@JoinColumn(name="SUP_CODE", referencedColumnName="TSR_CODE")
	private Tsr tsm;

	@ManyToOne
	@JoinColumn(name="TSR_CODE", referencedColumnName="TSR_CODE")
	private Tsr tsr;

	@Column(name="TOTAL_AFYP")
	private BigDecimal totalAfyp;
	
	@Column(name="ATTENDANCE")
	private Integer attendance;
	
	@Column(name="TOTAL_TALK_HRS")
	private BigDecimal totalTalkHrs;

	@Column(name="FIRST_CONFIRM_SALE")
	private Integer firstConfirmSale;

	@Column(name="ALL_SALE")
	private Integer allSale;

	@Column(name="SUCCESS_POLICY")
	private Integer successPolicy;

	@Column(name="TOTAL_USED")
	private Integer totalUsed;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getYearMonth() {
		return yearMonth;
	}

	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
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

	public Tsr getDsm() {
		return dsm;
	}

	public void setDsm(Tsr dsm) {
		this.dsm = dsm;
	}

	public Tsr getTsm() {
		return tsm;
	}

	public void setTsm(Tsr tsm) {
		this.tsm = tsm;
	}

	public Tsr getTsr() {
		return tsr;
	}

	public void setTsr(Tsr tsr) {
		this.tsr = tsr;
	}

	public BigDecimal getTotalAfyp() {
		return totalAfyp;
	}

	public void setTotalAfyp(BigDecimal totalAfyp) {
		this.totalAfyp = totalAfyp;
	}

	public Integer getAttendance() {
		return attendance;
	}

	public void setAttendance(Integer attendance) {
		this.attendance = attendance;
	}

	public BigDecimal getTotalTalkHrs() {
		return totalTalkHrs;
	}

	public void setTotalTalkHrs(BigDecimal totalTalkHrs) {
		this.totalTalkHrs = totalTalkHrs;
	}

	public Integer getFirstConfirmSale() {
		return firstConfirmSale;
	}

	public void setFirstConfirmSale(Integer firstConfirmSale) {
		this.firstConfirmSale = firstConfirmSale;
	}

	public Integer getAllSale() {
		return allSale;
	}

	public void setAllSale(Integer allSale) {
		this.allSale = allSale;
	}

	public Integer getSuccessPolicy() {
		return successPolicy;
	}

	public void setSuccessPolicy(Integer successPolicy) {
		this.successPolicy = successPolicy;
	}

	public Integer getTotalUsed() {
		return totalUsed;
	}

	public void setTotalUsed(Integer totalUsed) {
		this.totalUsed = totalUsed;
	}

}
