package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    String showHome(Model model){

        String cssFiles[] = {"fullcalendar.min.css"};
        String jsFiles[] = {"moment.min.js","fullcalendar.min.js"};



        model.addAttribute("cssFiles", cssFiles);
        model.addAttribute("jsFiles", jsFiles);
        return "home";
    }
}
