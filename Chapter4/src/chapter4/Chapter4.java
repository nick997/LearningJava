/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter4;
import static java.lang.Math.*;

/**
 *
 * @author nbourne
 */
public class Chapter4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Exercise 1:");
        System.out.println("-----------");
        
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        float[] temperature = new float[12];
        float average_temp = 0;
        
        for (int i = 0; i < 12; i++)
        {
            temperature[i] = (float)Math.round(100*Math.random()*10)/10;
            
            average_temp = average_temp + temperature[i];
            System.out.println("Month " + (i+1) + " is " + months[i] + ". Average Temperature is " + temperature[i]);
        }
        average_temp = average_temp/12;
        System.out.println("Average temperature for the year is " + (float)Math.round(average_temp*10)/10);
        
        
        System.out.println("Exercise 2:");        
        System.out.println("-----------");


        System.out.println("Exercise 3:");        
        System.out.println("-----------");


        System.out.println("Exercise 4:");        
        System.out.println("-----------");


        System.out.println("Exercise 5:");        
        System.out.println("-----------");
        
    }
    
}
