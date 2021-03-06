package org.iit.workshopscrum.plangarde.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Mohamed Chams Eddin Mouedhen & Elhem Yahia on 30/05/2015.
 */

/**
 * <h1>Add planing</h1>
 * The program implements an application that
 * simply add : given date.
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author Chams
 * @version 1.0
 * @since 2014-05-30
 */
public class Planning {
    /**
     * This method is used to add planing. This is
     * a the simplest form of a class method, just to
     * show the usage of various javadoc Tags.
     *
     * @param list of doctor
     * @param beginplan :type date
     * @param endplan   :type date
     */

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

    public void addPlanDayUniqueDoctor(Date day, Doctor doctor) throws Exception {
        if (plan.containsKey(day)) {
            throw new Exception("This day is already affected");
        }
        if (plan.containsValue(doctor)) {
            throw new Exception("This doctor is already affected");
        }
        this.plan.put(day, doctor);
    }

    public void affectUniqueDoctor() throws Exception {

        Calendar calendarMin = Calendar.getInstance();
        calendarMin.setTime(this.beginPlan);
        Calendar calendarMax = Calendar.getInstance();
        calendarMax.setTime(this.endPlan);

        if (beginPlan.compareTo(endPlan) >= 0)
            throw new Exception("The begin date is bigger them end date");

        int dispoDoctors = 0;
        int totalDays = 0;

        for (; calendarMin.before(calendarMax); calendarMin.add(Calendar.DATE, 1)) {
            totalDays++;
            for (Doctor doctor : this.doctors) {
                if (!this.plan.containsKey(calendarMin.getTime())) {
                    for (int j = 0; j < doctor.getHolidays().size(); j++) {
                        if (!plan.containsValue(doctor)) {
                            if (!doctor.getHolidays().get(j).checkDay(calendarMin.getTime())) {
                                dispoDoctors++;
                            }
                        }
                    }
                }
            }
        }

        if (dispoDoctors < totalDays)
            throw new Exception("Available doctors are less them number of days to affect");

        for (; calendarMin.before(calendarMax); calendarMin.add(Calendar.DATE, 1)) {
            for (Doctor doctor : this.doctors) {
                DayWeek d = DayWeek(calendarMin.get(Calendar.DAY_OF_WEEK));
                if (doctor.getPreferences().contains() {
                    for (int j = 0; j < doctor.getHolidays().size(); j++) {
                        if (!doctor.getHolidays().get(j).checkDay(calendarMin.getTime())) {
                            this.addPlanDayUniqueDoctor(calendarMin.getTime(), doctor);
                        }
                    }
                }
            }
        }

        for (; calendarMin.before(calendarMax); calendarMin.add(Calendar.DATE, 1)) {
            for (Doctor doctor : this.doctors) {
                if (!this.plan.containsKey(calendarMin.getTime())) {
                    for (int j = 0; j < doctor.getHolidays().size(); j++) {
                        if (!plan.containsValue(doctor)) {
                            if (!doctor.getHolidays().get(j).checkDay(calendarMin.getTime())) {
                                this.addPlanDayUniqueDoctor(calendarMin.getTime(), doctor);
                            }
                        }
                    }
                }
            }
        }

    }
}
