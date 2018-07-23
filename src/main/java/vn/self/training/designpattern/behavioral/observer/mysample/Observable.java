package vn.self.training.designpattern.behavioral.observer.mysample;

import java.util.Vector;

public class Observable {
    private boolean isChange;
    private Vector<Observer> obs;

    public Observable() {
        this.isChange = false;
        this.obs = new Vector<>();
    }

    public synchronized void addObserver(Observer o) {
        if (!obs.contains(o)) {
            this.obs.add(o);
        }
    }

    public synchronized void deleteObserver(Observer o) {
        this.obs.remove(o);
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        if (!hasChange()) {
            return;
        }

        this.clearChange();

        obs.stream().forEach(o -> {
            o.update(this, arg);
        });
    }

    public void change() {
        this.isChange = true;
    }

    public void clearChange() {
        this.isChange = false;
    }

    public boolean hasChange() {
        return this.isChange;
    }
}
