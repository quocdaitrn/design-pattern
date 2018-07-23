package vn.self.training.designpattern.behavioral.observer.mysample;

public class Main {
    public static void main(String args[]) {
        Observable subject = new MonitorSubject();

        Observer observer1 = new ConcreteObserver1();
        observer1.register(subject);
        Observer observer2 = new ConcreteObserver2();
        observer2.register(subject);

        ((MonitorSubject) subject).setState(2);
        ((MonitorSubject) subject).setState(3);
    }
}
