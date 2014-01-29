/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class DoubleCircleG {
    
    public static void main(String[] args){
        DoubleLinkedListG Esha = null;
        DoubleLinkedListG Manoj = null;
        
        DoubleLinkedListG newCircleDoubleList = new DoubleLinkedListG(Esha, 27);
        newCircleDoubleList.printElement();
        
        DoubleLinkedListG CircleDoubleList = new DoubleLinkedListG(Manoj, 26);
        newCircleDoubleList.AddFirstDoubleLinkedList(CircleDoubleList);
        
        newCircleDoubleList.printElement();
        CircleDoubleList.printElement();
    
    
    
    }
    
}
