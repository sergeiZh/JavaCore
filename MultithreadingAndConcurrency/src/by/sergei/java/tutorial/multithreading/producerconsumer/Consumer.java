package by.sergei.java.tutorial.multithreading.producerconsumer;

import java.util.concurrent.Callable;

public class Consumer implements Callable<String> {
    
    private SharedResource sharedResource;
    private int countAmount;
    
    public Consumer(SharedResource sharedResource, int countAmount){
        this.sharedResource = sharedResource;
        this.countAmount = countAmount;
    }
    
    

    @Override
    public String call() throws Exception {
        for(int i=0; i < countAmount; i++){
            Thread.sleep(2000);
            sharedResource.descrementSharedResource();
            System.out.println("Consumer decremented shared resouce");
        }
        return "Consumer done his job. He can go home";
    }

}
