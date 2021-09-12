package nl.rjdvdb.microprofile.config;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

@RunWith(Arquillian.class)
@RunAsClient
public class MicroProfileConfigEndpointIT {

    @Test
    public void testURL() {
        when().
            get("/").
            then().
            statusCode(200).
            body("config1", equalTo("Value for config1 " +
                    "comes from a properties file inside the application"));
    }
}
