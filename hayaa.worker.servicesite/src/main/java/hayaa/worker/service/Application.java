package hayaa.worker.service;

import hayaa.serviceplatform.client.AppRoot;
import hayaa.worker.servicecontroller.SampleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class,args);
        AppRoot.StartApp();
    }
}
