
package com.mycompany.amstechconstructionbasic;


public class Operation {
    
    public static double totalPrice(double area , int type)
    {
        if(type==1)
        {
         return area * Rate.plotRate;
        }
        else if(type==2)
        {
         return area * Rate.officeRate;
        }
        else if(type==3)
        {   
          return area * Rate.flatRate;
        }
        return -1;    
    }
    
    public static double totalRegistryCharges(double totalPrice )
    {
       return totalPrice * Rate.registryCharge; 
    }
     public static double totalGreenTax(double totalPrice )
    {
       return totalPrice * Rate.greenTax; 
    }
    public static double finalCost(double totalPrice ,int type)
    {
        return Operation.totalPrice(totalPrice, type) + Operation.totalRegistryCharges(totalPrice)+Operation.totalGreenTax(totalPrice)+Rate.socityDevelopmentTax;
    }
    
}
