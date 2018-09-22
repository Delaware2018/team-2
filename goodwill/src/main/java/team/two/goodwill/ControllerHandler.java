package team.two.goodwill;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerHandler {

   private final String HOME_PAGE = "/";
   private final String LOGIN_PAGE = "/login";


    //Home Page
    @GetMapping("/")
    public String homePageRequest(@RequestParam(name="name", required=false, defaultValue="World") String greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "home";
    }


//    @RequestMapping(value=HOME_PAGE, method= RequestMethod.POST)
//    public ModelAndView loginHomeClick(@ModelAttribute User modelatt,@RequestParam(value="homeOption", required=true) String action){
//
//        System.out.println("\nYou have clicked login");
//    }

//    @RequestMapping(value=HOME_PAGE, params="registerClick", method = RequestMethod.TRACE)
//    public void registerHomeClick(){
//        System.out.println("\nYou have clicked register!");
//    }


    @GetMapping("/register")
    public String registration() {
//        model.addAttribute("name", name);
        return "register";
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