package team.two.goodwill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Service service;

    @RequestMapping("/cool")
    public Dao getSomething(){
        return service.getValue();
    }



}
