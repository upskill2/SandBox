package leetcode;

public class PrintInOrder {

    class Foo {

        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {
            printFirst.run();

        }

        public void second(Runnable printSecond) throws InterruptedException {
            printSecond.run();
        }

        public void third(Runnable printThird) throws InterruptedException {
            printThird.run();
        }

    }

    public static void main(String[] args) {

        PrintInOrder obj1 = new PrintInOrder();




        Runnable runnable1 = () -> System.out.print("First");
        Runnable runnable2 = () -> System.out.print("Second");
        Runnable runnable3 = () -> System.out.print("Third");

        Thread thread1 = new Thread(runnable1, "1");
        Thread thread2 = new Thread(runnable2, "2");
        Thread thread3 = new Thread(runnable3, "3");

        thread2.start();
        thread3.start();
        thread1.start();

    }

}
