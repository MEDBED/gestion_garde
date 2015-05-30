
package org.iit.workshopscrum.plangarde.model;

import java.util.List;
/*
* <h1>Class Doctor!</h1>
* The class doctor is a class which are declared many informations about a doctor like id ,name, holidays and preferences
* Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
* 
*
* @author Mohamed Chams eddine
* @made by Hatem
* @version 1.0
* @since   2014-05-30 
*/
public class Doctor {

	//@TODO controle for all entries in the methods

	private int id;/* the id of a doctor*/
	private String name;/* the name of a doctor*/ 
	private List<Holidays> holidays;/* the holidays which a doctor can take leave */ 
	private List<DayWeek> preferences; /* the days which a doctor prefer to keep */

/* doctor is a  constructor which have many attributes like name , holidays and preferences*/	
public Doctor(int id, String name, List<Holidays> holidays, List<DayWeek> preferences) {
		super();
		this.id = id; 
		this.name = name; 
		this.holidays = holidays; 
		this.preferences = preferences; 
	}
/* this class is a constructor which are declared two attributes who are id and name */
	public Doctor(int id, String name) {
		super();
		this.id = id; 
		this.name = name;
	}

	/*this class return an object who are name */
	public String getName() { 
		return name;
	}
    
	/* in this class we can modify the name of a doctor*/
	public void setName(String name) {
		this.name = name;
	}
	/*this class return an object who are holidays */
	public List<Holidays> getHolidays() {
		return this.holidays;
	}
	/* in this class we can modify the holidays of a doctor*/
	public void setHolidays(List<Holidays> holidays) {
		this.holidays = holidays;
	}
	/* this class return  the preferences of a doctor*/
	public List<DayWeek> getPreferences() {
		return this.preferences;
	}
	/* in this class we can modify the preferences of a doctor*/
	public void setPreferences(List<DayWeek> preferences) {
		this.preferences = preferences;
	}
}
