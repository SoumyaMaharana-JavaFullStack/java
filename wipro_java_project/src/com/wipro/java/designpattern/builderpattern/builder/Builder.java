package com.wipro.java.designpattern.builderpattern.builder;

import com.wipro.java.designpattern.builderpattern.car.CarType;
import com.wipro.java.designpattern.builderpattern.component.Engine;
import com.wipro.java.designpattern.builderpattern.component.GPSNavigator;
import com.wipro.java.designpattern.builderpattern.component.Transmission;
import com.wipro.java.designpattern.builderpattern.component.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}