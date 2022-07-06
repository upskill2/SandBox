package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ParkingSystem {

    Map<Integer, Integer> myMap = new HashMap<>();

    public ParkingSystem(int big, int medium, int small) {

        myMap.put(1, big);
        myMap.put(2, medium);
        myMap.put(3, small);

    }

    public boolean addCar(int carType) {

        myMap.put(carType, myMap.get(carType) - 1);

        if (myMap.get(carType) > -1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem obj = new ParkingSystem(1, 1, 0);

        obj.addCar(1);
        obj.addCar(2);
        obj.addCar(3);
        obj.addCar(1);
    }
}
