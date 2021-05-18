/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.demoMVC;

import knu.fit.ist.demoMVC.Lab2.Lab2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author 38068
 */
@SpringBootTest
public class Lab2Tests {

    @Autowired
    Lab2 lab2;

    @Test
    void calculateTest1() {
        assertEquals(0, lab2.calculate(1), 0.01);

    }

    @Test
    void calculateTest2() {
        assertEquals(Integer.MAX_VALUE, lab2.calculate(-1), 1);

    }
    
    
     @Test
    void calculateTest3(){    
    assertEquals(Integer.MAX_VALUE, lab2.calculate(5), 1);
        
    }
    
    @Test
    void calculateTest4() {
        assertEquals(0.3, lab2.calculate(8), 0.01);

    }

}
