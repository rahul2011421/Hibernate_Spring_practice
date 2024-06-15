package org.rahul.springboot.devtools;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/test")
    @ResponseBody
    public String add(){
        int a=45;
        int b=3;
        int c=12;
        return "summation of a,b and c is : " + (a+b+c);
    }
}
