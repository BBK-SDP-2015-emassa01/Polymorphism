/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class DoubleLinkedListG<T> {
    private int value;
    DoubleLinkedListG<T> item;
    DoubleLinkedListG<T> head;
    DoubleLinkedListG<T> next;
    DoubleLinkedListG<T> previous;
    
    public DoubleLinkedListG(DoubleLinkedListG<T> item, int value){
          this.value = value;
          this.item = item;
    }
     
    public void AddFirstDoubleLinkedList(DoubleLinkedListG<T> item){
   
            this.head = item;
            this.next = item;
            this.previous = item;
            
            item.next = this;
            item.previous = this;
            this.printElement();
    }
    
    
    public void AddItemToLinkedList(DoubleLinkedListG<T> AnotherItem, int value){
        if (this.next == head){
            AnotherItem.next = this.next;
            AnotherItem.previous = this;
            this.next = AnotherItem;
            head.previous = AnotherItem;
            
            head = AnotherItem;
            this.printElement();
            
        } else {this.next.AddItemToLinkedList(item, value);
        this.printElement();
        
        }
    
    }
    
    public void printElement(){
    System.out.println("\t value: "+this.value);
    System.out.println("\t item: "+this.item);
    System.out.println("\t head: "+this.head);
//    System.out.println("\t this.next: "+this.next);
    System.out.println("\t previous: "+previous);
}
    
}
