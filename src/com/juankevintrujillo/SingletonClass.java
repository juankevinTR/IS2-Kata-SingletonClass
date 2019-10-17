package com.juankevintrujillo;

/**
 *
 * @author juankevintr
 */
public class SingletonClass {
    
    private static SingletonClass INSTANCE;
    
    private SingletonClass(){
        
    }
    
    public static SingletonClass getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SingletonClass();
        }
        return INSTANCE;
    }
    
}
