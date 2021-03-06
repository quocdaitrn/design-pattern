package vn.self.training.designpattern.behavioral.observer.mysample;

public class ConcreteObserver1 implements Observer {
    @Override
    public void register(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ConcreteObserver1.update");
    }
}
