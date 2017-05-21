package se.seppa.efk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class Controller {
    private Logger logger = LoggerFactory.getLogger(Application.class);

    @GetMapping(value = "/hello")
    ResponseEntity<String> hello() {
        logger.info("HELLOOOOO");
        return ResponseEntity.ok("world");
    }
}
