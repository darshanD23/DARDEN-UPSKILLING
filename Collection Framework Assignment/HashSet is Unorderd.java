//HashSet is Unorderd

import java.util.HashSet;  
import java.util.Iterator;  
public class HashSetDemo {  
     public static void main(String args[]){    
        HashSet<String> h=new HashSet();    
               h.add("Apple");     
               h.add("Banana");      
               h.add("Cat");     
               h.add("Dog");    
               h.add("Elephant");  
               Iterator<String> i=h.iterator();    
               while(i.hasNext())   
               {    
               System.out.println(i.next());   
               }    
     }    
}  


// Linked hashset is orderd

import java.util.Iterator;  
import java.util.LinkedHashSet;  
  
public class LinkedHashSetDemo {   
     public static void main(String args[]){    
            LinkedHashSet<String> lh=new LinkedHashSet();      
                   lh.add("A");      
                   lh.add("B");      
                   lh.add("C");     
                   lh.add("D");    
                   lh.add("E");    
                   Iterator<String> i=lh.iterator();   
                   while(i.hasNext())     
                   {    
                   System.out.println(i.next());     
                   }    
     }    
    }   