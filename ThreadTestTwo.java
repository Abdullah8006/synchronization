package com.appster.abdullah.util.deleteanytime;

public class ThreadTestTwo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Running thread :: main " + Thread.currentThread().getName());
        MyQueue queue = new MyQueue();

        Runnable runnableOne = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Running thread :: runnableOne " + Thread.currentThread().getName());
                String[] names = new String[] { "Abdullah", "Inam", "Fatima", "Sameera", "Amish", "Abdullah", "Inam",
                        "Fatima", "Sameera", "Amish", "Abdullah", "Inam", "Fatima", "Sameera", "Amish" };
                queue.writeName(names);
                System.out.println("Ending thread :: runnableOne " + Thread.currentThread().getName());
            }
        };
        new Thread(runnableOne).start();

        Runnable runnableTwo = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Running thread :: runnableTwo " + Thread.currentThread().getName());
                String[] names = new String[] { "Mohammad Motiullah", "Shaheda Parveen", "Shafaque warsi",
                        "Khalda warsi", "Parvez Ahmed", "Mohammad Motiullah", "Shaheda Parveen", "Shafaque warsi",
                        "Khalda warsi", "Parvez Ahmed", "Mohammad Motiullah", "Shaheda Parveen", "Shafaque warsi",
                        "Khalda warsi", "Parvez Ahmed" };
                queue.writeName(names);
                System.out.println("Ending thread :: runnableTwo " + Thread.currentThread().getName());
            }
        };
        new Thread(runnableTwo).start();

        Thread.sleep(1300);
        System.out.println("MyQueues contents " + queue.getNames());
        System.out.println("Ending thread :: main " + Thread.currentThread().getName());
    }

}
