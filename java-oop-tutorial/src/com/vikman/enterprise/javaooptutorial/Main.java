package com.vikman.enterprise.javaooptutorial;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running on worker thread");
                for(int i=0; i<10; i++){
                    System.out.println(i+ " loop in a worker thread");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();

        for(int i=0; i<10; i++){
            System.out.println(i+ " loop in a main thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
