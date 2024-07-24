package course;

public class FindPeak {
    public int findPeak(int[] arr) {

     if(arr.length==1) return 0;
        int[] arr2 = new int[arr.length + 2];

        arr2[0] = 0;
        arr2[arr2.length - 1] = 0;
        for (int i = 1; i < arr2.length - 1; i++) {
            arr2[i] = arr[i-1];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr2.length-1; i++) {
            if(arr2[i]>=arr2[i-1] && arr2[i]>=arr2[i+1]){
                return i-1;
             //   max = Math.max(max,  arr2[i]);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        FindPeak f = new FindPeak();
        f.findPeak(new int[]{-3, -1, 9, 10, 10});

    }
}
