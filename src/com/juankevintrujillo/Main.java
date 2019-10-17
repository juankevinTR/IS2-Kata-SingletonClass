package com.juankevintrujillo;

/**
 *
 * @author juankevintr
 */
public class Main {

    public static void main(String[] args) {
        
        SingletonClass my_SC_0 = SingletonClass.getInstance();
        SingletonClass my_SC_1 = SingletonClass.getInstance();
        
        System.out.println("HasCode my_SC_0: " + my_SC_0.hashCode());
        System.out.println("HasCode my_SC_1: " + my_SC_1.hashCode());
        
    }
    
}
