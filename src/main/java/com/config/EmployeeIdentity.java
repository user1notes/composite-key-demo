package com.config;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.BatchSize;

@Embeddable
public class EmployeeIdentity implements Serializable{
	
	@NotNull
	@Size(max=20)
	private String employeeId;
	
	@NotNull
	@Size(max=20)
	private String companyId;
	
	public EmployeeIdentity() {
		
	}

	public EmployeeIdentity(String employeeId, String companyId) {
		this.employeeId = employeeId;
		this.companyId = companyId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	@Override
	public int hashCode() {
		int result = employeeId.hashCode();
		result = 31*result + companyId.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		EmployeeIdentity other = (EmployeeIdentity) obj;
		
		if(!employeeId.equals(other.employeeId))
			return false;
		
		return companyId.equals(other.companyId);
	}
	
	
	
}
