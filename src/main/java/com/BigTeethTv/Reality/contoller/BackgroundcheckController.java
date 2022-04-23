package com.BigTeethTv.Reality.contoller;

import com.BigTeethTv.Reality.entity.Application;
import com.BigTeethTv.Reality.entity.Backgroundcheck;
import com.BigTeethTv.Reality.service.ApplicationService;
import com.BigTeethTv.Reality.service.BackgroundcheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/background")
public class BackgroundcheckController {
    @Autowired
    private BackgroundcheckService backgroundcheckService;

    @RequestMapping(value = "/Backgroundlist", method = RequestMethod.GET)
    // @RequestMapping(method= RequestMethod.GET)
    //  @GetMapping("/list")
    public String listApplicant(Model theModel) {
        List<Backgroundcheck> backgroundcheck = backgroundcheckService.getAllBackground();
        theModel.addAttribute("background", backgroundcheck);
        return "list-Background";
    }
   /* @RequestMapping(value = "/", method = RequestMethod.GET)
    // @RequestMapping(method= RequestMethod.GET)
    //  @GetMapping("/list")
    public String searchApplicant(@RequestParam("form1") String text, Model theModel) {
        //applicationService.deleteApplicant(theId);
        List <Backgroundcheck> applicants = backgroundcheckService.get(text);

        theModel.addAttribute("applications", applicants);
        return "list-Applicants";
    }*/


    @RequestMapping(value = "/showBackgroundForm", method = RequestMethod.GET)
    //@RequestMapping(method=RequestMethod.GET)
    // @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Backgroundcheck backgroundcheck = new Backgroundcheck();
        theModel.addAttribute("background", backgroundcheck);
        return "BackgroundCheck";
    }

    @RequestMapping(value = "/saveBackground", method = RequestMethod.POST)
    //@PostMapping("/saveCustomer")
    public String saveApplicant(@ModelAttribute("background") Backgroundcheck backgroundcheck) {
        backgroundcheckService.saveBackground(backgroundcheck);
        return "redirect:/background/Backgroundlist";
    }

    @RequestMapping(value = "/updateBackground", method = RequestMethod.GET)
    public String showFormForUpdate(@RequestParam("national_id") int theId,
                                    Model theModel) {
        Backgroundcheck backgroundcheck = backgroundcheckService.getAllBackground().get(theId);
        theModel.addAttribute("background", backgroundcheck);
        return "list-Background";
    }

    @RequestMapping(value = "/deletebackground", method = RequestMethod.GET)
    //@GetMapping("/delete")
    public String deleteCustomer(@RequestParam("national_id") int theId) {
        backgroundcheckService.deleteBackground(theId);
        return "redirect:/background/Backgroundlist";
    }
}
