/**
 * 
 */
package com.api.saveservices.order.save.api.domain;

import java.io.Serializable;

/**
 *
 *
 */
public class Connectors implements Serializable  {

private static final long serialVersionUID = 582410610735169043L;
public String activity;
public String type;
public NextActivities nextActivities;
/**
 * @return the nextActivities
 */
public NextActivities getNextActivities() {
	return nextActivities;
}
/**
 * @param nextActivities the nextActivities to set
 */
public void setNextActivities(NextActivities nextActivities) {
	this.nextActivities = nextActivities;
}
/**
 * @return the activity
 */
public String getActivity() {
	return activity;
}
/**
 * @param activity the activity to set
 */
public void setActivity(String activity) {
	this.activity = activity;
}
/**
 * @return the type
 */
public String getType() {
	return type;
}
/**
 * @param type the type to set
 */
public void setType(String type) {
	this.type = type;
}
/**
 * @return the actors
 */
public Actors getActors() {
	return actors;
}
/**
 * @param actors the actors to set
 */
public void setActors(Actors actors) {
	this.actors = actors;
}
/**
 * @return the readOnly
 */
public boolean isReadOnly() {
	return readOnly;
}
/**
 * @param readOnly the readOnly to set
 */
public void setReadOnly(boolean readOnly) {
	this.readOnly = readOnly;
}
/**
 * @return the approve
 */
public String getApprove() {
	return approve;
}
/**
 * @param approve the approve to set
 */
public void setApprove(String approve) {
	this.approve = approve;
}
/**
 * @return the reject
 */
public String getReject() {
	return reject;
}
/**
 * @param reject the reject to set
 */
public void setReject(String reject) {
	this.reject = reject;
}
public Actors actors;
public boolean readOnly;
public String approve;
public String reject;
}
