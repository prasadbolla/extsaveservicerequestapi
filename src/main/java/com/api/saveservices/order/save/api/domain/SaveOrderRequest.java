/**
 * 
 */
package com.api.saveservices.order.save.api.domain;

/**
 * @author PRASADBolla
 *
 */
public class SaveOrderRequest {
	public String subscriptionId;
	public String resourceGroup;
	public String databaseName;
	public String serverName;
	public String skuname;
	public String tier;
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
	 * @return the subscriptionId
	 */
	public String getSubscriptionId() {
		return subscriptionId;
	}


	/**
	 * @param subscriptionId the subscriptionId to set
	 */
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}


	/**
	 * @return the resourceGroup
	 */
	public String getResourceGroup() {
		return resourceGroup;
	}


	/**
	 * @param resourceGroup the resourceGroup to set
	 */
	public void setResourceGroup(String resourceGroup) {
		this.resourceGroup = resourceGroup;
	}


	/**
	 * @return the databaseName
	 */
	public String getDatabaseName() {
		return databaseName;
	}


	/**
	 * @param databaseName the databaseName to set
	 */
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}


	/**
	 * @return the serverName
	 */
	public String getServerName() {
		return serverName;
	}


	/**
	 * @param serverName the serverName to set
	 */
	public void setServerName(String serverName) {
		this.serverName = serverName;
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
	public WFTData getWftData() {
		return wftData;
	}


	/**
	 * @param wftData the wftData to set
	 */
	public void setWftData(WFTData wftData) {
		this.wftData = wftData;
	}


	public WFTData wftData;

	
	/**
	 * Default constructor
	 */
	public SaveOrderRequest() {

	}

}
