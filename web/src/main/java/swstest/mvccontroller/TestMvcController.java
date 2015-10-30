package swstest.mvccontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import swstest.domain.simpleshop.model.Category;
import swstest.service.simpleshop.CategoryService;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * Created with IntelliJ IDEA.
 * User: JOHNZ
 * Date: 28/05/14
 * Time: 11:27 AM
 */
@Controller
@RequestMapping()
public class TestMvcController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String doGet(ModelMap model){
        model.addAttribute("message", "Hello Spring MVC Framework!");
        model.addAttribute("categories", categoryService.findAll());
        return "test";
    }

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String doGet2(ModelMap model){
       TypedQuery<Category> query = entityManager.createNamedQuery("Category.findAll", Category.class);
        model.addAttribute("message", "Hello Spring MVC Framework! - 2");
        model.addAttribute("categories", query.getResultList());
        return "test";
    }
}
