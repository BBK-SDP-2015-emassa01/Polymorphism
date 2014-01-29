/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Comparator {

public int getMax(int n, int m) {
    
    return (int) getMax((double) n, (double) m);
    
} 

public double getMax(double d1, double d2) { 
            if (d1 > d2) {
            return d1;
            } else {
           return d2; 
            }
}


public String getMax(String number1, String number2) {
    int n1 = Integer.parseInt(number1); 
    int n2 = Integer.parseInt(number2); 
    
   //int result = getMax(n1, n2);
   // return Integer.toString(result);
   return Integer.toString(getMax(n1, n2));
}
}


