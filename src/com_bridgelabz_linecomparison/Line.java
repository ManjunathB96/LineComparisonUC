package com_bridgelabz_linecomparison;

public class Line {
    Point p1;
    Point p2;

    float length;

    float getLength() {

        return (float) Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    }
}


