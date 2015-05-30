package org.iit.workshopscrum.plangarde.model;

import java.util.Date;
import java.util.Map;
//classe planninggarde par khouloud
/**
 * Created by Mohamed Chams Eddin Mouedhen & Yahia Elhem on 30/05/2015.
 */
/**
* <h1>Add planingGarde</h1>
* The  program implements an application that
* simply add : given date.
* the output on the screen.
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author  Chams
* @version 1.0
* @since   2014-05-30
*/
public class PlanningGarde {
	/**
	   * This method is used to add planing. This is
	   * a the simplest form of a class method, just to
	   * show the usage of various javadoc Tags.
	   * @param map<Date,doctor> listtype 
	   */

	private Map<Date, Doctor> planning;

	public PlanningGarde(Map<Date, Doctor> planning) {
		super();
		this.planning = planning;
	}

	public Map<Date, Doctor> getPlanning() {
		return planning;
	}
//modification methode set
	public void setPlanning(Map<Date, Doctor> planning) {
		this.planning = planning;
	}
	
}
