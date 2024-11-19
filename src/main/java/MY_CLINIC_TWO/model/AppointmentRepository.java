package MY_CLINIC_TWO.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Appointment;

public interface AppointmentRepository    extends JpaRepository<Appointment, Long>{

	 List<Appointment> findByPatientId(Long patientId);
	    List<Appointment> findBySlotDoctorId(Long doctorId);
	
}
