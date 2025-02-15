package com.wipro.java.designpattern.builderpattern.director;

import com.wipro.java.designpattern.builderpattern.builder.Builder;
import com.wipro.java.designpattern.builderpattern.car.CarType;
import com.wipro.java.designpattern.builderpattern.component.Engine;
import com.wipro.java.designpattern.builderpattern.component.GPSNavigator;
import com.wipro.java.designpattern.builderpattern.component.Transmission;
import com.wipro.java.designpattern.builderpattern.component.TripComputer;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}