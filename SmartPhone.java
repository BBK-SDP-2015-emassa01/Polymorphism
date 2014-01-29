/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class SmartPhone extends MobilePhone{
    
    public SmartPhone(String brand){
        super(brand);
    }
     
    /**
    *public void playGame(String game){
    *System.out.println("Loading game... " + game);
    *}
    */
     
    public void browseWeb(String message){
        System.out.println("Connected to enable web browsing on the www... ");
        System.out.println(message);
    }
    
    public String findPosition(){
        String position = "GPS: 198.168.1.10.10.51";
        return position;
    }
    
    public void call(String number){
        super.call(number);
        String num = number.substring(0,2);
        if (num.equals("00")){
        System.out.println("Calling "+ number +" though the internet to save money. ");
    }
    
    
}
}
