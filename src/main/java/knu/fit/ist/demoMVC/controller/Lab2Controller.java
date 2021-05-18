/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.demoMVC.controller;

import knu.fit.ist.demoMVC.Lab2.Lab2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author 38068
 */

@Controller
public class Lab2Controller {
    
    @Autowired
    Lab2 lab2;
    
    @GetMapping("/lab2")
    public String lab2(Model model){
                   
    return "lab2";
    }
    
    @GetMapping("/lab2result")
    public String lab2result(@RequestParam("x") float x, Model model){
    
       String result = lab2.showLab2Result(x);
        
       model.addAttribute("result",result);
       model.addAttribute("x",x);
        
    return "lab2result";
    }
    
    
    
}
