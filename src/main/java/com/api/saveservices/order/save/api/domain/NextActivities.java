/**
 * 
 */
package com.api.saveservices.order.save.api.domain;

/**
 * @author prasad.bolla1@ibm.com
 *
 */
public class NextActivities {
	public String save;
	public String submit;
	/**
	 * @return the save
	 */
	public String getSave() {
		return save;
	}
	/**
	 * @param save the save to set
	 */
	public void setSave(String save) {
		this.save = save;
	}
	/**
	 * 
	 */
	public NextActivities() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the submit
	 */
	public String getSubmit() {
		return submit;
	}
	/**
	 * @param submit the submit to set
	 */
	public void setSubmit(String submit) {
		this.submit = submit;
	}
}
