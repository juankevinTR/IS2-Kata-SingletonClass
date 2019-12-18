package com.juankevintrujillo;

/**
 *
 * @author juankevintr
 */
public class IThread extends Thread {

    int ID;
    SingletonClass INSTANCE;

    public IThread(int p_ID) {
	this.ID = p_ID;
    }

    @Override
    public void run() {
	INSTANCE = SingletonClass.getInstance();
    }

    int getHashCode() {
	return INSTANCE.hashCode();
    }

}
