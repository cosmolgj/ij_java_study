package blog_lecture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncLambda {
    public static void main(String[] args) {
        ExecutorService executer = Executors.newSingleThreadExecutor();
        CompletableFuture
                .runAsync(()->{
                    try { Thread.sleep(2000); } catch (Exception e) {};
                    System.out.println("Hello~");
                    try { Thread.sleep(2000); } catch (Exception e) {};
                }, executer)
                .thenRun(()->System.out.println("World!"));

        System.out.println("Async request is ready.");
    }
}
