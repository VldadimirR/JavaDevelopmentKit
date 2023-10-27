
package org.example.seminar_5.task2;

    public class WaitNotifyApp {
        private final Object mon = new Object();
        private boolean flag = true;

        public static void main(String[] args) {
            WaitNotifyApp waitNotifyApp = new WaitNotifyApp();
            new Thread(() -> {
                waitNotifyApp.printA();
            }).start();
            new Thread(() -> {
                waitNotifyApp.printB();
            }).start();
        }

        public void printA() {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (!flag) {
                            mon.wait();
                        }
                        System.out.print("true");
                        flag = false;
                        mon.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printB() {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (flag) {
                            mon.wait();
                        }
                        System.out.print("false");
                        flag = true;
                        mon.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }}
