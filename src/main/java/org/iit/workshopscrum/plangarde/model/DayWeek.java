package org.iit.workshopscrum.plangarde.model;

import java.util.Calendar;

/**
 * Created by Mohamed Chams Eddin Mouedhen & Yahia Elhem on 30/05/2015.
 */
/**
* <h1>Add day</h1>
* The AddNum program implements an application that
* simply add : given integer number.
* the output on the screen.
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author  Chams
* @version 1.0
* @since   2014-05-30
*/

public enum DayWeek {
	/**
	   * This method is used to add int (day). This is
	   * a the simplest form of a class method, just to
	   * show the usage of various javadoc Tags.
	   * @param day (monday,tuesday,.....)
	   * @return int of day.
	   */

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
