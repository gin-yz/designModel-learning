/*
* Observer
* */

package com.cjs.designModelLearn.observerDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {
    private final List<Observable> observables = new ArrayList<>();

    public CurrentConditionDisplay(Observable observable) {
        this.observables.add(observable);
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (this.observables.contains(o) && o instanceof WeatherData) {
            WeatherData obj = (WeatherData) o;
            double hum = obj.getHumidity();
            double pre = obj.getPressure();
            double tem = obj.getTemperature();
            System.out.printf("%s,%s,%s,%s\n", hum, pre, tem, arg);
        }


    }

}
