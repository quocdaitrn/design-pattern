package vn.self.training.designpattern.behavioral.observer.mysample;

public class ConcreteObserver2 implements Observer {
    @Override
    public void register(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ConcreteObserver2.update");
    }
}
