package vn.self.training.designpattern.behavioral.observer.sample.client;

import vn.self.training.designpattern.behavioral.observer.sample.library.Setup;
import vn.self.training.designpattern.behavioral.observer.sample.library.Thermometer;

public class PollingThermometerClient {
    private final static long SEC_TO_RUN = 20;
    private final static long MS_BETWEEN_POLLS = 50;

    public static void main(String[] args) {
        Setup s = new Setup();
        Thermometer t = s.getThermometer();
        long count = SEC_TO_RUN * 1000 / MS_BETWEEN_POLLS;
        try {
            for (int i = 0; i < count; i++) {
                Thread.sleep(MS_BETWEEN_POLLS);
                System.out.println(
                        "Checking temprature #"
                                + i
                                + ": "
                                + t.getTempratureCelcius()
                                + ", "
                                + t.getTempratureKelvin()
                                + ", "
                                + t.getTemperatureFahrenheit()
                );
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.shutdown();
    }
}
