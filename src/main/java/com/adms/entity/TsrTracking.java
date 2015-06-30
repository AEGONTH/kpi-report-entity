package com.adms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.adms.common.domain.BaseAuditDomain;

@Entity
@Table(name="TSR_TRACKING")
public class TsrTracking extends BaseAuditDomain {

	private static final long serialVersionUID = -2777394155795365757L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="TRACKING_DATE")
	@Temporal(TemporalType.DATE)
	private Date trackingDate;
	
	@ManyToOne
	@JoinColumn(name="LIST_LOT_CODE", referencedColumnName="LIST_LOT_CODE")
	private ListLot listLot;
	
	@ManyToOne
	@JoinColumn(name="TSR_CODE", referencedColumnName="TSR_CODE")
	private Tsr tsr;
	
	@Column(name="TSR_NAME")
	private String tsrName;
	
	@Column(name="WORK_DAYS")
	private Integer workDays;
	
	@Column(name="LIST_USED")
	private Integer listUsed;
	
	@Column(name="COMPLETE")
	private Integer complete;
	
	@Column(name="REMAINING_NEW")
	private Integer remainingNew;
	
	@Column(name="REMAINING_CALL_BACK")
	private Integer remainingCallBack;
	
	@Column(name="REMAINING_NO_CONTACT")
	private Integer remainingNoContact;
	
	@Column(name="REMAINING_FOLLOW_UP")
	private Integer remainingFollowUp;
	
	@Column(name="NEW_USED")
	private Integer newUsed;
	
	@Column(name="FOLLOW_USED")
	private Integer followUsed;
	
	@Column(name="CALL_BACK_USED")
	private Integer callBackUsed;
	
	@Column(name="NO_CONTACT_USED")
	private Integer noContactUsed;
	
	@Column(name="FIRST_POLICY")
	private Integer firstPolicy;
	
	@Column(name="FOLLOW_POLICY")
	private Integer followPolicy;
	
	@Column(name="PLAN_STANDARD")
	private Integer planStandard;
	
	@Column(name="PLAN_PREMIER")
	private Integer planPremier;
	
	@Column(name="TOTAL_POLICY")
	private Integer totalPolicy;
	
	@Column(name="POLICY_API")
	private Double policyApi;
	
	@Column(name="DMC_PRESENT")
	private Integer dmcPresent;
	
	@Column(name="DMC_NO_PRESENT")
	private Integer dmcNoPresent;
	
	@Column(name="DMC_CONTACT_RATE")
	private Double dmcContactRate;
	
	@Column(name="CPH")
	private Double cph;
	
	@Column(name="SPH")
	private Double sph;
	
	@Column(name="SPC_TOTAL")
	private Double spcTotal;
	
	@Column(name="SPC_PRESENT")
	private Double spcPresent;
	
	@Column(name="WORK_HOURS")
	private Double workHours;
	
	@Column(name="DMC_AVG_TALK_TIME")
	private Double dmcAvgTalkTime;
	
	@Column(name="MAX_TALK_TIME")
	private Double maxTalkTime;
	
	@Column(name="DMC_TALK_TIME")
	private Double dmcTalkTime;
	
	@Column(name="TOTAL_TALK_TIME")
	private Double totalTalkTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getTrackingDate() {
		return trackingDate;
	}

	public void setTrackingDate(Date trackingDate) {
		this.trackingDate = trackingDate;
	}

	public ListLot getListLot() {
		return listLot;
	}

	public void setListLot(ListLot listLot) {
		this.listLot = listLot;
	}

	public Tsr getTsr() {
		return tsr;
	}

	public void setTsr(Tsr tsr) {
		this.tsr = tsr;
	}

	public String getTsrName() {
		return tsrName;
	}

	public void setTsrName(String tsrName) {
		this.tsrName = tsrName;
	}

	public Integer getWorkDays() {
		return workDays;
	}

	public void setWorkDays(Integer workDays) {
		this.workDays = workDays;
	}

	public Integer getListUsed() {
		return listUsed;
	}

	public void setListUsed(Integer listUsed) {
		this.listUsed = listUsed;
	}

	public Integer getComplete() {
		return complete;
	}

	public void setComplete(Integer complete) {
		this.complete = complete;
	}

	public Integer getRemainingNew() {
		return remainingNew;
	}

	public void setRemainingNew(Integer remainingNew) {
		this.remainingNew = remainingNew;
	}

	public Integer getRemainingCallBack() {
		return remainingCallBack;
	}

	public void setRemainingCallBack(Integer remainingCallBack) {
		this.remainingCallBack = remainingCallBack;
	}

	public Integer getRemainingNoContact() {
		return remainingNoContact;
	}

	public void setRemainingNoContact(Integer remainingNoContact) {
		this.remainingNoContact = remainingNoContact;
	}

	public Integer getRemainingFollowUp() {
		return remainingFollowUp;
	}

	public void setRemainingFollowUp(Integer remainingFollowUp) {
		this.remainingFollowUp = remainingFollowUp;
	}

	public Integer getNewUsed() {
		return newUsed;
	}

	public void setNewUsed(Integer newUsed) {
		this.newUsed = newUsed;
	}

	public Integer getFollowUsed() {
		return followUsed;
	}

	public void setFollowUsed(Integer followUsed) {
		this.followUsed = followUsed;
	}

	public Integer getCallBackUsed() {
		return callBackUsed;
	}

	public void setCallBackUsed(Integer callBackUsed) {
		this.callBackUsed = callBackUsed;
	}

	public Integer getNoContactUsed() {
		return noContactUsed;
	}

	public void setNoContactUsed(Integer noContactUsed) {
		this.noContactUsed = noContactUsed;
	}

	public Integer getFirstPolicy() {
		return firstPolicy;
	}

	public void setFirstPolicy(Integer firstPolicy) {
		this.firstPolicy = firstPolicy;
	}

	public Integer getFollowPolicy() {
		return followPolicy;
	}

	public void setFollowPolicy(Integer followPolicy) {
		this.followPolicy = followPolicy;
	}

	public Integer getPlanStandard() {
		return planStandard;
	}

	public void setPlanStandard(Integer planStandard) {
		this.planStandard = planStandard;
	}

	public Integer getPlanPremier() {
		return planPremier;
	}

	public void setPlanPremier(Integer planPremier) {
		this.planPremier = planPremier;
	}

	public Double getPolicyApi() {
		return policyApi;
	}

	public void setPolicyApi(Double policyApi) {
		this.policyApi = policyApi;
	}

	public Integer getDmcPresent() {
		return dmcPresent;
	}

	public void setDmcPresent(Integer dmcPresent) {
		this.dmcPresent = dmcPresent;
	}

	public Integer getDmcNoPresent() {
		return dmcNoPresent;
	}

	public void setDmcNoPresent(Integer dmcNoPresent) {
		this.dmcNoPresent = dmcNoPresent;
	}

	public Double getDmcContactRate() {
		return dmcContactRate;
	}

	public void setDmcContactRate(Double dmcContactRate) {
		this.dmcContactRate = dmcContactRate;
	}

	public Double getCph() {
		return cph;
	}

	public void setCph(Double cph) {
		this.cph = cph;
	}

	public Double getSph() {
		return sph;
	}

	public void setSph(Double sph) {
		this.sph = sph;
	}

	public Double getSpcTotal() {
		return spcTotal;
	}

	public void setSpcTotal(Double spcTotal) {
		this.spcTotal = spcTotal;
	}

	public Double getSpcPresent() {
		return spcPresent;
	}

	public void setSpcPresent(Double spcPresent) {
		this.spcPresent = spcPresent;
	}

	public Double getWorkHours() {
		return workHours;
	}

	public void setWorkHours(Double workHours) {
		this.workHours = workHours;
	}

	public Double getDmcAvgTalkTime() {
		return dmcAvgTalkTime;
	}

	public void setDmcAvgTalkTime(Double dmcAvgTalkTime) {
		this.dmcAvgTalkTime = dmcAvgTalkTime;
	}

	public Double getMaxTalkTime() {
		return maxTalkTime;
	}

	public void setMaxTalkTime(Double maxTalkTime) {
		this.maxTalkTime = maxTalkTime;
	}

	public Double getDmcTalkTime() {
		return dmcTalkTime;
	}

	public void setDmcTalkTime(Double dmcTalkTime) {
		this.dmcTalkTime = dmcTalkTime;
	}

	public Double getTotalTalkTime() {
		return totalTalkTime;
	}

	public void setTotalTalkTime(Double totalTalkTime) {
		this.totalTalkTime = totalTalkTime;
	}

	public Integer getTotalPolicy() {
		return totalPolicy;
	}

	public void setTotalPolicy(Integer totalPolicy) {
		this.totalPolicy = totalPolicy;
	}
	
}
