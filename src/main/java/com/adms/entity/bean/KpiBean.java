package com.adms.entity.bean;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQueries({
	@NamedNativeQuery(
			name = "getKpiBeanByDate"
			, query = " exec KPI_RESULT_BY_YEAR_MONTH ? "
			, resultClass = KpiBean.class)
})
public class KpiBean implements Serializable {

	private static final long serialVersionUID = -8245768151953969697L;

	@Id
	@Column(name="ID")
	private String id;
	
	@Column(name="CAMPAIGN_CODE")
	private String campaignCode;
	
	@Column(name="LIST_LOT_CODE")
	private String listLotCode;
	
	@Column(name="DSM_CODE")
	private String dsmCode;
	
	@Column(name="SUP_CODE")
	private String supCode;
	
	@Column(name="TSR_CODE")
	private String tsrCode;
	
	@Column(name="TOTAL_AFYP")
	private BigDecimal totalAfyp;
	
	@Column(name="ATTENDANCE")
	private Integer attendance;
	
	@Column(name="TOTAL_TALK_TIME")
	private BigDecimal totalTalkTime;
	
	@Column(name="FIRST_CONFIRM")
	private BigDecimal firstConfirm;
	
	@Column(name="TOTAL_APP")
	private BigDecimal totalApp;
	
	@Column(name="SUCCESS_POLICY")
	private Integer successPolicy;
	
	@Column(name="TOTAL_USED")
	private Integer totalUsed;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public String getListLotCode() {
		return listLotCode;
	}

	public void setListLotCode(String listLotCode) {
		this.listLotCode = listLotCode;
	}

	public String getDsmCode() {
		return dsmCode;
	}

	public void setDsmCode(String dsmCode) {
		this.dsmCode = dsmCode;
	}

	public String getSupCode() {
		return supCode;
	}

	public void setSupCode(String supCode) {
		this.supCode = supCode;
	}

	public String getTsrCode() {
		return tsrCode;
	}

	public void setTsrCode(String tsrCode) {
		this.tsrCode = tsrCode;
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

	public BigDecimal getTotalTalkTime() {
		return totalTalkTime;
	}

	public void setTotalTalkTime(BigDecimal totalTalkTime) {
		this.totalTalkTime = totalTalkTime;
	}

	public BigDecimal getFirstConfirm() {
		return firstConfirm;
	}

	public void setFirstConfirm(BigDecimal firstConfirm) {
		this.firstConfirm = firstConfirm;
	}

	public BigDecimal getTotalApp() {
		return totalApp;
	}

	public void setTotalApp(BigDecimal totalApp) {
		this.totalApp = totalApp;
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
