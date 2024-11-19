package MY_CLINIC_TWO.model;

import org.springframework.data.jpa.repository.JpaRepository;

import model.User;

public interface  UserRepository extends JpaRepository<User, Long> {
    User findByPhoneNumber(String phoneNumber);

}
