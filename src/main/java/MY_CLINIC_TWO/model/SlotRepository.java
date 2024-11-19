package MY_CLINIC_TWO.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Slot;

public interface SlotRepository extends JpaRepository<Slot, Long>  {

	List<Slot> findByDoctorId(Long doctorId);
}
