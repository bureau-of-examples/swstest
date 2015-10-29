package swstest.wsendpoint;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: JOHNZ
 * Date: 20/06/14
 * Time: 1:06 PM
 */
public abstract class AbstractEndpoint {

    @Autowired
    protected DozerBeanMapper mapper;
}
