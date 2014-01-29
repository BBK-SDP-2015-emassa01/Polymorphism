/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class MobilePhone extends OldPhone{
    
    public MobilePhone(String brand){
        super(brand);
       // System.out.println(super.getBrand()); // commented this out because remember, the method calls the super, so why do it here?!
    }
    
    private static final String numberDialled1 = "0123456789";
    private static final String numberDialled2 = "1234567891";
    private static final String numberDialled3 = "2345678901";
    private static final String numberDialled4 = "3456789012";
    private static final String numberDialled5 = "4567890123";
    private static final String numberDialled6 = "5678901234";
    private static final String numberDialled7 = "6789012345";
    private static final String numberDialled8 = "7890123456";
    private static final String numberDialled9 = "8901234567";
    private static final String numberDialled10 ="9012345678";
    
    
    public void ringAlarm(String message){
        System.out.println("Wake up! " + message);
    }
    
    public void playGame(String game){
        System.out.println("Loading game... " + game);
    }
    
    public void printLastNumbers(){
        System.out.println("Last dialled numbers: "
                + "\n" + numberDialled1
                + "\n" + numberDialled2
                + "\n" + numberDialled3
                + "\n" + numberDialled4
                + "\n" + numberDialled5
                + "\n" + numberDialled6
                + "\n" + numberDialled7
                + "\n" + numberDialled8
                + "\n" + numberDialled9
                + "\n" + numberDialled10);
        
    }
    
        
        

}
