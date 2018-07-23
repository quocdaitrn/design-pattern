package vn.self.training.designpattern.behavioral.templatemethod;

public class PersonQuery extends AbstractQuery {
    @Override
    public String getQueryString() {
        return "select * from persons";
    }
}
