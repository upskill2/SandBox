
package leetcode;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class NumberOfRecentCalls {

    class RecentCounter implements Runnable {

        LinkedList<Integer> list;
        int requests = 0;

        public RecentCounter () {
            this.list =  new LinkedList<>();

        }

        public int ping(int t) throws InterruptedException {

            long timeNow =  TimeUnit.MILLISECONDS.toMillis(System.currentTimeMillis());
   //         System.out.println(timeNow + " time unit");
            int treeSec = 3001;
            String timeStamp = new SimpleDateFormat("yyyy-mm-dd.HH:mm:ss.ms").format(System.currentTimeMillis());
            System.out.println(timeStamp + " time in ping");
            System.out.println(t);
            System.out.println("------------------------");

  //          System.out.println(requests+ " requests");

           list.add(t);
            requests++;

            if (list.size()>1){
              return  slideWindow(list);
            }

            return requests;

        }


        @Override
        public void run() {

            for (int i = 0; i < 5; i++) {
                try {
                    ping(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
                    }

    public int slideWindow(LinkedList<Integer> list){
            if ((list.getLast() - list.getFirst() > 3000)) {
                requests--;
                list.removeFirst();
                slideWindow(list);
            } return requests;

    }

    }
    public static void main(String[] args) throws InterruptedException {

        //set interval
/*
        int timeInterval0 =1;
        int timeInterval1 =100;
        int timeInterval2 =3001;
        int timeInterval3 =3002;*/

/*
        int timeInterval0 =642;
        int timeInterval1 =1849;
        int timeInterval2 =4921;
        int timeInterval3 =5936;
        int timeInterval4 =5957;
*/


        int timeInterval0 =1123;
        int timeInterval1 =1785;
        int timeInterval2 =2338;
        int timeInterval3 =3576;
        int timeInterval4 =5881;


        NumberOfRecentCalls nc = new NumberOfRecentCalls();
        RecentCounter recentCounter = nc.new RecentCounter();

   //      int time = Integer.parseInt(new SimpleDateFormat("yyyy-mm-dd.HH:mm:ss.ms").format(System.currentTimeMillis()));

        System.out.println(Thread.currentThread().getName());
        Thread t =new Thread(String.valueOf(recentCounter.ping(timeInterval0)));
        Thread.sleep(timeInterval0);
        t.start();

        Thread.sleep(timeInterval1);
        Thread t1 =new Thread(String.valueOf(recentCounter.ping(timeInterval1)));
        t1.start();

        Thread.sleep(timeInterval2);
        Thread t2 =new Thread(String.valueOf(recentCounter.ping(timeInterval2)));
        t2.start();

        Thread.sleep(timeInterval3);
        Thread t3 =new Thread(String.valueOf(recentCounter.ping(timeInterval3)));
        t3.start();

        Thread.sleep(timeInterval4);
        Thread t4 =new Thread(String.valueOf(recentCounter.ping(timeInterval4)));
        t4.start();
    }
}
