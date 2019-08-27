package org.launchcode.LaunchCodeCapstone.controllers;

import org.launchcode.LaunchCodeCapstone.dao.JobDAO;
import org.launchcode.LaunchCodeCapstone.models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class HomeController {

    @Autowired
    private JobDAO jobDAO;


    @RequestMapping(value="", method=GET)
    public String loadHomePage(Model model) {
        List<Job> jobs = jobDAO.getAll();
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
    public String saveAddedJob(Model model, @RequestParam String dateApplied, @RequestParam String companyName,
                               @RequestParam String jobTitle, @RequestParam String jobReqNumber, @RequestParam
                               int salary, @RequestParam String jobStatus, @RequestParam String jobDescription) {

        model.addAttribute("dateApplied", dateApplied);
        model.addAttribute("companyName", companyName);
        model.addAttribute("jobTitle", jobTitle);
        model.addAttribute("jobReqNumber", jobReqNumber);
        model.addAttribute("salary", salary);
        model.addAttribute("jobStatus", jobStatus);
        model.addAttribute("jobDescription", jobDescription);

        System.out.println("SAVED IT!..." + companyName + " " + jobReqNumber);

        jobDAO.addJob(new Job(-1, dateApplied, companyName, jobTitle, jobReqNumber, salary, jobStatus, jobDescription));

        return confirmSavedJob(model);
    }

    @RequestMapping(value="/addJob", method= GET)
    public String confirmSavedJob(Model model) {
        List<Job> jobs = jobDAO.getAll();
        model.addAttribute("jobs", jobs);
        model.addAttribute("count", jobs.size());

        return "result.html";
    }

    @RequestMapping(value="/edit/{id}", method=GET)
    public String viewJob(Model model, @PathVariable int id) {
        Job job = jobDAO.findById(id);
        model.addAttribute("job", job);

        return "job.html";
    }

    @RequestMapping(value="/edit/{id}", method=POST)
    public String editJob(@ModelAttribute Job job, @PathVariable int id) {
        jobDAO.updateJob(id, job);
        return "redirect:/";
    }
}
