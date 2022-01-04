package day02;

import java.util.List;

public class Hiking {

    private double GPS_coordinates;
    private double height;

    public double getPlusElevation(List<Double> heights) {
        double sum = 0;
        for (int i = 0; i < heights.size() - 1; i++) {
            if (heights.get(i + 1) > heights.get(i)) {
                sum += (heights.get(i + 1) - heights.get(i));
            }
        }
        return sum;
    }
}
