package com.api.saveservices.order.save.api.persistance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class ServiceJPARequests implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long servicerequestid;
	
	public String subscriptionid;
	public String resourcegroup;
	public String databasename;
	public String servername;
	public String skuname;
	public String tier;
	public String wftData;
	public String size;
	public String justification;
	public String collation;
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return the justification
	 */
	public String getJustification() {
		return justification;
	}
	/**
	 * @param justification the justification to set
	 */
	public void setJustification(String justification) {
		this.justification = justification;
	}
	/**
	 * @return the collation
	 */
	public String getCollation() {
		return collation;
	}
	/**
	 * @param collation the collation to set
	 */
	public void setCollation(String collation) {
		this.collation = collation;
	}
	/**
	 * @return the servicerequestid
	 */
	public Long getServicerequestid() {
		return servicerequestid;
	}
	/**
	 * @param servicerequestid the servicerequestid to set
	 */
	public void setServicerequestid(Long servicerequestid) {
		this.servicerequestid = servicerequestid;
	}
	/**
	 * @return the subscriptionid
	 */
	public String getSubscriptionid() {
		return subscriptionid;
	}
	/**
	 * @param subscriptionid the subscriptionid to set
	 */
	public void setSubscriptionid(String subscriptionid) {
		this.subscriptionid = subscriptionid;
	}
	/**
	 * @return the resourcegroup
	 */
	public String getResourcegroup() {
		return resourcegroup;
	}
	/**
	 * @param resourcegroup the resourcegroup to set
	 */
	public void setResourcegroup(String resourcegroup) {
		this.resourcegroup = resourcegroup;
	}
	/**
	 * @return the databasename
	 */
	public String getDatabasename() {
		return databasename;
	}
	/**
	 * @param databasename the databasename to set
	 */
	public void setDatabasename(String databasename) {
		this.databasename = databasename;
	}
	/**
	 * @return the servername
	 */
	public String getServername() {
		return servername;
	}
	/**
	 * @param servername the servername to set
	 */
	public void setServername(String servername) {
		this.servername = servername;
	}
	/**
	 * @return the skuname
	 */
	public String getSkuname() {
		return skuname;
	}
	/**
	 * @param skuname the skuname to set
	 */
	public void setSkuname(String skuname) {
		this.skuname = skuname;
	}
	/**
	 * @return the tier
	 */
	public String getTier() {
		return tier;
	}
	/**
	 * @param tier the tier to set
	 */
	public void setTier(String tier) {
		this.tier = tier;
	}
	/**
	 * @return the wftData
	 */
	public String getWftData() {
		return wftData;
	}
	/**
	 * @param wftData the wftData to set
	 */
	public void setWftData(String wftData) {
		this.wftData = wftData;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
