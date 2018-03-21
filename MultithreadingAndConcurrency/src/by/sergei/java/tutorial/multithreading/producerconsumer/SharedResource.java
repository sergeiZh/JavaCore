package by.sergei.java.tutorial.multithreading.producerconsumer;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    
    private AtomicInteger sharedResourceCounter = new AtomicInteger();

    public AtomicInteger getSharedResourceCounter() {
        return sharedResourceCounter;
    }

    public void incrementSharedResource() {
        sharedResourceCounter.getAndIncrement();
        System.out.println("Shared resource incremented. Current value is " + sharedResourceCounter.get());
    }
    
    public void descrementSharedResource(){
        sharedResourceCounter.getAndDecrement();
        System.out.println("Shard resource decremented. Current value is " + sharedResourceCounter.get());
    }

}
