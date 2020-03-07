package io.github.svagtlys.drystan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping("")
    public String displayHomePage(Model model){
        model.addAttribute("title", "Home");
        return "index";
    }

    @GetMapping("page2")
    public String displayPage2(Model model){
        model.addAttribute("title", "Page 2");
        return "index";
    }

    @GetMapping("page3")
    public String displayPage3(Model model){
        model.addAttribute("title", "Page 3");
        return "index";
    }

}
