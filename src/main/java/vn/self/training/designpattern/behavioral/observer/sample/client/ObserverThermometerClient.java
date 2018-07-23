package vn.self.training.designpattern.behavioral.observer.sample.client;

import vn.self.training.designpattern.behavioral.observer.sample.library.Setup;
import vn.self.training.designpattern.behavioral.observer.sample.library.Thermometer;

public class ObserverThermometerClient implements java.util.Observer {

    public ObserverThermometerClient() {
    }

    @Override
    public void update(java.util.Observable o, Object args) {
        Thermometer t = (Thermometer) o;
        System.out.println(
                "Checking temprature"
                        + ": "
                        + t.getTempratureCelcius()
                        + ", "
                        + t.getTempratureKelvin()
                        + ", "
                        + t.getTemperatureFahrenheit()
        );
    }

    public static void main(String[] args) {
        Setup s = new Setup();
        ObserverThermometerClient client = new ObserverThermometerClient();
        s.getThermometer().addObserver(client);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.shutdown();
    }

}
