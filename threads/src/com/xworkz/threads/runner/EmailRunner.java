package com.xworkz.threads.runner;

import com.xworkz.threads.runnable.EmailRunnable;

public class EmailRunner {

    public static void main(String[] args) {

        EmailRunnable emailRunnable=new EmailRunnable();

        Thread thread=new Thread(emailRunnable,"email Thread");
        System.out.println(Thread.currentThread().getName());
        thread.start();
        System.out.println(Thread.activeCount());

        System.out.println(thread.getName());

//        System.out.println(thread.getThreadGroup());

    }
}
