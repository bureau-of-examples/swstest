package wsexample.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: JOHNZ
 * Date: 28/05/14
 * Time: 11:27 AM
 */
@Controller
@RequestMapping("/")
public class TestMvcController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String doGet(ModelMap model){
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "test";
    }
}
