/**
 * 
 */
package com.api.saveservices.order.save.api.domain;

import java.io.Serializable;

/**
 * @author prasad.bolla1@ibm.com
 *
 */
public class WFTData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3903879794501008485L;
	public static String id;
	public static String name;
	public static String[] serviceCategory;
	public static String[] services;
	public static String[] operations;
	public static String[] activities;
	public static String[] initial;
	public static Connectors connectors;
	/**
	 * @return the id
	 */
	public static String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public static void setId(String id) {
		WFTData.id = id;
	}
	/**
	 * @return the name
	 */
	public static String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public static void setName(String name) {
		WFTData.name = name;
	}
	/**
	 * @return the serviceCategory
	 */
	public static String[] getServiceCategory() {
		return serviceCategory;
	}
	/**
	 * @param serviceCategory the serviceCategory to set
	 */
	public static void setServiceCategory(String[] serviceCategory) {
		WFTData.serviceCategory = serviceCategory;
	}
	/**
	 * @return the services
	 */
	public static String[] getServices() {
		return services;
	}
	/**
	 * @param services the services to set
	 */
	public static void setServices(String[] services) {
		WFTData.services = services;
	}
	/**
	 * @return the operations
	 */
	public static String[] getOperations() {
		return operations;
	}
	/**
	 * @param operations the operations to set
	 */
	public static void setOperations(String[] operations) {
		WFTData.operations = operations;
	}
	/**
	 * @return the activities
	 */
	public static String[] getActivities() {
		return activities;
	}
	/**
	 * @param activities the activities to set
	 */
	public static void setActivities(String[] activities) {
		WFTData.activities = activities;
	}
	/**
	 * @return the initial
	 */
	public static String[] getInitial() {
		return initial;
	}
	/**
	 * @param initial the initial to set
	 */
	public static void setInitial(String[] initial) {
		WFTData.initial = initial;
	}
	/**
	 * @return the connectors
	 */
	public static Connectors getConnectors() {
		return connectors;
	}
	/**
	 * @param connectors the connectors to set
	 */
	public static void setConnectors(Connectors connectors) {
		WFTData.connectors = connectors;
	}
}