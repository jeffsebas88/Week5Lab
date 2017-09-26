/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.Serializable;

/**
 *
 * @author 643507
 */


   
  public class Calculator {
    
    
    public static double operate(String number1, String number2, String operation){
        double result =0.00;
        
        double n1 = Double.parseDouble(number1);
        double n2 = Double.parseDouble(number2);
        
        switch(operation){
            case "+": result = n1 + n2;
                break;
            case "-": result = n1 - n2;
                break;
            case "%": result = n1 % n2;
                break;
            case "*": result = n1 * n2;
                break;
        }
        
        return result;
    }
}