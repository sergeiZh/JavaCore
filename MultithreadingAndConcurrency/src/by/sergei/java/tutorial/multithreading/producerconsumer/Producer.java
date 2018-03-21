package by.sergei.java.tutorial.multithreading.producerconsumer;

import java.util.concurrent.Callable;

public class Producer implements Callable<String> {
    
    private SharedResource sharedResource;
    private int countAmount;
    
    public Producer(SharedResource sharedResource, int countAmount){
        this.sharedResource = sharedResource;
        this.countAmount = countAmount;
    }

    @Override
    public String call() throws Exception {
        for(int i=0; i<countAmount; i++){
            Thread.sleep(1000);
            sharedResource.incrementSharedResource();
            System.out.println("Producer incremented shared resource");
        }
        return "Producer job is done. He can go home";
    }

}
