/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.mid;
/*
 * Lab Midterm Project
 * Author: Amro Al-Hamdan
 * First-year Software Engineering student
 * Description:
 * - Solving mathematical expressions using random values
 * - Calculating total bill including tax and tip using user input
 * Score: 30/30
 */
import java.util.Scanner;
public class LabMid {

   
    
    public static void main(String[] args) {
      
       //Q 1
        //the program below solves an expression
        int x = (int)(0+Math.random()*(20-0));
        int y = (int)(0+Math.random()*(20-0));
        
        double n = Math.abs(Math.pow(x,3)-y*Math.sqrt(Math.pow(y,2))-Math.sqrt(Math.pow(x,2)));
        double d = Math.pow((Math.pow(x,2)/Math.pow(y,2)-10*y),3);
        double z = Math.sqrt(10*Math.pow(x,2))-(n/d);
            System.out.println("z = "+z);
            System.out.println("y = "+y);     
            System.out.println("x = "+x);
            
        //Q 2   
        // This program counts The total bill
        Scanner in = new Scanner (System.in);
            System.out.println("Please enter the food cost");
        double FoodCost = in.nextDouble();
            System.out.println("Please enter the Tax percentage");
        double TaxPercentage = in.nextDouble();
            System.out.println("Please enter the Tip percentage");
        double TipPercentage = in.nextDouble();
        
        double TaxAmount = (TaxPercentage/100)*FoodCost;
        double Subtotal = FoodCost+TaxAmount;  
        double TipAmount = (TipPercentage/100)*Subtotal;
        double TotalBill = Subtotal + TipAmount; 
        
            System.out.println("Tax Amount= "+TaxAmount);
            System.out.println("Subtotal= "+Subtotal);
            System.out.println("Tip Amount= "+TipAmount);
            System.out.println("TOTAL BILL= "+Math.round(TotalBill));
           
    }
    
}
