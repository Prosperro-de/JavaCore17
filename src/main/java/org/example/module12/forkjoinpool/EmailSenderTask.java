package org.example.module12.forkjoinpool;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class EmailSenderTask extends RecursiveAction {

    private List<String> emails;

    public EmailSenderTask(List<String> emails) {
        this.emails = emails;
    }

    @Override
    protected void compute() {
        if (emails.size() == 1) {
            sendEmail(emails.get(0));
            return;
        }
        int middleIndex = emails.size() / 2;
        EmailSenderTask left = new EmailSenderTask(emails.subList(0, middleIndex));
        EmailSenderTask right = new EmailSenderTask(emails.subList(middleIndex, emails.size()));
        invokeAll(left, right);
    }
    void sendEmail(String email) {
//        try {
//            Thread.sleep(400L);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Thread name " + Thread.currentThread().getName());
        System.out.println("Sending email to " + email);
    }
}
