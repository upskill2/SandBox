package leetcode;

public class PrintInOrder {


    public PrintInOrder() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        System.out.println("first");

    }

    public void second(Runnable printSecond) throws InterruptedException {
        printSecond.run();
        System.out.println("second");
    }

    public void third(Runnable printThird) throws InterruptedException {
        printThird.run();
        System.out.println("third");
    }



    public static void main(String[] args) throws InterruptedException {


        PrintInOrder obj1 = new PrintInOrder();

        Runnable runnable1 = () -> System.out.println("First");
        Runnable runnable2 = () -> System.out.println("Second");
        Runnable runnable3 = () -> System.out.println("Third");

   //     Runnable runnable1 = new  PrintInOrder().first(new Thread().start());
        Thread t1 = new Thread();

        t1.start();




/*
        Thread t2 = new Thread(obj1);

        t2.start();
        obj1.second(t1);
        obj1.first(t2);
*/


/*        Thread t2 = new Thread();
        obj1.second(t2);

        Thread t3 = new Thread();
        obj1.third(t3);*/



/*        t1.start();
        t2.start();
        t3.start();*/

/*      Runnable runnable1 = () -> System.out.println("First");
        Runnable runnable2 = () -> System.out.println("Second");
        Runnable runnable3 = () -> System.out.println("Third");
        Thread thread1 = new Thread(runnable1, "1");
        Thread thread2 = new Thread(runnable2, "2");
        Thread thread3 = new Thread(runnable3, "3");
        thread2.start();
        thread3.start();
        thread1.start();*/
    }
}



