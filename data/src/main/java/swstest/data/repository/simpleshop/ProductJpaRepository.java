package swstest.data.repository.simpleshop;

import org.springframework.data.jpa.repository.JpaRepository;
import swstest.domain.simpleshop.model.Product;


public interface ProductJpaRepository extends JpaRepository<Product, Integer> {
}
