package com.agency.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Agency {
	public Agency() {
	
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer AgencyId;
	private String name;
	private Integer TransportId;
	public Integer getAgencyId() {
		return AgencyId;
	}
	public void setAgencyId(Integer agencyId) {
		AgencyId = agencyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTransportId() {
		return TransportId;
	}
	public void setTransportId(Integer transportId) {
		TransportId = transportId;
	}
	@Override
	public String toString() {
		return "Agency [AgencyId=" + AgencyId + ", name=" + name + ", TransportId=" + TransportId + "]";
	}
	public Agency(Integer agencyId, String name, Integer transportId) {
		super();
		AgencyId = agencyId;
		this.name = name;
		TransportId = transportId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(AgencyId, TransportId, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agency other = (Agency) obj;
		return Objects.equals(AgencyId, other.AgencyId) && Objects.equals(TransportId, other.TransportId)
				&& Objects.equals(name, other.name);
	}
	
	}



