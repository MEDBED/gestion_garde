package org.iit.workshopscrum.plangarde.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Mohamed Chams Eddin Mouedhen & Yahia Elhem on 30/05/2015.
 */
public class Holidays {

    Date dateBegin;
    Date dateEnd;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Holidays(Date dateBegin, Date dateEnd) {
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
    }

    public Holidays(String dateBegin, String dateEnd) throws ParseException {
        this.dateBegin = dateFormat.parse(dateBegin);
        this.dateEnd = dateFormat.parse(dateEnd);
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Date getDateBegin() {
        return this.dateBegin;
    }

    public void setDateBegin(String dateBegin) throws ParseException {
        this.dateBegin = dateFormat.parse(dateBegin);
    }

    public Date getDateEnd() {
        return this.dateEnd;
    }

    public void setDateEnd(String dateEnd) throws ParseException {
        this.dateEnd = dateFormat.parse(dateEnd);
    }

    public boolean checkDay(Date day) {
        Calendar calendarMin = Calendar.getInstance();
        calendarMin.setTime(this.dateBegin);
        Calendar calendarMax = Calendar.getInstance();
        calendarMax.setTime(this.dateEnd);

        for (; calendarMin.before(calendarMax); calendarMin.add(Calendar.DATE, 1)) {
            if (day.compareTo(calendarMin.getTime()) == 0) {
                return false;
            }
        }
        return true;
    }

}
