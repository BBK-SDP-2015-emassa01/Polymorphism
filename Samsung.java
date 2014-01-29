/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Samsung extends SmartPhone{
    
    public Samsung(String brand){
        super(brand);
    }
    
     public static void testPhone(Phone newPhone){
         newPhone.call("number");
         //ON the object phone you can only call the Phone methods! Because my method only takes in 'Phone', it is upcasting, indirectly.
         
         SmartPhone temp2 = (SmartPhone) newPhone;
         //ON the object temp2, DOWNCASTED you can call the SmartPhone methods and Phone methods! Still only Phone methods available 
         temp2.browseWeb("WWW browse");
         temp2.findPosition();
         temp2.call("020 8204 3500");
         
        }
    
    public static void main(String[] args){
    
        Samsung newSamSung = new Samsung("NewSamSung");
        newSamSung.launch();
    }
    
        public void launch(){ //SmartPhone myPhone = new SmartPhone("Samsung");
        
        //Direct UPCasting To use the SmartPhone methods after having created a MobilePhone object.
    
        MobilePhone myPhone = new SmartPhone("Samsung");
        
        SmartPhone myPhoneNew = (SmartPhone) myPhone;
        //Phone anyPhone = new MobilePhone("Nokia");
        Phone anyPhone = new SmartPhone("Nokia");
                
        myPhoneNew.browseWeb("Hi Esha you're browsing the WWW");
        myPhoneNew.findPosition();
        myPhone.call("07857 837 541");
       
        testPhone(anyPhone);
        
        
         Phone MobPhone = new MobilePhone("Nok");
         testPhone(MobPhone);
         //if you call a method that is not available (e.g., SmartPhone methods, on MobilePhone) there is an error.
    }
    
}
