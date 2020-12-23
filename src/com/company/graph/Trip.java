package com.company.graph;

public class Trip {
    private final String start;
    private final String end;

    public Trip(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }


    public String getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "start='" + start + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}
