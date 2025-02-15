package techWithJatin.apis.filters;

import io.restassured.filter.*;
import io.restassured.response.Response;
import io.restassured.specification.*;
import org.apache.logging.log4j.*;

import java.util.Optional;


public class LoggingFilters implements Filter {
    public static final Logger logger = LogManager.getLogger(LoggingFilters.class);
    @Override
    public Response filter(FilterableRequestSpecification filterableRequestSpecification,
                           FilterableResponseSpecification filterableResponseSpecification,
                           FilterContext filterContext) {
        logRequest(filterableRequestSpecification);
        Response response = filterContext.next(filterableRequestSpecification,filterableResponseSpecification);
        logResponse(response);
        return response;
    }

    public void logRequest(FilterableRequestSpecification filterableRequestSpecification){
        logger.info("Request BaseUri: {}", filterableRequestSpecification.getBaseUri());
        logger.info("Request Headers: {}", filterableRequestSpecification.getHeaders());
        logger.info("Request Body: {}", Optional.ofNullable(filterableRequestSpecification.getBody()));
    }
    public void logResponse(Response response){
        logger.info("Response StatusCode: {}", response.getStatusCode());
        logger.info("Response Headers: {}", response.getHeaders());
        logger.info("Response Body: {}", response.getBody());
    }

}
