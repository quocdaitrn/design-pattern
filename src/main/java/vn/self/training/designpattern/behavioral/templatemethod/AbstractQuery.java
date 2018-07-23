package vn.self.training.designpattern.behavioral.templatemethod;

public abstract class AbstractQuery implements Query {
    @Override
    public Result excute() {
        Connection connection = new Connection();
        Result r = connection.excuteQuery(this.getQueryString());
        connection.close();
        return r;
    }

    public abstract String getQueryString();
}
