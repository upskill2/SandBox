package oca;

public class Test {

    public double test(double d) {
        if (d > 0.5) return 1;
        try {
         //   if (d < 0.1) throw new Exception("Too small!"); // line t1
        } catch (Exception e) {
           // return 666; // line t2
        } finally {
            return 42; // line t3
        }
    }

    public static void main(String args[]) {
        System.out.println(new Test().test(Math.random()));
    }

}
