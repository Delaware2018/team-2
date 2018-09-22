package team.two.goodwill;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerHandler {
    private UserRepository repo;
   private final String HOME_PAGE = "/";

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


    //Register
    @GetMapping("/register")
    public String loadRegister(Model model){
        model.addAttribute("newBe", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerEnd(@ModelAttribute User newBe){
        User.createUser(newBe);
        return "register_cont";
    }

    //2nd Page of registration
    @GetMapping("/register_cont")
    public String registration_cont(Model model) {
        model.addAttribute("credentials", new Credentials());
        return "register_cont";
    }
    @PostMapping("/register_cont")
    public String registration_contEnd(@ModelAttribute Credentials credential){
        if(Credentials.isValid(credential)) {
            Credentials.create(credential);
            return "home";
        }
        else
            return "register_cont";
    }

    //Login processes
    @GetMapping("/login")
    public String loginUserSetUp(Model model){
        model.addAttribute("credentials", new Credentials());
        return "login";
    }
    @PostMapping("/login")
    public String loginUser(@ModelAttribute Credentials credential){
        if(Credentials.isUser(credential))
            return "donate";
        else
            return "home";
    }


    @GetMapping("/donations")
    public String donations(){
        return "donations";
    }





}