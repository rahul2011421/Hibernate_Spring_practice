package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping("/home")
//    @RequestMapping(path = "/home",method = RequestMethod.GET)
    public String home() {
        System.out.println("I'm inside /home page");
        return "index";
    }
    @RequestMapping("/about")
    public String about(){
        System.out.println("inside about page");
        return "about";
    }
}
