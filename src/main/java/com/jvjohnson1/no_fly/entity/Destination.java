package com.jvjohnson1.no_fly.entity;
import java.lang.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "Destination")
@Table(name = "destinations")
public class Destination {

    @Id
    @Column(name = "DestinationID", nullable = false)
    @GenericGenerator(name = "native",strategy = "native")
    private int DestinationID;

    @Column(name = "type")
    private String type;

    @Column(name = "location")
    private String location;

    @Column(name = "nearest_Amtrak")
    private int nearestAmtrak;

    @Column(name = "nearest_Grayhound")
    private int nearestGrayhound;

    @Column(name = "nearest_port")
    private int nearestPort;

    @Column(name = "rental_car")
    private int nearestRentalCar;

    @Column(name = "activity")
    private String Activity;

    @Column(name = "overnight")
    private String overnight;

    public Destination() {

    }

    public Destination(int destinationID, String type, String location, int nearestAmtrak, int nearestGrayhound, int nearestPort, int nearestRentalCar, String activity, String night) {
        DestinationID = destinationID;
        this.type = type;
        this.location = location;
        this.nearestAmtrak = nearestAmtrak;
        this.nearestGrayhound = nearestGrayhound;
        this.nearestPort = nearestPort;
        this.nearestRentalCar = nearestRentalCar;
        Activity = activity;
        overnight = night;
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

    public String getOvernight() {
        return Activity;
    }

    public void setOvernight(String activity) {
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
                ", overnight='" + overnight + '\'' +
                '}';
    }
}
