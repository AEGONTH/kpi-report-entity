package com.adms.entity.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQueries({
	@NamedNativeQuery(
			name="execKpiRetentionByMonth"
			, query="exec KPI_RETENTION_BY_MONTH ? "
			, resultClass=KpiRetention.class)
})
public class KpiRetention implements Serializable {
	
	private static final long serialVersionUID = 7333259809518674160L;

	@Id
	@Column(name="ID")
	private Long id;
	
	@Column(name="DSM_CODE")
	private String dsmCode;
	
	@Column(name="SUP_CODE")
	private String supCode;
	
	@Column(name="BEGIN_MONTH")
	private Integer beginMonth;
	
	@Column(name="DURING_MONTH")
	private Integer duringMonth;
	
	@Column(name="END_MONTH")
	private Integer endMonth;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Integer getBeginMonth() {
		return beginMonth;
	}

	public void setBeginMonth(Integer beginMonth) {
		this.beginMonth = beginMonth;
	}

	public Integer getDuringMonth() {
		return duringMonth;
	}

	public void setDuringMonth(Integer duringMonth) {
		this.duringMonth = duringMonth;
	}

	public Integer getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(Integer endMonth) {
		this.endMonth = endMonth;
	}

}
