package leetcode;

import leetcode.ImplementQueueUsingStacks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementQueueUsingStacksTest {

   @Test
   public void ImplementQueueUsingStacksTest(){
        ImplementQueueUsingStacks is = new ImplementQueueUsingStacks();
        ImplementQueueUsingStacks.MyQueue myQueue = is.new MyQueue();


        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
           assertEquals(1,myQueue.pop());
           assertEquals(2,myQueue.peek());
    }

}