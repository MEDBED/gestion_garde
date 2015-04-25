package org.iit.workshopscrum.plangarde.model;

import java.util.Date;
import java.util.List;
<<<<<<< HEAD
//j ai une classe selectionnee dans la classe doctor
=======
//classe doctor
>>>>>>> d37ab280e934f4412818716b474c86362b7e5e02
public class Doctor {

	private String name;
	
	private List<Date> holidays;

	public Doctor(String name, List<Date> holidays) {
		super();
		this.name = name;
		this.holidays = holidays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Date> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<Date> holidays) {
		this.holidays = holidays;
	}
	
}
