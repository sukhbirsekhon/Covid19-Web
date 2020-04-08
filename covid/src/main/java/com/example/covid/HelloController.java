package com.example.covid;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.net.BindException;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return "index";
    }

    @RequestMapping("/next")
    public String next(Map<String, Object> model) {
        model.put("message", "You are in new page !!");
        return "next";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView exception2()
    {
        ModelAndView modelAndview = new ModelAndView("index.jsp");

        return modelAndview;
    }


}