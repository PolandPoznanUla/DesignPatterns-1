package com.szymon.chain;

/**
 * Created by Szymon on 2017-06-02.
 */
public class Application {
    public static void main(String[] args) {
        EmergencyChain emergencyChain = new EmergencyChain();
        emergencyChain.invoke(998);
        emergencyChain.invoke(999);
        emergencyChain.invoke(997);
        emergencyChain.invoke(9970);
    }
}
