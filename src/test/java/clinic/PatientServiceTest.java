package clinic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import model.Appointment;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class PatientServiceTest {

	 @Autowired
	 
	    private PatientServiceTest patientService;
	 
	 
	 private List<Appointment> appointments = new ArrayList<>();
	 
	 
	 public List<Appointment> getAppointments1() {
	        return appointments;
	 
	 }
	    @BeforeClass
	    public void setup() {
	        // Set up any required data before running tests
	    }

	    @Test
	    public List<Appointment> testBookAppointment(Appointment appointment2) {
	        // Assuming you have a method to book an appointment
	        Appointment appointment = new Appointment();
	        appointment.setDate(LocalDate.now());
	        appointment.setTime(LocalTime.now());
	        appointment.setDoctorName("Dr. Neha");

	        patientService.testBookAppointment(appointment);

	        Assert.assertNotNull(patientService.getAppointments());
	        Assert.assertEquals(((List<Appointment>) patientService.getAppointments()).size(), 1);
	        
	        
	        List<Appointment> appointments = (List<Appointment>) patientService.getAppointments();
	        Assert.assertEquals(appointments.size(), 1);
			return appointments;


	        
	        
	        
	        
	    }

	    private Object getAppointments() {
			// TODO Auto-generated method stub
			return null;
		}

		@Test
	    public void testViewAppointments() {
	     //   Assert.assertTrue(((Object) patientService.getAppointments1()).Size() > 0);
	        
	        Assert.assertEquals(patientService.getAppointments1().size(), 1);
	        
	        Assert.assertEquals(((List<Appointment>) patientService.getAppointments()).size(), 1);

	        
	        
	        List<Appointment> appointments = (List<Appointment>) patientService.getAppointments1();
	        Assert.assertEquals(appointments.size(), 1);

	        
	        
	        System.out.println(patientService.getAppointments1().getClass());

	    }
	
		
		

}
