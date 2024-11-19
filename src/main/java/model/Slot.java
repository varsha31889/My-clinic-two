package model;

import jakarta.persistence.*;


public class Slot {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @ManyToOne
    private User doctor;
	
	
	
	
	
	
}
