package com.adms.entity;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.adms.common.domain.BaseAuditDomain;

@Entity
@Table(name = "TSR")
@Cacheable
@NamedNativeQueries({ @NamedNativeQuery(name = "findTsrByFullName", query = "select tsr.* from TSR tsr where replace(replace(tsr.FULL_NAME, ' ', ''), ' ', '') like '%' + replace(?, ' ', '') order by tsr.EFFECTIVE_DATE desc", resultClass = Tsr.class) })
/* and (? <= RESIGN_DATE or RESIGN_DATE is null)*/
public class Tsr extends BaseAuditDomain {

	private static final long serialVersionUID = -2093244227618224195L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private Long id;

	@Column(name = "TSR_CODE")
	private String tsrCode;

	@ManyToOne
	@JoinColumn(name = "TSR_POSITION", referencedColumnName = "POSITION_CODE")
	private TsrPosition tsrPosition;

	@ManyToOne
	@JoinColumn(name = "TSR_STATUS", referencedColumnName = "STATUS_CODE")
	private TsrStatus tsrStatus;

	@Column(name = "EMPLOYEE_CODE")
	private String employeeCode;

	@Column(name = "FULL_NAME")
	private String fullName;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MID_NAME")
	private String midName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EFFECTIVE_DATE")
	@Temporal(TemporalType.DATE)
	private Date effectiveDate;

	@Column(name = "RESIGN_DATE")
	@Temporal(TemporalType.DATE)
	private Date resignDate;
	
	@Column(name="FLOOR_DATE")
	@Temporal(TemporalType.DATE)
	private Date floorDate;

	@Column(name = "REMARK")
	private String remark;
	
	public Tsr() {
		
	}
	
	public Tsr(String tsrCode) {
		this.tsrCode = tsrCode;
	}

	public Long getId()
	{
		return id;
	}

	public Tsr setId(Long id)
	{
		this.id = id;
		return this;
	}

	public String getTsrCode()
	{
		return tsrCode;
	}

	public Tsr setTsrCode(String tsrCode)
	{
		this.tsrCode = tsrCode;
		return this;
	}

	public TsrPosition getTsrPosition()
	{
		return tsrPosition;
	}

	public Tsr setTsrPosition(TsrPosition tsrPosition)
	{
		this.tsrPosition = tsrPosition;
		return this;
	}

	public TsrStatus getTsrStatus()
	{
		return tsrStatus;
	}

	public Tsr setTsrStatus(TsrStatus tsrStatus)
	{
		this.tsrStatus = tsrStatus;
		return this;
	}

	public String getEmployeeCode()
	{
		return employeeCode;
	}

	public Tsr setEmployeeCode(String employeeCode)
	{
		this.employeeCode = employeeCode;
		return this;
	}

	public String getFullName()
	{
		return fullName;
	}

	public Tsr setFullName(String fullName)
	{
		this.fullName = fullName;
		return this;
	}

	public String getTitle()
	{
		return title;
	}

	public Tsr setTitle(String title)
	{
		this.title = title;
		return this;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public Tsr setFirstName(String firstName)
	{
		this.firstName = firstName;
		return this;
	}

	public String getMidName()
	{
		return midName;
	}

	public Tsr setMidName(String midName)
	{
		this.midName = midName;
		return this;
	}

	public String getLastName()
	{
		return lastName;
	}

	public Tsr setLastName(String lastName)
	{
		this.lastName = lastName;
		return this;
	}

	public Date getEffectiveDate()
	{
		return effectiveDate;
	}

	public Tsr setEffectiveDate(Date effectiveDate)
	{
		this.effectiveDate = effectiveDate;
		return this;
	}

	public Date getResignDate()
	{
		return resignDate;
	}

	public Tsr setResignDate(Date resignDate)
	{
		this.resignDate = resignDate;
		return this;
	}

	public String getRemark()
	{
		return remark;
	}

	public Tsr setRemark(String remark)
	{
		this.remark = remark;
		return this;
	}

	@Override
	public String toString()
	{
		return "Tsr [id=" + id + ", tsrCode=" + tsrCode + ", tsrPosition=" + tsrPosition + ", tsrStatus=" + tsrStatus + ", employeeCode=" + employeeCode + ", fullName=" + fullName + ", title=" + title + ", firstName=" + firstName + ", midName=" + midName + ", lastName=" + lastName
				+ ", effectiveDate=" + effectiveDate + ", resignDate=" + resignDate + ", remark=" + remark + "]";
	}

	public Date getFloorDate() {
		return floorDate;
	}

	public Tsr setFloorDate(Date floorDate) {
		this.floorDate = floorDate;
		return this;
	}

}
