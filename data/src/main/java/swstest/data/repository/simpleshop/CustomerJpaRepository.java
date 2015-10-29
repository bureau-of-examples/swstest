package swstest.data.repository.simpleshop;

import org.springframework.data.jpa.repository.JpaRepository;
import swstest.domain.simpleshop.model.Customer;


public interface CustomerJpaRepository extends JpaRepository<Customer, Integer> {
}
