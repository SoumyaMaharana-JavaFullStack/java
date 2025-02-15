package com.wipro.java.designpattern.builderpattern.builder;

import com.wipro.java.designpattern.builderpattern.car.Car;
import com.wipro.java.designpattern.builderpattern.car.CarType;
import com.wipro.java.designpattern.builderpattern.component.Engine;
import com.wipro.java.designpattern.builderpattern.component.GPSNavigator;
import com.wipro.java.designpattern.builderpattern.component.Transmission;
import com.wipro.java.designpattern.builderpattern.component.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}