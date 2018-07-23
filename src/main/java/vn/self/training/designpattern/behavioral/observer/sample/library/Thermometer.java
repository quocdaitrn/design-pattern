package vn.self.training.designpattern.behavioral.observer.sample.library;

public class Thermometer extends java.util.Observable {
    public double tempratureInKelvin = -1.0;
    private final String KELVIN_FORMAT = "%,.1fK";
    private final String CELCIUS_FORMAT = "%,.1fC";
    private final String FAHRENHEIT_FORMAT = "%,.1fF";

    public Thermometer() {
    }

    void driverValue(long value) {
        this.tempratureInKelvin = value / 100.0;
        super.setChanged();
        super.notifyObservers();
    }

    public String getTempratureKelvin() {
        return String.format(KELVIN_FORMAT, this.tempratureInKelvin);
    }

    public String getTempratureCelcius() {
        return String.format(CELCIUS_FORMAT, (this.tempratureInKelvin - 273.15));
    }

    public String getTemperatureFahrenheit() {
        return String.format(FAHRENHEIT_FORMAT, (this.tempratureInKelvin - 273.15) * 1.8000 + 32.0);
    }
}