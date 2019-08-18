package org.launchcode.LaunchCodeCapstone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value="")
    public String loadHomePage() {
        return "homepage.html";
    }

    @RequestMapping(value="/about")
    public String loadIndexPage() {
        return "index.html";
    }

    @RequestMapping(value="/new")
    public String loadNewJobPage() {
        return "jobNew.html";
    }

}
