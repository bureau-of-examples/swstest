package swstest.service.simpleshop.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import swstest.data.repository.simpleshop.CategoryJpaRepository;
import swstest.domain.simpleshop.model.Category;
import swstest.service.simpleshop.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryJpaRepository categoryJpaRepository;

    @Transactional(readOnly = true)
    public List<Category> findAll(){
        return categoryJpaRepository.findAll();
    }

    @Transactional
    public Category Add(Category category){
        return categoryJpaRepository.save(category);
    }
}
