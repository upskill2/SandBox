package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfRecentCallsTest {



    @Test
    public void testInput1() throws InterruptedException {

        int timeInterval0 =1;
        int timeInterval1 =100;
        int timeInterval2 =3001;
        int timeInterval3 =3002;

        NumberOfRecentCalls nc = new NumberOfRecentCalls();
        NumberOfRecentCalls.RecentCounter recentCounter = nc.new RecentCounter();

        System.out.println(Thread.currentThread().getName());
        Thread t =new Thread(String.valueOf(recentCounter.ping(timeInterval0)));
        Thread.sleep(1);
        t.start();
        assertEquals(1,recentCounter.requests);

        Thread.sleep(1);
        Thread t1 =new Thread(String.valueOf(recentCounter.ping(timeInterval1)));
        t1.start();
        assertEquals(2,recentCounter.requests);

        Thread.sleep(1);
        Thread t2 =new Thread(String.valueOf(recentCounter.ping(timeInterval2)));
        t2.start();
        assertEquals(3,recentCounter.requests);

        Thread.sleep(1);
        Thread t3 =new Thread(String.valueOf(recentCounter.ping(timeInterval3)));
        t3.start();
        assertEquals(3,recentCounter.requests);
    }

    @Test
    public void testInput2() throws InterruptedException {

        int timeInterval0 =642;
        int timeInterval1 =1849;
        int timeInterval2 =4921;
        int timeInterval3 =5936;
        int timeInterval4 =5957;

        NumberOfRecentCalls nc = new NumberOfRecentCalls();
        NumberOfRecentCalls.RecentCounter recentCounter = nc.new RecentCounter();

        System.out.println(Thread.currentThread().getName());
        Thread t =new Thread(String.valueOf(recentCounter.ping(timeInterval0)));
        Thread.sleep(1);
        t.start();
        assertEquals(1,recentCounter.requests);

        Thread.sleep(1);
        Thread t1 =new Thread(String.valueOf(recentCounter.ping(timeInterval1)));
        t1.start();
        assertEquals(2,recentCounter.requests);

        Thread.sleep(1);
        Thread t2 =new Thread(String.valueOf(recentCounter.ping(timeInterval2)));
        t2.start();
        assertEquals(1,recentCounter.requests);

        Thread.sleep(1);
        Thread t3 =new Thread(String.valueOf(recentCounter.ping(timeInterval3)));
        t3.start();
        assertEquals(2,recentCounter.requests);

        Thread.sleep(1);
        Thread t4 =new Thread(String.valueOf(recentCounter.ping(timeInterval4)));
        t4.start();
        assertEquals(3,recentCounter.requests);

    }

    @Test
    public void testInput3() throws InterruptedException {

        int timeInterval0 =1123;
        int timeInterval1 =1785;
        int timeInterval2 =2338;
        int timeInterval3 =3576;
        int timeInterval4 =5881;

        NumberOfRecentCalls nc = new NumberOfRecentCalls();
        NumberOfRecentCalls.RecentCounter recentCounter = nc.new RecentCounter();

        System.out.println(Thread.currentThread().getName());
        Thread t =new Thread(String.valueOf(recentCounter.ping(timeInterval0)));
        Thread.sleep(1);
        t.start();
        assertEquals(1,recentCounter.requests);

        Thread.sleep(1);
        Thread t1 =new Thread(String.valueOf(recentCounter.ping(timeInterval1)));
        t1.start();
        assertEquals(2,recentCounter.requests);

        Thread.sleep(1);
        Thread t2 =new Thread(String.valueOf(recentCounter.ping(timeInterval2)));
        t2.start();
        assertEquals(3,recentCounter.requests);

        Thread.sleep(1);
        Thread t3 =new Thread(String.valueOf(recentCounter.ping(timeInterval3)));
        t3.start();
        assertEquals(4,recentCounter.requests);

        Thread.sleep(1);
        Thread t4 =new Thread(String.valueOf(recentCounter.ping(timeInterval4)));
        t4.start();
        assertEquals(2,recentCounter.requests);

    }

}