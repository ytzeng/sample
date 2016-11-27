package com.leo.zeng.sample.web.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.leo.zeng.api.pojo.ResponseDto;
import org.leo.zeng.api.support.BaseRescouce;
import org.leo.zeng.core.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Path("test")
public class TestResource extends BaseRescouce {
    private static Logger logger = LoggerFactory.getLogger(TestResource.class);

    @GET
    @Path("get")
    @Produces({ MediaType.APPLICATION_JSON })
    public ResponseDto get() {
        try {
            throw new ServiceException();
        } catch (Exception e) {
            return failure(e, "get", logger);
        }
    }

    @POST
    @Path("api")
    @Produces({ MediaType.APPLICATION_JSON })
    @Consumes({ MediaType.APPLICATION_JSON })
    public ResponseDto api() {
        try {
            return success();
        } catch (Exception e) {
            return failure(e, "get", logger);
        }
    }
}
