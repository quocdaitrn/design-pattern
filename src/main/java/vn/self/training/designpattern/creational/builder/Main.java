package vn.self.training.designpattern.creational.builder;

public class Main {
    public static void main(String args[]) {
        Person person = Person.Builder.create()
                .name("Dai")
                .job("Developer")
                .build();

        System.out.println("Name: " + person.getName());
        System.out.println("Job: " + person.getJob());
    }
}
