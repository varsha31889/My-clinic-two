package model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.*;



public class Appointment {

	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    private User patient;

	    @ManyToOne
	    private Slot slot;

	    @Enumerated(EnumType.STRING)
	    private Status status;

	    public enum Status {
	        CONFIRMED, CANCELLED, PENDING
	    }

		public void setTime(LocalTime now) {
			// TODO Auto-generated method stub
			
		}

		public void setDate(LocalDate now) {
			// TODO Auto-generated method stub
			
		}

		public void setDoctorName(String string) {
			// TODO Auto-generated method stub
			
		}
	
	
	
	
	
	
	
}
