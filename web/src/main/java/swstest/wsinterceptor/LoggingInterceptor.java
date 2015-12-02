package swstest.wsinterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import swstest.domain.simpleshop.model.Category;
import swstest.service.simpleshop.CategoryService;

import java.util.Date;

/**
 * A logging interceptor used to replicate proxy creation problem.
 */
@Component
public class LoggingInterceptor implements EndpointInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

//    @Autowired
//    private CategoryService categoryService;

    @Override
    public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {
//cannot open transaction in an interceptor.
//        logger.debug("Creating a new category.");
//        Category category = new Category();
//        category.setName(new Date().toString());
//        category.setDescription("Interceptor created category.");
//        categoryService.Add(category);
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext, Object endpoint) throws Exception {
        return true;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex) throws Exception {

    }
}
