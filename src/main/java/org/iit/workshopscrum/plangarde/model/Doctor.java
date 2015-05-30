package org.iit.workshopscrum.plangarde.model;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Doctor {

    //@TODO controle for all entries in the methods

    private int id;
    private String name;
    private String lastName;
    private int telphone;
    private String email;
    private List<Holidays> holidays;
    private List<DayWeek> preferences;

    public Doctor(int id, String name, List<Holidays> holidays, List<DayWeek> preferences) {
        super();
        this.id = id;
        this.name = name;
        this.holidays = holidays;
        this.preferences = preferences;
    }

    public Doctor(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Doctor(int id, String name, String lastName, int telphone, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.telphone = telphone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Holidays> getHolidays() {
        return this.holidays;
    }

    public void setHolidays(List<Holidays> holidays) {
        this.holidays = holidays;
    }

    public List<DayWeek> getPreferences() {
        return this.preferences;
    }

    public void setPreferences(List<DayWeek> preferences) {
        this.preferences = preferences;
    }

    public void addPreferences(DayWeek dayWeek) {
        if (this.preferences.contains(dayWeek)) {
            return;
        }
        this.preferences.add(dayWeek);
    }

    public void addHolidays(Date dateBegin, Date dateEnd) {
        this.holidays.add(new Holidays(dateBegin, dateEnd));
    }

    public void addHolidays(String dateBegin, String dateEnd) throws ParseException {
        this.holidays.add(new Holidays(dateBegin, dateEnd));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTelphone() {
        return telphone;
    }

    public void setTelphone(int telphone) {
        this.telphone = telphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
