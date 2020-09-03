package com.cjs.designModelLearn.ObserverLearnTest;

import com.cjs.designModelLearn.observerDemo.CurrentConditionDisplay;
import com.cjs.designModelLearn.observerDemo.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class observerTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer observer = new CurrentConditionDisplay(weatherData);

        weatherData.setMesurements(1,2,3);
    }
}
