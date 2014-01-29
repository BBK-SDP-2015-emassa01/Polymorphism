/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class OldPhone implements Phone{
    
    private String brand = null;
    
    public OldPhone(String brand){
        this.brand = brand;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void call(String number){
        System.out.println("Calling number: " + number);
    }
}
