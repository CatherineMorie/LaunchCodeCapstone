package org.launchcode.LaunchCodeCapstone.controllers;

import org.launchcode.LaunchCodeCapstone.models.Job;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class HomeController {
    static HashMap<Integer, Job> jobs;

    public HomeController() {
        jobs = new HashMap<>();
        jobs.put(1, new Job("01/31/2019", "ABC, Co.", "Software Engineer " +
                "Extraordinaire", "12345-R", 999999, "accepted"));
        jobs.put(2, new Job("02/15/2019", "XYZ, Inc.", "Java Developer",
                "54487-BR", 200015, "applied"));
    }

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

    @RequestMapping(value="/search")
    public String loadSearchPage() {
        return "search.html";
    }

}
