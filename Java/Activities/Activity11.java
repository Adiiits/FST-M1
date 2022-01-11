package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

    public static void main(String[] args) {

        Map<Integer, String> colors = new HashMap<>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Blue");
        colors.put(4, "Yellow");
        colors.put(5, "Pink");

        colors.remove(4);
        System.out.println("Is green present? " + colors.containsValue("Green"));
        System.out.println("Size of the map is: " + colors.size());
    }
}
