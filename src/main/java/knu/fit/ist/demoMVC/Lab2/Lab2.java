/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.demoMVC.Lab2;

import org.springframework.stereotype.Service;

/**
 *
 * @author 38068
 */

@Service 
public class Lab2 {

    private int x;

    public Lab2() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float calculate(float x) {

        // log(x)/(x-5)   
        if (x <= 0 || Math.abs(5 - x) <= 0.01) {
            return Integer.MAX_VALUE;
        }
        return (float) (Math.log10(x) / (x - 5));
        
        
    }

    public String showLab2Result(float x) {

        if (x <= 0) {
            return "Must be positive";
        }

        if (6 - x <= 0.01) {
            return "Division by zero";
        }

        return Float.toString(calculate(x));
    }

    @Override
    public String toString() {
        return "Lab2{" + "x=" + x + '}';
    }

}
