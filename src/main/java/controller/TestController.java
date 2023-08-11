package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import service.TestService;

@RestController
public class TestController {
    private TestService testService;




    public TestController(TestService testService){
        this.testService=testService;
    }
  public void testM(){
        testService.test();
  }
}
