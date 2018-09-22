package team.two.goodwill;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerHandler {

   private final String HOME_PAGE = "/";
   private final String LOGIN_PAGE = "/login";
   private Service service;

    //Home Page
    @GetMapping("/")
    public String homePageRequest() {
        return "home";
    }


    @RequestMapping(value=HOME_PAGE,params="login", method= RequestMethod.POST)
    public String loginHomeClick(){

        System.out.println("\nYou have clicked login");

        return "login";
    }
    @RequestMapping(value=HOME_PAGE,params="register", method= RequestMethod.POST)
    public String registerHomeClick(){

        System.out.println("\nYou have clicked register");

        return "register";
    }


    @PostMapping("/register")
    public String registerEnd(@ModelAttribute User newBe){
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(){
        return "";
    }
//    @RequestMapping(value=HOME_PAGE, params="registerClick", method = RequestMethod.TRACE)
//    public void registerHomeClick(){
//        System.out.println("\nYou have clicked register!");
//    }








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