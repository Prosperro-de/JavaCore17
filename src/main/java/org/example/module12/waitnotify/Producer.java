package org.example.module12.waitnotify;

public class Producer extends Thread {
    private Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        int item = 0;
        while (true) {
            try {
                resource.produce(item++);
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
