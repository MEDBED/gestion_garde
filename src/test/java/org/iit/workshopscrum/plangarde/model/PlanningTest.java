/**
 * 
 */
package org.iit.workshopscrum.plangarde.model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.junit.Test;

/**
 * @author khouloudkeskes
 *
 */
public class PlanningTest {

	@Test(expected = Exception.class)
	public void test_affectUniqueDoctor_CaseZeroDoctorAndOneDayPeriod() throws Exception {

		// Inputs
		List<Doctor> doctors = new ArrayList<Doctor>();
		Date beginPlan = null;
		Date endPlan = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try{
			endPlan = dateFormat.parse("01/02/2012");
			}catch(ParseException e){}
		// Call method under test
		Planning planning= new Planning( doctors , beginPlan , endPlan);
		planning.affectUniqueDoctor();
	}

	@Test
	public void test_affectUniqueDoctor_CaseOneDoctorAndOneDayPeriod() throws Exception {

		// Inputs
		List<Doctor> doctors = new ArrayList<Doctor>();
		doctors.add(new Doctor(1,"Mohamed"));
		Date beginPlan = new Date();
		Date endPlan = new Date();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try{
		endPlan = dateFormat.parse("01/02/2012");
		}catch(ParseException e){}
		// Call method under test
		Planning planning= new Planning( doctors , beginPlan , endPlan);
		planning.affectUniqueDoctor();

		// Assertion
		//assertEquals(1, planningGarde.getGardeList().size());
		//assertEquals("Mohamed", planningGarde.getGardeList().get(0).getDoctorGarde().getName());
	}
	
	@Test
	public void test_affectUniqueDoctor_CaseOneDoctorAndTenDaysPeriod() throws Exception {

		// Inputs
		List<Doctor> doctors = new ArrayList<Doctor>();
		doctors.add(new Doctor(1,"Mohamed"));
		Date beginPlan = new Date();
		Date endPlan =  new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try{
			beginPlan=dateFormat.parse("01/02/2012");
			endPlan = dateFormat.parse("11/02/2012");
			}catch(ParseException e){}

		// Call method under test
		Planning planning= new Planning( doctors , beginPlan , endPlan);
		planning.affectUniqueDoctor();

		// Assertion
		
	}
	@Test
	public void test_affectUniqueDoctor_CaseEndDateBeforeStartDate() throws Exception {

		// Inputs
				List<Doctor> doctors = new ArrayList<Doctor>();
				doctors.add(new Doctor(1,"Mohamed"));
				Date beginPlan = new Date();
				Date endPlan =  new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				try{
					beginPlan=dateFormat.parse("11/02/2012");
					endPlan = dateFormat.parse("01/02/2012");
					}catch(ParseException e){}
		// Call method under test
				Planning planning= new Planning( doctors , beginPlan , endPlan);
				planning.affectUniqueDoctor();
	}


}
