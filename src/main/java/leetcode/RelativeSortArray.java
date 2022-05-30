package leetcode;

import java.util.*;

public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            myMap.put(arr2[i], i);
        }

        List<Integer> myList = new ArrayList<>();
        for (int e : arr1
        ) {
            myList.add(e);

        }
        Collections.sort(myList, Comparator.naturalOrder());

        Collections.sort(myList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer mapIndex1 = myMap.get(o1);
                Integer mapIndex2 = myMap.get(o2);
                if (mapIndex1 == null) {
                    if(mapIndex2==null){
                        return 0;
                    }
                    return 1;
                }
                if (mapIndex2 == null) {
                    return -1;
                }

                return mapIndex1.compareTo(mapIndex2);
            }

        });


        int[] asb = new int[myList.size()];
        for (int i = 0; i < asb.length; i++) {
            asb[i] = myList.get(i);
        }


        return asb;
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, arr2 = {2, 1, 4, 3, 9, 6};
        int[] arr3 = {28, 6, 22, 8, 44, 17}, arr4 = {22, 28, 8, 6};
        int[] arr5 = {26, 21, 11, 20, 50, 34, 1, 18}, arr6 = {21, 11, 26, 20};
        int[] arr7 = {817, 477, 706, 163, 152, 873, 430, 620, 136, 6, 486, 412, 164, 797, 85, 775, 947, 30, 555, 834, 854, 715, 109, 262, 190, 734, 657, 604, 413, 961, 305, 242, 935, 940, 876, 625, 379, 110, 881, 698, 390, 616, 446, 810, 350, 426, 862, 642, 224, 480, 187, 618, 507, 991, 424, 67, 298, 244, 225, 879, 699, 917, 874, 664, 155, 292, 893, 890, 757, 20, 202, 359, 853, 291, 261, 275, 574, 341, 229, 332, 727, 984, 17, 145, 146, 65, 157, 263, 561, 91, 878, 612, 469, 268, 4, 533, 554, 758, 713, 425},
              arr8 = {190, 390, 224, 876, 163, 862, 109, 810, 616, 854, 698, 379, 834, 486, 625, 734, 30, 775, 715, 620, 426, 242, 873, 136, 164, 935, 430, 305, 412, 706, 413, 657, 350, 477, 947, 262, 881, 604, 797, 555, 817, 480, 642, 152, 85, 446, 961, 110, 940, 6};

        RelativeSortArray rs = new RelativeSortArray();

     //   rs.relativeSortArray(arr1, arr2);
     //   rs.relativeSortArray(arr3, arr4);
     //   rs.relativeSortArray(arr5, arr6);
       rs.relativeSortArray(arr7, arr8);


    }

}

