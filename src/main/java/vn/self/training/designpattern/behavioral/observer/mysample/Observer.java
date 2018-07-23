package vn.self.training.designpattern.behavioral.observer.mysample;

public interface Observer {
    void register(Observable o);
    void update(Observable o, Object arg);
}
