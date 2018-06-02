package com.springmvc.action;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyAction {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        //the return value means the name of jsp page
        return "/hello";
    }
}
