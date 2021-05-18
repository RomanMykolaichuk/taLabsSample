/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.demoMVC.controller;

import knu.fit.ist.demoMVC.Entity.Lab2Entity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author 38068
 */

@Controller
public class LabsController {
    
    @GetMapping("/lab1")
    public String lab1(Model model){
    
        String result="lab1result";
        
        model.addAttribute("result",result);
        
    return "lab1";
    }
    
    
    
    
}
