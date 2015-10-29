package swstest.data.repository.simpleshop;

import org.springframework.data.jpa.repository.JpaRepository;
import swstest.domain.simpleshop.model.Shipper;


public interface ShipperJpaRepository extends JpaRepository<Shipper, Integer> {
}
