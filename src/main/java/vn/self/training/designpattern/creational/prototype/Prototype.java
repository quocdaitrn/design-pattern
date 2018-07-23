package vn.self.training.designpattern.creational.prototype;

public abstract class Prototype implements Cloneable {
    protected String description;

    public Prototype() {
        this.description = "Prototype";
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public String getDescription() {
        return description;
    }
}
