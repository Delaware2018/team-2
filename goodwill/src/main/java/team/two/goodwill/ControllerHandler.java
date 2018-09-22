package team.two.goodwill;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerHandler {
    private UserRepository repo;
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


    @GetMapping("/register")
    public String loadRegister(Model model){
        model.addAttribute("newBe", new User());
        return "register";
    }

//    @GetMapping("/register_cont")
//    public String registration_cont() {
//        return "register_cont";
//    }
//
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }

    @PostMapping("/register")
    public String registerEnd(@ModelAttribute User newBe, @RequestParam(name="name") String name){
        service.setUser(newBe);
        return "test";
    }

    @PostMapping("/login")
    public String loginUser(){
        return "";
    }
//    @RequestMapping(value=HOME_PAGE, params="registerClick", method = RequestMethod.TRACE)
//    public void registerHomeClick(){
//        System.out.println("\nYou have clicked register!");
//    }


    @GetMapping("/donations")
    public String donations(){
        return "donations";
    }

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