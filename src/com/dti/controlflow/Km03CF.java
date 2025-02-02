package com.dti.controlflow;

//break; , continue; in loop

public class Km03CF {
    
    public static void main(String[] args) {
        
        for(int i= 1; i < 6 ; i++){
            if(i==3){
                break;
            }
            System.out.println("Hello...");
        }
        
        System.out.println("------------------------------------");
        
        for(int j = 1;j<6;j++){
            if(j == 3){
                continue;
            }
            System.out.println(j + "Hmm...");
        }
    }
}
