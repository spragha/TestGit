package com.raghav.corejava.thread;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalDemo {
    // Atomic integer containing the next thread ID to be assigned
    private static final AtomicInteger nextId = new AtomicInteger(0);

    // Thread local variable containing each thread's ID
    private static final ThreadLocal threadId =
        new ThreadLocal() {
            @Override protected Integer initialValue() {
                return nextId.getAndIncrement();
        }
    };

    // Returns the current thread's unique ID, assigning it if necessary
    public static int get() {
        return (Integer) threadId.get();
    }
}