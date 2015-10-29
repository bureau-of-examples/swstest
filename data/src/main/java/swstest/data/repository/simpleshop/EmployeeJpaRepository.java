package swstest.data.repository.simpleshop;

import org.springframework.data.jpa.repository.JpaRepository;
import swstest.domain.simpleshop.model.Employee;


public interface EmployeeJpaRepository extends JpaRepository<Employee, Integer> {
}
