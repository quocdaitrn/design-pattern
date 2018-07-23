package vn.self.training.designpattern.behavioral.observer.sample.library;

public class Setup {
    private Driver driver;
    private Thermometer thermometer;

    public Setup() {
        this.thermometer = new Thermometer();
        this.driver = new Driver(this.thermometer);
        this.driver.start();
    }

    public void shutdown() {
        this.driver.shutdown();
    }

    public Thermometer getThermometer() {
        return this.thermometer;
    }
}
