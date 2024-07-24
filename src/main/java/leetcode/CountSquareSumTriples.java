package leetcode;

public class CountSquareSumTriples {

    public int countTriples(int n) {

        int res = 0;
        for (int i = 1; i <=n; i++) {
            for (int j = i + 1; j <=n ; j++) {
                for (int k = 0; k < n; k++) {
                    if((i*i + j*j)==k*k){
                        res++;
                    }

                }
            }

        }
        return res;
    }

    public static void main(String[] args) {



    }
}
