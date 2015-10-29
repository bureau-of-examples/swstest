package swstest.data.repository.simpleshop;

import org.springframework.data.jpa.repository.JpaRepository;
import swstest.domain.simpleshop.model.Category;


public interface CategoryJpaRepository extends JpaRepository<Category, Integer> {
}
