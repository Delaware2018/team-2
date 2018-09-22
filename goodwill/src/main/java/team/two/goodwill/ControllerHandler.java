package team.two.goodwill;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerHandler {

   // String homeState;

    //Home Page
    @GetMapping("/")
    public String homePage(@RequestParam(name="name", required=false, defaultValue="World") String greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "home";
    }

    /*
    @PostMapping("/")
    public String homePageClick(){
        return "home";
    }
    */







    //Below is testing locations for input

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "test";
    }


    @GetMapping("/test")
    public String test(){
        return "test";
    }



}