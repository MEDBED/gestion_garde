package org.iit.workshopscrum.plangarde.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Mohamed Chams Eddin Mouedhen & Elhem Yahia on 30/05/2015.
 */
public class Planning {

    private List<Doctor> doctors;
    private Date beginPlan;
    private Date endPlan;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private Hashtable<Date, Doctor> plan = new Hashtable<Date, Doctor>();

    public Planning() {
        super();
    }

    public Planning(List<Doctor> doctors, Date beginPlan, Date endPlan) {
        this.doctors = doctors;
        this.beginPlan = beginPlan;
        this.endPlan = endPlan;
    }

    public void setBeginPlan(Date beginPlan) {
        this.beginPlan = beginPlan;
    }

    public void setEndPlan(Date endPlan) {
        this.endPlan = endPlan;
    }

    public Date getBeginPlan() {
        return this.beginPlan;
    }

    public void setBeginPlan(String beginPlan) throws ParseException {
        this.beginPlan = this.dateFormat.parse(beginPlan);
    }

    public Date getEndPlan() {
        return this.endPlan;
    }

    public void setEndPlan(String endPlan) throws ParseException {
        this.endPlan = this.dateFormat.parse(endPlan);
    }

    public List<Doctor> getDoctors() {
        return this.doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Hashtable<Date, Doctor> getPlan() {
        return this.plan;
    }

    public void setPlan(Hashtable<Date, Doctor> plan) {
        this.plan = plan;
    }

    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    public void addPlanDay(Date day, Doctor doctor) throws Exception {
        if (plan.containsKey(day)) {
            throw new Exception("This day is already affected");
        }
        if (plan.containsValue(doctor)) {
            throw new Exception("This doctor is already affected");
        }
        this.plan.put(day, doctor);
    }
}