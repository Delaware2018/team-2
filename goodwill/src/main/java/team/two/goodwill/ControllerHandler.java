package team.two.goodwill;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerHandler {
    private UserRepository repo;
   private final String HOME_PAGE = "/";
   private final String LOGIN_PAGE = "/login";
   public Service serviceI;

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
    public String registerEnd(@ModelAttribute User newBe){
        User.createUser(newBe);
        return "register_cont";
    }

    @GetMapping("/login")
    public String loginUserSetUp(Model model){
        model.addAttribute("credentials", new Credentials());
        return "login";
    }


    @PostMapping("/login")
    public String loginUser(){

        return "home";
    }


}