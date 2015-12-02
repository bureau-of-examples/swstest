package swstest.wsendpoint.composer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.server.endpoint.annotation.SoapAction;
import swstest.domain.simpleshop.model.Category;
import swstest.dto.simpleshop.CreateUserLocation;
import swstest.dto.simpleshop.CreateUserLocationResponse;
import swstest.service.simpleshop.CategoryService;
import swstest.wsendpoint.AbstractEndpoint;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JOHNZ
 * Date: 28/05/14
 * Time: 11:33 AM
 */
@Endpoint
public class CategoryEndpoint extends AbstractEndpoint{

    private static final String NAMESPACE_URI = "http://www.gbst.com/composer";

    @Autowired
    private CategoryService categoryService;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createUserLocation")
    @ResponsePayload
    public CreateUserLocationResponse handleCreate(@RequestPayload CreateUserLocation request) {

        //map input
//        UserLocation newUserLocation = mapper.map(request, UserLocation.class);

        //do the work
        List<Category> categories = categoryService.findAll();

        //map output
        CreateUserLocationResponse dummyResponse = new CreateUserLocationResponse();
        dummyResponse.setCode("Success");
        dummyResponse.setMessage("There are " + categories.size() + " categories.");
        return dummyResponse;
    }

}
