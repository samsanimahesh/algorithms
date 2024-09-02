package com.mahesh.algorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindKClosestPointsToOrigin {
    public static void main(String[] args) {
        int[][] input = {{3,3},{5,-1},{-2,4}};
//        int[][] input = {{1,3},{-2,2}};

        List<Point> results = new ArrayList<>();
        for(int i=0;i<input.length;i++) {

            int[] point = input[i];

            double distance = Math.sqrt(Math.pow(point[0], 2)+Math.pow(point[1], 2));

            Point result = new Point(point[0], point[1], distance);
            results.add(result);
        }

        List<Point> sortedList = results.stream().sorted(Comparator.comparingDouble(a -> a.distance)).toList();
        for(Point point: sortedList) {
            System.out.println("["+point.x+","+point.y+"]");
        }
    }
}


class Point{
    int x;
    int y;
    double distance;

    Point(int x, int y, double distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }

}
