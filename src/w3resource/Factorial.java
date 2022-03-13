package w3resource;

public class Factorial {


    public static Integer factorial(Integer n) {
        int fact2 = 1;

        for (int i = n; i > 0; i--) {

            fact2=i*fact2;

        }
        return fact2;
    }

    public static void main(String[] args) {

        System.out.println(factorial(7) + " Factorial 7 should be 5040");
    }

}
