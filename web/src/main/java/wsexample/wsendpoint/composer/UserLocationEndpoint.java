package wsexample.wsendpoint.composer;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import wsexample.wsendpoint.AbstractEndpoint;

/**
 * Created with IntelliJ IDEA.
 * User: JOHNZ
 * Date: 28/05/14
 * Time: 11:33 AM
 */
@Endpoint
public class UserLocationEndpoint extends AbstractEndpoint{

    private static final String NAMESPACE_URI = "http://www.gbst.com/composer";

//    @Autowired
//    private UserLocationServices userLocationServices;
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createUserLocation")
//    @ResponsePayload
//    public CreateUserLocationResponse handleCreate(@RequestPayload CreateUserLocation request) {
//
//        //map input
//        UserLocation newUserLocation = mapper.map(request, UserLocation.class);
//
//        //do the work
//        userLocationServices.create(newUserLocation);
//
//        //map output
//        CreateUserLocationResponse dummyResponse = new CreateUserLocationResponse();
//        dummyResponse.setCode("Success");
//        dummyResponse.setMessage(request.getName() + " is created.");
//        return dummyResponse;
//    }

}
