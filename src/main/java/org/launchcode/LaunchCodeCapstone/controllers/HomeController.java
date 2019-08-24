package org.launchcode.LaunchCodeCapstone.controllers;

import dao.JobDAO;
import org.launchcode.LaunchCodeCapstone.models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.AttributedString;
import java.util.Date;
import java.util.HashMap;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class HomeController {
    static HashMap<Integer, Job> jobs;

    @Autowired
    JobDAO jobDAO;

    public HomeController() {
        for (Job b : jobDAO.getAll()) {
            jobs.put(b.getId(), b);
        }
    }
    /*public HomeController() {
        jobs = new HashMap<Integer, Job>();
        jobs.put(1, new Job("2019-01-31", "ABC, Co.", "Software Engineer " +
                "Extraordinaire", "12345-R", 999999, "accepted"));
        jobs.put(2, new Job("02/15/2019", "XYZ, Inc.", "Java Developer",
                "54487-BR", 200015, "applied"));
    }*/

    @RequestMapping(value="", method=GET)
    public String loadHomePage(Model model) {
        model.addAttribute("jobs", jobs);
        model.addAttribute("count", jobs.size());
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

    @RequestMapping(value="/addJob", method= POST)
    public String saveAddedJob(Model model, @RequestParam int id, @RequestParam String dateApplied, @RequestParam String companyName,
                               @RequestParam String jobTitle, @RequestParam String jobReqNumber, @RequestParam
                               int salary, @RequestParam String jobStatus) {
        model.addAttribute("id", id);
        model.addAttribute("dateApplied", dateApplied);
        model.addAttribute("companyName", companyName);
        model.addAttribute("jobTitle", jobTitle);
        model.addAttribute("jobReqNumber", jobReqNumber);
        model.addAttribute("salary", salary);
        model.addAttribute("jobStatus", jobStatus);

        jobs.put((jobs.size()+1), new Job(id, dateApplied, companyName, jobTitle, jobReqNumber, salary, jobStatus));

        System.out.println("SAVED IT!...");

        return confirmSavedJob(model);
    }

    @RequestMapping(value="/addJob", method= GET)
    public String confirmSavedJob(Model model) {
        model.addAttribute("jobs", jobs);
        model.addAttribute("count", jobs.size());

        return "result.html";
    }
}
