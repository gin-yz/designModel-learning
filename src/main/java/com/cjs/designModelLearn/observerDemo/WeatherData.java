/*
* subject
* */

package com.cjs.designModelLearn.observerDemo;

import java.util.Observable;

import static java.lang.String.format;

public class WeatherData extends Observable {
    private double temperature;
    private double humidity;
    private double pressure;

    public void setMesurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        System.out.printf("set t:%s,h:%s,p:%s%n",temperature,humidity,pressure);
        sendMessages(temperature+humidity+pressure);
    }

    private void sendMessages(double msg){
        setChanged();
        notifyObservers(msg);
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
