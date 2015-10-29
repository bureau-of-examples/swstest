package swstest.data.repository.simpleshop;

import org.springframework.data.jpa.repository.JpaRepository;
import swstest.domain.simpleshop.model.Order;


public interface OrderJpaRepository extends JpaRepository<Order, Integer> {
}
