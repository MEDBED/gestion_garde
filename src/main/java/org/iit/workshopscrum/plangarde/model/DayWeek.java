package org.iit.workshopscrum.plangarde.model;

import java.util.Calendar;

/**
 * Created by Mohamed Chams Eddin Mouedhen & Yahia Elhem on 30/05/2015.
 */

public enum DayWeek {

    MONDAY(Calendar.MONDAY), TUESDAY(Calendar.TUESDAY), WEDNESDAY(Calendar.WEDNESDAY), THURSDAY(Calendar.THURSDAY), FRIDAY(Calendar.FRIDAY), SATURDAY(
            Calendar.SATURDAY), SUNDAY(Calendar.SUNDAY);

    private int day;

    DayWeek(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }
}
