package swstest.data.repository.simpleshop;

import org.springframework.data.jpa.repository.JpaRepository;
import swstest.domain.simpleshop.model.Country;


public interface CountryJpaRepository extends JpaRepository<Country, Integer> {
}
