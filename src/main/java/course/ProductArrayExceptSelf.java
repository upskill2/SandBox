package course;

public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] arr) {


        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int res = 1;
            for (int j = 0; j < arr.length; j++) {
                int temp = j == i ? 1 : arr[j];
                res *= temp;
            }
            result[i] = res;
        }

        return result;
    }

    public static void main(String[] args) {
        ProductArrayExceptSelf self = new ProductArrayExceptSelf();
        self.productExceptSelf(new int[]{2, 5, 3, 4});
    }

}
