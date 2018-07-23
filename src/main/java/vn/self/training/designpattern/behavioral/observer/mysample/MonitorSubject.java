package vn.self.training.designpattern.behavioral.observer.mysample;

public class MonitorSubject extends Observable {
    private int state;

    public MonitorSubject() {
        this.state = 1;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.change();
        this.notifyObservers();
    }
}
