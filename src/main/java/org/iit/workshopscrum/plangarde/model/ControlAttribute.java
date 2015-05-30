package org.iit.workshopscrum.plangarde.model;

/**
 * Created by Mohamed Chams Eddin Mouedhen & Elhem Yahia on 30/05/2015.
 */
public class ControlAttribute {

    public static boolean isString(String stringToControl) {
        return stringToControl.matches("\\p{Alpha}*");
    }

    public static boolean isNumeric(String intToControl) {
        return intToControl.matches("\\p{Digit}*");
    }

    public static boolean isEmail(String emailToControl) {
        return emailToControl.matches("\\p{Alnum}*@\\p{Alnum}*.\\p{Alpha}");
    }

}
