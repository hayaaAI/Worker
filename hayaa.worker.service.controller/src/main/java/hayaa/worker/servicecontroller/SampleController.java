package hayaa.worker.servicecontroller;

import hayaa.worker.service.model.Company;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/sample", method = {RequestMethod.GET, RequestMethod.POST})
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/t1")
    Company home1() {
        return new Company();
    }
}