package by.sergei.java.tutorial.multithreading.producerconsumer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ProducerConsumerRunner {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        SharedResource sharedResource = new SharedResource();
        Producer producer = new Producer(sharedResource, 6);
        Consumer consumer = new Consumer(sharedResource, 10);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        Future<String> producerResult = newFixedThreadPool.submit(producer);
        Future<String> consumerResult = newFixedThreadPool.submit(consumer);
        
        newFixedThreadPool.shutdown();
        System.out.println("Producer work result " + producerResult.get());
        System.out.println("Consumer work result " + consumerResult.get());
        
        
    }

}
