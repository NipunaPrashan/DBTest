///**
// * This class represents a Test class.
// */
//public class Test {
//    public static void main(String args[]) {
//
//        String text = "abcdefghij";
//
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < text.length(); i += 3) {
//                    System.out.println("Thread " + Thread.currentThread().getName() + " Char " + text.charAt(i % 3));
//                }
//            }
//        }, "t1");
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < text.length(); i += 3) {
//                    System.out.println("Thread " + Thread.currentThread().getName() + " Char " + text.charAt((i % 3) + 1));
//                }
//            }
//        }, "t2");
//        Thread t3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < text.length(); i += 3) {
//                    System.out.println("Thread " + Thread.currentThread().getName() + " Char " + text.charAt((i % 3) + 2));
//                }
//            }
//        }, "t3");
//
//        try {
//            t1.start();
//            t2.start();
//            t3.start();
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            System.out.println("InterruptedException");
//        }
//
//        System.out.println("Hello World!!!");
//    }
//}
