/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.demoMVC.controller;

import knu.fit.ist.demoMVC.Entity.Lab2;
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
    
    
    @GetMapping("/lab2")
    public String lab2(Model model){
    
        String result="lab2result";
                
        model.addAttribute("result",result);
        
        Lab2 lab2 = new Lab2();
        
        lab2.setFieldInt(10);
        lab2.setFieldString("string field");
        
        
        model.addAttribute("lab2", lab2);
        
    return "lab2";
    }
    
}
