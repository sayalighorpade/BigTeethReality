package com.BigTeethTv.Reality.contoller;

import java.util.List;

import com.BigTeethTv.Reality.entity.Application;
import com.BigTeethTv.Reality.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    // @RequestMapping(method= RequestMethod.GET)
    //  @GetMapping("/list")
    public String listApplicant(Model theModel) {
        List <Application> applicants = applicationService.getAllApplicant();
        theModel.addAttribute("applications", applicants);
        return "list-Applicants";
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    // @RequestMapping(method= RequestMethod.GET)
    //  @GetMapping("/list")
    public String searchApplicant(@RequestParam("form1") String text, Model theModel) {
        //applicationService.deleteApplicant(theId);
        List <Application> applicants = applicationService.getAllApplicant(text);

        theModel.addAttribute("applications", applicants);
        return "list-Applicants";
    }



    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    //@RequestMapping(method=RequestMethod.GET)
    // @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Application application = new Application();
        theModel.addAttribute("application", application);
        return "application_form";
    }
    @RequestMapping(value = "/saveApplicant", method = RequestMethod.POST)
    //@PostMapping("/saveCustomer")
    public String saveApplicant(@ModelAttribute("application") Application theapplicant) {
        applicationService.saveApplicationForm(theapplicant);
        return "redirect:/application/list";
    }
    @RequestMapping(value = "/updateForm", method = RequestMethod.GET)
    //@GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("app_id") int theId,
                                    Model theModel) {
        Application application = applicationService.getApplicant(theId);
        theModel.addAttribute("application", application);
        return "application_form";
    }
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    //@GetMapping("/delete")
    public String deleteCustomer(@RequestParam("app_id") int theId) {
        applicationService.deleteApplicant(theId);
        return "redirect:/application/list";
    }
}
