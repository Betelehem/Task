package mum.edu.cs425.wakandarepublic.wakandarepublicdemo.controller;

import mum.edu.cs425.wakandarepublic.wakandarepublicdemo.domin.Citizen;
import mum.edu.cs425.wakandarepublic.wakandarepublicdemo.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CitizenController {
    @Autowired
    private CitizenService citizenService;

    @GetMapping("/newCitizen")
    public String newPatient(Model model){
        model.addAttribute("citizen",new Citizen());
        return "newCitizen";
    }

    @PostMapping("/newCitizen")
    public String newPatient( @ModelAttribute("citizen") Citizen citizen, BindingResult result){
        System.out.println(citizen);
        /*if(result.hasErrors()){
            return "newCitizen";
        }*/
        citizenService.save(citizen);

        return "redirect:/listCitizen";

    }

    @GetMapping("/listCitizen")
    public ModelAndView listPatient(){
        List<Citizen> citizens=citizenService.orderbyAsc();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("citizen", citizens);
        modelAndView.addObject("computeyearly", citizenService.computeyearly());
        modelAndView.setViewName("list");

        return modelAndView;
    }




}
