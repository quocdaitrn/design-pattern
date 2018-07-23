package vn.self.training.designpattern.behavioral.templatemethod;

public class Main {
    public static void main(String args[]) {
        Query queryPerson = new PersonQuery();
        Result persons = queryPerson.excute();
        System.out.println(persons);

        Query queryCompanies = new CompanyQuery();
        Result companies = queryCompanies.excute();
        System.out.println(companies);
    }
}
