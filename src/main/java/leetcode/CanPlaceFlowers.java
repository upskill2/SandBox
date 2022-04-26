package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int freePlaces = 0;
        int zeroCount = n * 2 + 1;

        if(flowerbed.length<1){
            return false;
        }

        if(flowerbed.length==1 && flowerbed[0]==0){
            return true; }

        for (int i = 0; i < flowerbed.length; i++) { //{1, 0, 0, 0, 0, 1}
            if (i == 0 ) {
                if( flowerbed[i] == 0 && flowerbed[i + 1] == 0){

                    freePlaces++;
                    flowerbed[i]=1;
                }

            } else  if (i == flowerbed.length - 1 ) {
                if( flowerbed[flowerbed.length - 1] == 0
                        && flowerbed[flowerbed.length - 1 - 1] == 0){

                    freePlaces++;
                    flowerbed[flowerbed.length - 1]=1;
                }
            }

            else if (flowerbed[i] == 0) {
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 ) {
                    freePlaces++;
                    flowerbed[i]=1;
                }

            }

        }
        return freePlaces>=n ? true : false;
    }

    public static void main(String[] args) {

        int[] flowerbed = {0,0,0,0,1};
        int n = 1;

        new CanPlaceFlowers().canPlaceFlowers(flowerbed, n);
    }

}
