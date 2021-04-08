package com.mjm.part3.bridge.geekdemo;


public class Client {

    public static void main(String[] args) {

        ApplicationContext context = ApplicationContext.getInstance();
        Alert alert = context.getAlert();

        ApiStateInfo stateInfo = new ApiStateInfo();
        stateInfo.setApi("/test");
        stateInfo.setRequestCount(1000L);
        stateInfo.setErrorCount(500L);


        alert.check(stateInfo);

    }
}
