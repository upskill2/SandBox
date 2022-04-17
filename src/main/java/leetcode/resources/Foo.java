package leetcode.resources;

import java.util.concurrent.atomic.AtomicInteger;


class Foo {

    private AtomicInteger order = new AtomicInteger(1);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (this) {
            for (; order.get() != 1; ) {
                try {
                    wait(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            printFirst.run();
            order.incrementAndGet();
            notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (this) {
            for (; order.get() != 2; ) {
                try {
                    wait(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            printSecond.run();
            order.incrementAndGet();
            notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (this) {
            for (; order.get() != 3; ) {
                try {
                    wait(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            printThird.run();
            order.incrementAndGet();
            notifyAll();
        }
    }

}

class ThreadImpl extends Thread {

    private Foo foo;
    private Runnable runnable;
    private int order;

    public ThreadImpl(Foo foo, Runnable runnable, int order) {
        this.foo = foo;
        this.runnable = runnable;
        this.order = order;
    }

    @Override
    public void run() {
        try {
            switch (order) {
                case 1:
                    foo.first(runnable);
                    break;
                case 2:
                    foo.second(runnable);
                    break;
                case 3:
                    foo.third(runnable);
                    break;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

