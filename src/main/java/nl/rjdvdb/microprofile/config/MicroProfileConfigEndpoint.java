package nl.rjdvdb.microprofile.config;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import nl.rjdvdb.persistence.TodoDao;
import org.eclipse.microprofile.config.inject.ConfigProperty;


@Path("/")
public class MicroProfileConfigEndpoint {

    @Inject
    @ConfigProperty(name = "config1", defaultValue = "Default value for config1 comes from my code")
    String config1;

    @Inject
    TodoDao dao;

    @GET
    @Produces("text/plain")
    public Response config1() {
        return Response.ok("config1 = " + config1 +
                "\n"+dao.list()).build();
    }
}