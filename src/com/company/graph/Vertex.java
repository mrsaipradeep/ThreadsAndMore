package com.company.graph;

import java.util.Objects;

public class Vertex {

    private String trip;

    public Vertex(String trip) {
        this.trip = trip;
    }

    public String getTrip() {
        return trip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(trip, vertex.trip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trip);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "trip=" + trip +
                '}';
    }
}
