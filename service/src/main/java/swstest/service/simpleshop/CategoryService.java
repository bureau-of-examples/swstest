package swstest.service.simpleshop;


import swstest.domain.simpleshop.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category Add(Category category);
}
