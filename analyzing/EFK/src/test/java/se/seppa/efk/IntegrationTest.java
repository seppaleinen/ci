package se.seppa.efk;

import io.restassured.RestAssured;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

import static io.restassured.RestAssured.when;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = Application.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class IntegrationTest {
    @LocalServerPort
    private int randomServerPort;

    @Before
    public void setup() {
        RestAssured.port = randomServerPort;
    }


    @Test
    public void test() {
        when().get("/hello")
                .then()
                .statusCode(CoreMatchers.equalTo(HttpStatus.OK.value()))
                .content(CoreMatchers.equalTo("world"));
    }
}
