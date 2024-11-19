package model;

import jakarta.persistence.*;



public class User {

	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

//	    private String name;
//	    private String phoneNumber;

	    @Enumerated(EnumType.STRING)
	    private Role role;

	 //   private String otp;

	    public enum Role {
	        PATIENT, RECEPTIONIST, DOCTOR
	    }
	
	
}
