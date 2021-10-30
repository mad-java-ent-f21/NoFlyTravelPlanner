package com.jvjohnson1.no_fly.entity;

import java.util.Objects;

public class Destination {

    private int DestinationID;
    private String type;
    private String location;
    private int nearestAmtrak;
    private int nearestGrayhound;
    private int nearestPort;
    private int nearestRentalCar;
    private String Activity;

    public Destination() {

    }

    public Destination(int destinationID, String type, String location, int nearestAmtrak, int nearestGrayhound, int nearestPort, int nearestRentalCar, String activity) {
        DestinationID = destinationID;
        this.type = type;
        this.location = location;
        this.nearestAmtrak = nearestAmtrak;
        this.nearestGrayhound = nearestGrayhound;
        this.nearestPort = nearestPort;
        this.nearestRentalCar = nearestRentalCar;
        Activity = activity;
    }

    public int getDestinationID() {
        return DestinationID;
    }

    public void setDestinationID(int destinationID) {
        DestinationID = destinationID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNearestAmtrak() {
        return nearestAmtrak;
    }

    public void setNearestAmtrak(int nearestAmtrak) {
        this.nearestAmtrak = nearestAmtrak;
    }

    public int getNearestGrayhound() {
        return nearestGrayhound;
    }

    public void setNearestGrayhound(int nearestGrayhound) {
        this.nearestGrayhound = nearestGrayhound;
    }

    public int getNearestPort() {
        return nearestPort;
    }

    public void setNearestPort(int nearestPort) {
        this.nearestPort = nearestPort;
    }

    public int getNearestRentalCar() {
        return nearestRentalCar;
    }

    public void setNearestRentalCar(int nearestRentalCar) {
        this.nearestRentalCar = nearestRentalCar;
    }

    public String getActivity() {
        return Activity;
    }

    public void setActivity(String activity) {
        Activity = activity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Destination)) return false;
        Destination that = (Destination) o;
        return getDestinationID() == that.getDestinationID() && Objects.equals(getLocation(), that.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDestinationID(), getLocation());
    }

    @Override
    public String toString() {
        return "Destination{" +
                "DestinationID=" + DestinationID +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", nearestAmtrak=" + nearestAmtrak +
                ", nearestGrayhound=" + nearestGrayhound +
                ", nearestPort=" + nearestPort +
                ", nearestRentalCar=" + nearestRentalCar +
                ", Activity='" + Activity + '\'' +
                '}';
    }
}
