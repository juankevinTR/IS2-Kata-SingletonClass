package com.juankevintrujillo;

import java.util.ArrayList;

/**
 *
 * @author juankevintr
 */
public class Main {

    public static void main(String[] args) {
	
	// Version 1
	/*
            SingletonClass my_SC_0 = SingletonClass.getInstance();
            SingletonClass my_SC_1 = SingletonClass.getInstance();

            System.out.println("HasCode my_SC_0: " + my_SC_0.hashCode());
            System.out.println("HasCode my_SC_1: " + my_SC_1.hashCode());
	 */
	// Version 2
	int number_threads = 10;
	ArrayList<IThread> my_threads = new ArrayList<>();

	for (int v_i = 0; v_i < number_threads; v_i++) {
	    my_threads.add(new IThread(v_i));
	}

	for (IThread my_thread : my_threads) {
	    my_thread.start();
	}

	for (IThread my_thread : my_threads) {
	    System.out.println("[" + my_thread.ID + "]:" + my_thread.getHashCode());
	}

    }

}
