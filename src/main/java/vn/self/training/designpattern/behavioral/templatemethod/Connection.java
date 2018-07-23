package vn.self.training.designpattern.behavioral.templatemethod;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Connection {
    public Result excuteQuery(String query) {
        Result result = new Result();
        if (StringUtils.endsWithIgnoreCase(query,"persons")) {
            result.setResult(Arrays.asList("Jim", "David", "Anna"));
        } else {
            result.setResult(Arrays.asList("Pepsi", "Coca", "Sabeco"));
        }

        return result;
    }

    public void close() {
        System.out.println("Closed connnection");
    }
}
