package swstest.data.repository.simpleshop;

import org.springframework.data.jpa.repository.JpaRepository;
import swstest.domain.simpleshop.model.Suburb;


public interface SuburbJpaRepository extends JpaRepository<Suburb, Integer> {
}
