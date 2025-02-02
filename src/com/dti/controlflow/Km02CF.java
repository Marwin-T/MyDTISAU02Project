package com.dti.controlflow;

//Control Flow Loop (while,do while,for) 

public class Km02CF {
    
    public static void main(String[] args) {
        
        int a = 1;
        while(a < 6){
            System.out.println("Hello....");
            a++;
        }
        
        //--------------------------------------------
        
        int b = 1;
        do{
            System.out.println("Hi....");
            b++;
        }while(b < 6);
        
        //--------------------------------------------
        
        for(int c = 1; c < 6 ; c++){
            System.out.println("Hey...");
        }
        
    }
    
}
