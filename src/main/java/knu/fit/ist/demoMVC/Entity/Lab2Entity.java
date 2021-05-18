/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.demoMVC.Entity;

/**
 *
 * @author 38068
 */
public class Lab2Entity {
    
    private int fieldInt;
    private String fieldString;

    public Lab2Entity() {
    }

    public int getFieldInt() {
        return fieldInt;
    }

    public void setFieldInt(int fieldInt) {
        this.fieldInt = fieldInt;
    }

    public String getFieldString() {
        return fieldString;
    }

    public void setFieldString(String fieldString) {
        this.fieldString = fieldString;
    }

    @Override
    public String toString() {
        return "Lab2{" + "fieldInt=" + fieldInt + ", fieldString=" + fieldString + '}';
    }
    
    
    
}
