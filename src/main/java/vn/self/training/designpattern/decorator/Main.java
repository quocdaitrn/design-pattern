package vn.self.training.designpattern.decorator;

public class Main {
    public static void main(String args[]) {
        IngredientInterface stuff = new Pearl(new Pubbling(new MilkTea()));
        System.out.println("You ordered: " + stuff.getDescription() + " -> $" + stuff.cost());
    }
}
