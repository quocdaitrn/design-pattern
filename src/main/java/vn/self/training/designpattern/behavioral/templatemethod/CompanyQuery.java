package vn.self.training.designpattern.behavioral.templatemethod;

public class CompanyQuery extends AbstractQuery {
    @Override
    public String getQueryString() {
        return "select * from companies";
    }
}
